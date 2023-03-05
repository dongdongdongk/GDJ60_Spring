const replyAdd = document.getElementById("replyAdd");
const replyContents = document.getElementById("replyContents");

replyAdd.addEventListener("click",function(){

let xhttp = new XMLHttpRequest();

xhttp.open("POST", "./add");

xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

xhttp.send("contents=" + replyContents.value + "&bookNumber="+replyAdd.get)

})