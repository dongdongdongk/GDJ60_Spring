console.log("Hello World"); // console.log() 개발자 도구의 콘솔(console)에 메시지를 출력하는 역할


//변수 선언과 대입 
//데이터타입 변수명;
let num1=3; //let 값이 대입되고 결정
num1= "abc"; //let 덕분에 String 타입으로 

//옛날 버전, Hoisting 에 문제가 발생, 쓰지말것 
var num2 = 4;


const num3=5; //const 상수형 변수 한번 대입되면 끝(final)
//num3 = 6;
console.log(num3);

//자바스크립트 에서는 cost,let 뿐

console.log('NUM1 : ' + num1);

//연산자 
num4 = num1 + num2; //-, *, /, %

num4 = num1 > num2; // <, >=, <=, ==, !=


num4++; //증감 연산자 동일 

num1 = 3;
num2 = '3';

console.log(typeof num4); // typeof 타입을 확인하는 

console.log(num1==num2); //타입과 상관업이 같은갑이면 true
console.log(num1===num2); //=== 는 값도 같아야 하고 type도 같아야 true