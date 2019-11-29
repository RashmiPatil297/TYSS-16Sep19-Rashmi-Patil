function first(callback){
    setTimeout( function() {
    console.log("first fun executed");
    callback();
},0)
//console.log("executed");
}
function second(){
    console.log("second fun executed");
}
first(second);
//second();