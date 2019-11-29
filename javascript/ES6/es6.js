const message =new Promise(function(resolve,reject){
    if(30>20)
    {
        resolve('sucess');
    }
    else{
        reject('failed');
    }
})
 
message.then(function(msg){
    console.log('success message',msg);
}).catch(function(error){
    console.log('Error message',error);
});