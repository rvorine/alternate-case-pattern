function alternateCase(input) {
    let makeUpper = true;
    let result = "";
    for (const ch of input) {
        if (/[a-zA-Z]/.test(ch)) {
            result += makeUpper ? ch.toUpperCase() : ch.toLowerCase();
            makeUpper = !makeUpper;
        } else {
            result += ch;
        }
    }
    return result;
}

console.log(alternateCase("instagram"));   // InStAgRaM
console.log(alternateCase("hello world")); // HeLlO wOrLd
console.log(alternateCase("abc123def"));   // AbC123DeF
