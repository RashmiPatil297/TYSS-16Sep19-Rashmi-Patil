console.log('window object',window);
console.log('this keyword',this);
console.log(this === window)
//window.alert('welcome to india')
//alert('welcome')
//let confirmDelete = confirm('are u sure u want to delete')
//console.log('confirm delete',confirmDelete)
//let userName = prompt('what is ur name',' ')
//console.log('user name',userName)
const person = {
    firstName : 'Alia',
    age : 26,
    lastName : 'Kapoor',
    getName : function(){
        console.log('this keyword',this)
        //console.log('window keyword',window)
        return this.firstName + '' + this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName)