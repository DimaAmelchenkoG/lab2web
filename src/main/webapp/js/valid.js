let isYValid = false;
let isXValid = true;
let isRValid = true;


const yValue = document.getElementById("yInput");
const xValue = document.getElementById("x-value");
const rValue = document.getElementById("r-value");

ButtonOn();

yValue.addEventListener("keyup", function () {
    var str = (String(yValue.value)).replace(",", ".");
    isYValid = str < 3 && str > -3 && !isNaN(str) && (str.trim().length !==0);
    isFormReadyToSent();
})


xValue.addEventListener("keyup", function () {
    //alert(xValue.value.trim().length !==0);
    isXValid = (xValue.value == -3 || xValue.value == -2 || xValue.value == -1 || xValue.value == 0 || xValue.value == 1 ||xValue.value == 2 ||xValue.value == 3 ||xValue.value == 4 ||xValue.value == 5) && !isNaN(xValue.value) && (xValue.value.trim().length !==0);
    isFormReadyToSent();
})

rValue.addEventListener("change", function () {
    isRValid =(rValue.value == 1 || rValue.value == 2 || rValue.value == 3 || rValue.value == 4 || rValue.value == 5) && !isNaN(rValue.value) && (rValue.value.trim().length !==0);
    isFormReadyToSent();
})

function isFormReadyToSent(){
    const form = document.getElementById("form");
    const formData = new FormData(form);

    if (!isYValid || !isXValid || !isRValid){
        ButtonOn();
        return;
    }

    ButtonOff();

}

function ButtonOn(){
    document.getElementById("goButton").disabled = true;
}

function ButtonOff(){
    document.getElementById("goButton").disabled = false;
}

