console.log('Named Function');
function prime(n)
{
    var flag=0;
        for(var i=2;i<=n/2;i++)
        {
            if(n%i===0)
            {
               flag=1;
            }
        }
        if(flag===1)
        {
            console.log('no is not prime')
        }
       else
            console.log('no is prime');
        
}
prime(9);
console.log('Function Expression');
var prime=function(n)
{
    var flag=0;
        for(var i=2;i<=n/2;i++)
        {
            if(n%i===0)
            {
               flag=1;
            }
        }
        if(flag===1)
        {
            console.log('no is not prime')
        }
       else
            console.log('no is prime');
        
}
prime(19);
console.log('Self Invoked Function');
(function(n)
{
    var flag=0;
        for(var i=2;i<=n/2;i++)
        {
            if(n%i===0)
            {
               flag=1;
            }
        }
        if(flag===1)
        {
            console.log('no is not prime')
        }
       else
            console.log('no is prime');
        
})
(20);
console.log('Fat Arrow Function');
prime=n=>
{
    var flag=0;
        for(var i=2;i<=n/2;i++)
        {
            if(n%i===0)
            {
               flag=1;
            }
        }
        if(flag===1)
        {
            console.log('no is not prime')
        }
       else
            console.log('no is prime');
        
}
prime(2);
