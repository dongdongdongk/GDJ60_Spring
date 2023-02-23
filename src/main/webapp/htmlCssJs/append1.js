const add = document.getElementById("add");
const list = document.getElementById("list");



add.addEventListener('click',function(){
    //<li>d</li>
    let li = document.createElement('li');
    let button = document.createElement('button');
    let text = document.createTextNode('click');
    //attr 에 속성을(class)추가해주고 
    let attr = document.createAttribute("class");
    attr.value = 'btn bg'; //클래스에 한번에 여러개 넣을수 있는 
    //attr.value=attr.value + "bg";
    
    //attr 에 btn 을 넣어준것
    button.setAttributeNode(attr);
    
    
    
    
    //<li><button>click</button></i>
    button.appendChild(text);
    li.appendChild(button);
   // list.append(li);

  // list.prepend(li); //위에다 추가 
    //list.before(li);
    list.after(li);

   
});