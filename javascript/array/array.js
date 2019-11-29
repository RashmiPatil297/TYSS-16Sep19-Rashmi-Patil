const hobbies = ['sleeping','cricket','eating','coding','roaming'];
console.log(typeof hobbies);
console.log('to check whether array or not');
Array.isArray('hobbies');
console.log('after include');
hobbies.includes('cricket',10);
console.log('after push');
hobbies.push('guitar','volleyball');
console.log('after pop');
hobbies.pop();
console.log('after unshift');
hobbies.unshift('numismatics','singing');
console.log('after shift');
hobbies.shift();
console.log('after splice');
hobbies.splice(1,2,'bird watching','pubg');
console.log('after slice');
hobbies.slice(2,4);
console.log(hobbies);
const hobbies1 = ['sleeping','cricket','eating','coding','roaming'];
const indexof = hobbies1.indexOf('eating',1);
console.log('indexof coding ',indexof);
const joining = hobbies1.join('-');
console.log('after joining ',joining);
console.log('--------------------------------')
const numbers = [100,200,300,400]
const numbers1 = numbers.map(function(value,index){
    let newValue = value+50;
    return newValue;
})
console.log(numbers1)
    console.log('-----------------------------')
    const numbers2 = numbers.map(value=>value+50);
    console.log(numbers2)
const filternum = numbers.filter(function(value,index){
    if(value>200){
        return true;
    }
    else{
        return false;
    }
})
console.log('after filtering',filternum);
const filternum1 = numbers.filter(value=>value>200)

console.log('after filtering',filternum1);

