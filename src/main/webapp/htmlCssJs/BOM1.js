
const btn = document.getElementById('btn'); //가져오기만 한것
const btn2 = document.getElementById('btn2');
const btn3 = document.getElementById('btn3');

btn3.addEventListener("click",function(){
    let c4 = document.getElementById('c4');
    console.log(c4.value);

})






btn2.addEventListener("click",function(){
    //1번방법
    let c3 = document.getElementById("c3");
    let v = c3.title;
    console.log(v)


    //2번방법
    v = c3.getAttribute('title');
});



btn.addEventListener("click", function(){
    
    let c2 = window.document.getElementById("c2");
    console.log(c2.innerText);
    console.log(c2.innerHTML);
    //c2.innerText='text';
    c2.innerHTML='<img src="../resources/images/test1.jpg">';
});
// addEventListener 이벤트를 듣고있는 ()











let c1 = window.document.getElementById("c1");
//alert(c1);
//console.log(c1);
console.log(c1.innerText); 
console.log(c1.innerHTML);
//c1.innerText='Change Text';


