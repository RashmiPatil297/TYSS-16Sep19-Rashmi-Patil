const person ={
    name : 'sundara',
    age : 100,
    address : {
                 city : 'bijapur',
                 state : 'karnataka',
                 pincode : 586101
              },
    hobbies : ['coding','bird watching','singing']
}
console.log('javascript person object',person)
const jsonObject = JSON.stringify(person);
console.log('JSON person object',jsonObject)
const jsObject = JSON.parse(jsonObject)
console.log('javascript object',jsObject)
localStorage.setItem('email','billgates@gmail.com')
const emailId = localStorage.getItem('email')
console.log('Email Id',emailId)
localStorage.clear();
