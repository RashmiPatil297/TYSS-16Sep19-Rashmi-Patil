function pwdvisible(){
    let x = document.getElementById('myPassword');
    if(x.type === "password")
    {
        x.type = "text";
    }
    else
    {
        x.type = "password";
    }
}

function validate()
{
    x=document.myForm;
    txt=x.myInput.useDebugValue
    if(txt>5)
    {
        return true;
    }
    else{
        alert("must be greater than 5");
        return false;
    }
}
