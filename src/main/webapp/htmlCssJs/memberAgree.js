const checkAll = document.getElementById("checkAll");
const checks = document.getElementById("checks");
const agree = document.getElementById("agree");

agree.addEventListener("click",function(){
    
})




checkAll.addEventListener("click", function(){
    for(let i=0;i<checks.length;i++) {
        checks[i].checked=checkAll.checked;
    }
});

for(let i=0;i<checks.length;i++) {
    checks[i].addEventListener("click",function(){
        let result=true;
        for(let j=0;j<checks.length;j++) {
            if(!checks[j].checked) {
                //result = checks[j].checked;
                //result = false;
                result = !result;
                break;
            }
        }
        checkAll.checked = result
    });
}