console.log('Named Function');
          var res; 
          function circle(r)
         {
            res = 2*Math.PI*r;
            console.log(res);
         }
         circle(5);
        console.log('Function Expression');
          var res; 
          var circle = function(r)
         {
            res = 2*Math.PI*r;
            console.log(res);
         }
         circle(5);
        console.log('Self Invoked Function');
          var res; 
          (function(r)
         {
            res = 2*Math.PI*r;
            console.log(res);
         })
         (5);
        console.log('Fat Arrow Function');
          var res; 
          var circle = (r)=>
          {
            res = 2*Math.PI*r;
            console.log(res);
          }
        circle(5);
    