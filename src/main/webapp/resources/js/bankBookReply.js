const replyAdd = document.getElementById("replyAdd");
const replyContents = document.getElementById("replyContents");
const commentListResult = document.getElementById("commentListResult");

replyAdd.addEventListener("click",function(){
    let xhttp = new XMLHttpRequest();

    //URL, Method 정보
    xhttp.open("POST","../bankBookComment/add");
 
    //header 정보
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    //요청 발생 POST일 경우 parameter 전송
    xhttp.send("contents="+replyContents.value+"&bookNum="+replyAdd.getAttribute('data-book-bookNum'));
 
    //응답 처리
    xhttp.addEventListener("readystatechange", function(){
        if(this.readyState==4 && this.status==200){
            if(this.responseText.trim()==1){
                alert('댓글이 등록 되었습니다.')
                replyContents.value="";
                getList();
            }else {
                alert('댓글 등록에 실패하였습니다.')
            }
        }
     })
})

//bookNum으로 댓글목록
getList(1);
function getList(page){

    let count = 0;

    let xhttp = new XMLHttpRequest();

    xhttp.open("GET", "/bankBookComment/list?bookNum="+replyAdd.getAttribute('data-book-bookNum')+"&page="+page)

    xhttp.send();

    xhttp.addEventListener("readystatechange", function(){
        if(this.readyState==4 && this.status==200){
            commentListResult.innerHTML = this.responseText.trim();
            count ++;
        }
    })
    
    //0이 출력 : 비동기 방식이기 때문에
    console.log("count :"+count);
}

//page요청할 수 있도록 만든 이벤트
commentListResult.addEventListener("click",function(e){
    let pageLink = e.target;
    if(pageLink.classList.contains("page-link")){
        let page = pageLink.getAttribute('data-board-page');
        getList(page);
    }

    e.preventDefault();

})


//delete

commentListResult.addEventListener("click",function(e){
    let del= e.target;
    if(del.classList.contains("del")){
        let xhttp = new XMLHttpRequest();
        xhttp.open("POST", "../bankBookComment/delete");
        xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhttp.send("num="+del.getAttribute("data-comment-num"));

        xhttp.addEventListener("readystatechange",function(){
            if(this.readyState==4&&this.status==200) {
                let result  = this.responseText.trim();
                if(result>0) {
                    alert("댓글이 삭제 되었습니다.")
                    getList(1);
                }else {
                    alert("삭제 실패");
                }
            }
        })

    }

})

//update

commentListResult.addEventListener("click",function(e){
    let updateButton = e.target;
    if(updateButton.classList.contains("update")){
       let num = updateButton.getAttribute("data-comment-num");
       let contents = document.getElementById("contents" + num);
       contents.firstChild.removeAttribute("readonly");
       let btn = document.createElement("button");
       let attr = document.createAttribute("class");
       attr.value = "brn brn-primary";
       btn.setAttribute(attr);
       contents.appendChild(btn);
       attr = document.createTextNode("확인");
       btn.appendChild(attr);
       
       btn.addEventListener("click", function(){
            let xhttp = new XMLHttpRequest();
            xhttp.open("POST", "../bankBookComment/update");
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhttp.send("num="+num+"&contents="+contents.firstChild.value);
            xhttp.addEventListener("readystatechange",function(){
                if(this.readyState==4&&this.status==200) {
                    let result  = this.responseText.trim();
                    if(result>0) {
                        alert("수정 성공.")
                        getList(1);
                    }else {
                        alert("수정 실패");
                    }
                }
            })

       })
       
       

    }

})