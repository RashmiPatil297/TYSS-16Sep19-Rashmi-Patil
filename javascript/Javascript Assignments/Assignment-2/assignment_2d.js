console.log('Named Function');
function total()
{
  var nums = [10,20,30,40,50];
  var res = 0;
  for(i=0;i<5;i++)
  {
    res = res + nums[i];
  }
  console.log(res);
}
total();
console.log('Function Expression');
var total = function()
{
  var nums = [10,20,30,40,50];
  var res = 0;
  for(i=0;i<5;i++)
  {
     res = res+nums[i];
  }
  console.log(res);
}
total();
console.log('Self Invoked Function');
(function()
{
  var nums = [10,20,30,40,50];
  var res = 0;
  for(i=0;i<5;i++)
  {
    res = res+nums[i];
  }
  console.log(res);
})
();
console.log('Fat Arrow Function');
total=()=>
{
  var nums = [10,20,30,40,50];
  var res = 0;
  for(i=0;i<5;i++)
  {
    res = res+nums[i];
  }
  console.log(res);
}
total();
