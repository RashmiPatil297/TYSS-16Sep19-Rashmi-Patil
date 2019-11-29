console.log('Named Function');
         var res = 1;
         function factorial(n)
         {
            
            for(var i=1;i<=n;i++)
            {
                res = res*i;
            }
            console.log(res);
         }
         factorial(5);
       console.log('Function Expression');
         var res = 1;
         var factorial1 = function(n)
         {
            
            for(var i=1;i<=n;i++)
            {
                res = res*i;
            }
            console.log(res);
         }
         factorial(5);
       console.log('Self Invoked Function');
         var res = 1;
         (function (n)
         {
            
            for(var i=1;i<=n;i++)
            {
                res = res*i;
            }
            console.log(res);
         })
         (5);
       console.log('Fat Arrow Function');
         var res=1;
         var factorial1=(n)=>{
            for(var i=1;i<=n;i++)
            {
                res = res*i;
            }
            console.log(res);
        }
        factorial1(5);
    