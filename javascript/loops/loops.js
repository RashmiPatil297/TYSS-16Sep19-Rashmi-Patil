console.log('for-of loop');
var brands = ['kingfisher','bisleri','aqua','kinley'];
for(var element of brands)
{
    console.log('value ',element)
}
console.log('for-in loop');
var brands = ['kingfisher','bisleri','aqua','kinley'];
for(var index in brands)
{
    console.log('value ',brands[index]);
}
console.log('key - value pair');
var person = {
    name : 'sundari',
    age : 33,
    color : 'white'
}           
for(var key in person)
{
    console.log('value ',person[key]);

}
console.log('forEach method')
var brands1 = ['kingfisher','bisleri','aqua','kinley'];
brands.forEach(function(value,index){
    console.log('brands ',value)
})
console.log('storing objects in array');
var items = [{
    item : 'bangles',
    id : 1,
    price : 100
},
{
    item : 'eyeliner',
    id : 2,
    price : 200
},
{
    item : 'watch',
    id : 3,
    price : 3000
},
{
    item : 'bike',
    id : 4,
    price : 10000000
}
]
items.forEach(function(value,index){
    console.log('items ',value)
    console.log('items ',index)
})



