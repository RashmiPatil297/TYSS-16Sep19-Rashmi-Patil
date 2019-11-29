add(10,20);
function add(num1,num2)
 {
    console.log('sum=',num1+num2);

 }

console.log('---------------------------------');
var sub=function(num1,num2)
 {
    console.log('sub=',num1-num2);
 }
sub(20,10);
console.log('----------------------------------')
var sub=function(num1,num2,num3)
 {
    console.log('sub=',num1-num2-num3);
 }
sub(20,10,5);
console.log('----------------------------------')
var sub=function(num1,num2)
 {
    var subvalue=num1-num2;
      return subvalue;
 }
var value=sub(30,10);
console.log('value=',value);
console.log('----------------------------------');

(function(num1,num2)
 {
    console.log('value=',num1*num2);
 })
(10,20);
console.log('==================================');
var div1=(n1,n2)=>
 {
    console.log('value=',n1/n2);
 }
div1(40,20);
console.log('---------------------------------');
var div2=n=>
 {
    console.log('value',n);
 }
div2(10);
console.log('---------------------------------');
var greets=(msg)=>
 {
  console.log('hi',msg);
 }
greets('dinga');
console.log('----------------------------------');
var div4=(n1,n2)=>console.log(n1+n2); 
div4(20,10);
console.log('----------------------------------');
var div3=n1=>console.log(n1);
div3(20);
  console.log("===================================");
  console.log(hoist);
  var hoist=10;
  function hoisting()
  {
     console.log(hoistingA);
     var hoistingA=10;
  }
  hoisting();
   
   
  