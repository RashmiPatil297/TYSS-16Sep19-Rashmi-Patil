console.log('Named Function');
var fib1 = 0;
var fib2 = 1;
var next;
function fib(n)
{
    console.log(fib1);
    console.log(fib2); 
    for(i=2;i<n;i++)
    {
      next = fib1 + fib2;
      fib1 = fib2;
      fib2 = next;
      console.log(next);
    }
}
fib(5);
console.log('Function Expression');
var fib1 = 0;
var fib2 = 1;
var next;
var fib = function(n)
{
    console.log(fib1);
    console.log(fib2);
    for(i=2;i<n;i++)
    {
      next = fib1 + fib2;
      fib1 = fib2;
      fib2 = next;
      console.log(next);
    }
}
fib(5);
console.log('Self Invoked Function');
var fib1 = 0;
var fib2 = 1;
var next;
(function(n)
{
    console.log(fib1);
    console.log(fib2);
    for(i=2;i<n;i++)
    {
      next = fib1 + fib2;
      fib1 = fib2;
      fib2 = next;
      console.log(next);
    }
})
(5);
console.log('Fat Arrow Function');
var fib1 = 0;
var fib2 = 1;
var next;
fib = (n)=>
{
    console.log(fib1);
    console.log(fib2);
    for(i=2;i<n;i++)
    {
      next = fib1 + fib2;
      fib1 = fib2;
      fib2 = next;
      console.log(next);
    }
}
fib(5);
