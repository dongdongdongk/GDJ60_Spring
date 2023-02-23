
//전역변수
let n = 'iu';
var odl = 'iu';

// function 선언

function f1 () {  //함수는 호출이 필요
    console.log("function Test");
    console.log(n); //전역 변수를 통해서 출력
    var old = "winter";
}


//매개변수 선언시 let,const 는 생략 해야함 
function f2(n1, n2) {
    return n1+n2;
}


//fuction 호출
f1();
let result = f2(1,2)
console.log(result);





let fun= function () {  //익명함수는 변수에 담을 수 있다.
    console.log('익명함수');
    return 1;
}

//익명함수 호출

fun();


function f3 (f) {  //매개변수로 함수도 받을 수 있다.
    console.log("f3 : ", f(),1);                 //단 이때는 변수명으로 
}

f3(fun())







const d1 = document.getElementById("d1");


function callback1 (){
    console.log("CallBack1");
}

let callback2 = function() {
    console.log("Callback2")
}

//다른 곳에서도 같은 함수를 사용하고 싶을 때 
d1.addEventListener("click",callback1());
d1.addEventListener("click",callback2());
//여기에서만 사용하는 함수

d1.addEventListener("click",function(){
    callback1();
    callback2();
});