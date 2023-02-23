const b1 = document.getElementById("b1");//button
const p1 = document.getElementById("p1");//div
const b2 = document.getElementById("b2");//button
const p2 = document.getElementById("p2");//div
const naver = document.getElementById("naver");//a

naver.addEventListener('click',function(event){
    console.log("naver click");
    event.preventDefault(); 
});

//캡처링 중단
b1.addEventListener('click',function(e){

    console.log('Button Click');
    console.log(e);

},true);


p1.addEventListener('click',function(event){

    console.log('Div click');
    console.log(event);
    event.stopPropagation(); //부모에게 받아온 이벤트를 스탑
},true);


//버블링 중단


b2.addEventListener('click',function(e){

    console.log('Button2 Click');
    console.log(e);
   // e.stopPropagation(); //자식에서 나온 이벤트 스탑
    console.log("Button This : " , this)
},false);


p2.addEventListener('click',function(event){

    console.log('Div2 click');
    console.log(event);
    //event.stopPropagation();
    console.log("CurrentTarget : ", event.currentTarget); //div
    console.log("Target : ", event.target); //버튼
    console.log("This : ",this);
},false);