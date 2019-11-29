const employee = new Promise(function(resolve,reject){
    if(30>20)
    {
        resolve([{
            name : 'Billgates',
            age : 67
        },
        {
            name : 'Mark Zuckerbeg',
            age : 40
        },
        {
            name : 'rashmi',
            age : 22

        }]);
    }
    else{
        reject('failed');
    }
})
 
employee.then(function(data){
    console.log('employee data',data);
}).catch(function(error){
    console.log('Error message',error);
});
console.log('----------------------------------')
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction
}
let innerFunc = outerFunction(10)
let counter = innerFunc()
console.log('counter value',counter)