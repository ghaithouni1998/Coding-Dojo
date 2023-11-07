function alertme(element) {
    alert();
}
function remove() {
    var element = document.querySelector(".buttom");
    element.remove();
}

var even1=document.querySelector(".tempc")
function changetemp(e){
    console.log("=========",even1);
    
        
        even1.innerText*1.8+32;
   
}