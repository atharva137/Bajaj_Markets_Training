
//alert("script is working");
function validateForm(){

    var x = document.forms["myForm"]["fname"].value;

    if(x==""){
        alert("Enter valid name");
    }

    if(x=="Atharva"){
        alert("Welcome atharva")
    }



    var radio = document.getElementsByName("gender");
    for (var i = 0; i < radio.length; i++) {
        var button = radio[i];
        if (button.checked) {
            console.log(button.value);
            alert(button.value);
        }
    }

    var singing = document.getElementById("singing");
    var dancing = document.getElementById("dacing");
    var sports = document.getElementById("Sports");
    var others = document.getElementById("others");


    if(singing.checked){
        console.log(singing.value)
        alert(singing.value)
    }
    
}   