function se(selectAll) {
    const checkboxes = document.getElementsByName("agree")
    checkboxes.forEach((checkbox) => {
      checkbox.checked = selectAll.checked;
    })
}
function allChecked() {
    const allCheck = document.querySelector('input[name="agreeAll"]');
    const checkboxes = document.querySelectorAll('input[name="agree"]');
    const checkboxesChecked = document.querySelectorAll('input[name="agree"]:checked');
    if (checkboxes.length === checkboxesChecked.length) {
        allCheck.checked = true;
    } else {
        allCheck.checked = false;
    }
}
function se2(selectAll) {
    const checkboxes = document.getElementsByName("agree2")
    checkboxes.forEach((checkbox) => {
      checkbox.checked = selectAll.checked;
    })
}
function allChecked2() {
    const allCheck = document.querySelector('input[name="agreeAll2"]');
    const checkboxes = document.querySelectorAll('input[name="agree2"]');
    const checkboxesChecked = document.querySelectorAll('input[name="agree2"]:checked');
    if (checkboxes.length === checkboxesChecked.length) {
        allCheck.checked = true;
    } else {
        allCheck.checked = false;
    }
}
function openSub() {
  	document.getElementById('minus').style.display = "block";
  	document.getElementById('plus').style.display = "none";
  	document.getElementById('subcheck').style.display = "block";
}
function closeSub() {
  	document.getElementById('minus').style.display = "none";
  	document.getElementById('plus').style.display = "block";
  	document.getElementById('subcheck').style.display = "none";
}
function openSub2() {
  	document.getElementById('minus2').style.display = "block";
  	document.getElementById('plus2').style.display = "none";
  	document.getElementById('subcheck2').style.display = "block";
}
function closeSub2() {
  	document.getElementById('minus2').style.display = "none";
  	document.getElementById('plus2').style.display = "block";
  	document.getElementById('subcheck2').style.display = "none";
}
function openPop1() {
 	document.getElementById('sub1').style.opacity = "1";
 	document.getElementById('sub1').style.visibility = "visible";
}
function closePop1() {
 	document.getElementById('sub1').style.opacity = "0";
 	document.getElementById('sub1').style.visibility = "hidden";
}
function openPop2() {
 	document.getElementById('sub2').style.opacity = "1";
 	document.getElementById('sub2').style.visibility = "visible";
}
function closePop2() {
 	document.getElementById('sub2').style.opacity = "0";
 	document.getElementById('sub2').style.visibility = "hidden";
}
document.addEventListener("DOMContentLoaded", function () {
    const usernameInput = document.getElementById("username");
    const usernameAvailability = document.getElementById("usernameAvailability");
    
    usernameInput.addEventListener("input", function () {
        const username = usernameInput.value;
        
        fetch("/api/check-username-availability", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ username: username })
        })
        .then(response => response.text())
        .then(data => {
            usernameAvailability.textContent = data;
        });
    });
});



