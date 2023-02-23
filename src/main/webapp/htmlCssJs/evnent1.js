const d1 = document.getElementById("d1");
const input1= document.getElementById("input1");
const input2= document.getElementById("input2");
const input3= document.getElementById("input3");
const btn = document.getElementById("btn");
d1.addEventListener("click",function(){

console.log("click event");

});

d1.addEventListener("mouseenter", function(){ //마우스가 위로 갔을때 

    console.log("Mouse Enter Event");

});

input1.addEventListener("keyup",function(){ //키를 누르고 땔때 

    console.log("keyup Event");
});

input2.addEventListener("focus", function(){ //포커스 입력 깜박 들어갔을때  

    console.log("focus Event");

});


input2.addEventListener("blur", function(){ //포커스를 잃어버렸을때

    console.log("blur Event");

});

input2.addEventListener("change", function(){ 

    console.log("change Event");

});
input3.addEventListener("change", function(){ 

    console.log(input3.value);

}, false);


btn.onclick=function(){
    input2.focus(); //강제실행 
}