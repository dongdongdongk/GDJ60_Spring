const btn = document.getElementById("btn");
const btn2 = document.getElementById("btn2");

let r1 =document.getElementById("r1");

let c1 = document.getElementById("c1");

let t1 = document.getElementById("t1");


const s1 = document.getElementById("s1");

const s2 = document.getElementById("s2");
const food = document.getElementsByClassName("food");

//배열
const options = document.getElementsByClassName ("options");

const ch = document.getElementsByClassName("ch");

for(let i=0;i<ch.length;i++){
    ch[i].addEventListener("click",function(){
            console.log(this.checked);   //this checked 자기자신 
            for(let j=0;j<ch.length;j++){
                ch[i].checked=this.checked;
            }
        })

}


ch.addEventListener("click",function(){
    console.log("click")

})


s1.addEventListener("click",function(){

    for(let i =0;i<options.length;i++) {
        if(options[i].selected){
            console.log(options[i].value)
            break;
        }
    }
});

s2.addEventListener("click", foods(){
    
    for(let i=0;i<foods.length;i++){
        console.log(food[i].value)
      }







btn.addEventListener("click",function() {
let result='';

    for(let i=0;i<r1.value;i++){
        result = result + "<tr>";
        for(let j=0;j<c1.value;j++){
            result = result+"<td>"
            result = result+"</td>"
        }
        result = result + "</tr>"
    }
    t1.innerHTML=result;
});


