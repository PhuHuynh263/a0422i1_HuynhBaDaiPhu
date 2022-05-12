const btn = document.querySelector('#btn');
const radioButtons = document.querySelectorAll('input[name="gender"]');
btn.addEventListener("click", () => {
    let selectedValue;
    for (const radioButton of radioButtons) {
        if (radioButton.checked) {
            selectedValue = radioButton.value;
            break;
        }
    }
    // show the output:
    output.innerText = selectedValue ? ` Maximum of 250 characters.` : ``;
    output2.innerText = selectedValue ? ` Currently Used: 0 characters.` : ``;
})
