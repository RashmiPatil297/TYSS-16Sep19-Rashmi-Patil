/*let h1Element = document.getElementById('demo');
console.log('Element=',h1Element)
console.log('Element Text = ',h1Element.textContent)
h1Element.textContent = 'Good Evening';
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me!!!!'
console.log('Button Element',buttonElement)
document.body.appendChild(buttonElement)
console.log('***********************')
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'java'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JAVASCRIPT'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'maroon'
h1Element.style.fontSize = '20px'*/
let showMessage = function(){
    alert('hi hello!!!!!!')
}
function changeColor(){
 let pElement = document.getElementById('mover');
 pElement.style.color = 'red';
}
function removeColor(){
    
 let pElement = document.getElementById('mover');
 pElement.style.color = 'black';

}
function printHello(){
    //console.log('hello')
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}
let name = 'Rashmi'
let age = 21
let phoneno = 9945068297
console.log('name is '+name+' age is '+age+' phone no is '+phoneno)
console.log(`name is ${name} age is ${age} phone no is ${phoneno}`)
console.log(`2 + 2 = ${2+2}`)
