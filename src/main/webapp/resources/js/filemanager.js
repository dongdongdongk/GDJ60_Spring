const fileAdd = document.getElementById('fileAdd');
const fileList = document.getElementById('fileList');
let count = 0;
let max =1;
let param='pic';
function setParam(p)
    param=p;
function setMax(m) {
    max=m;
}

fileAdd.addEventListener("click",function(){

    if(count<=max) {
        alert('첨부파일은 최대 '+max+' 까지만 가능');
        return;
    }

    count++;

    //Element 들을 생성 
    let d = document.createElement('div');//부모div
    let a = document.createElement('label');//label
    let i = document.createElement('input');//input
    let t = document.createTextNode('Image');

    //Element 들을 조합
    d.appendChild(a);
    d.appendChild(i);
    a.appendChild(t);

    let attr = document.createAttribute("class");
    attr.vlaue='mb-3';
    d.setAttributeNode(attr);
   
   //label
   attr=document.createAttribute('class');
   attr.value='form-label';
   a.setAttributeNode(attr);

   attr = document.createAttribute("for");
   attr.value='files';
   a.setAttributeNode(attr);

   //input
   attr = document.createAttribute('type');
   attr.value="file";
   i.setAttributeNode(attr);

   attr=document.createAttribute('class');
   attr.value="form-control"
   i.setAttributeNode(attr);
   
   attr=document.createAttribute('name');
   attr.value="pic"
   i.setAttributeNode(attr);

    

   
    fileList.prepend(d);

});













// const B_file = document.getElementById("B_file");
// const add = document.getElementById("add");

// add.addEventListener('click',function(){
// let label = document.createElement('label');
// let input = document.createElement('input');
// let foradd = documet.createAttribute('for');
// let classadd  = document.createAttribute('class');
// let text = document.createTextNode('Image');


// let type = document.createAttribute('type');
// let id  = document.createAttribute('files');
// let name = documet.createAttribute('pic');


// B_file.append(label);
// label.appendChild(foradd);
// label.appendChild(classadd);
// label.appendChild(text);

// B_file.append(input);
// input.appendChild(type);
// input.appendChild(classadd);
// input.appendChild(id);
// input.appendChild(name);

// })