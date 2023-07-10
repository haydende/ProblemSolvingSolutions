/**
 * Rotate alphabetic characters in the provided string by 13.
 *
 * https://www.codewars.com/kata/530e15517bc88ac656000716/train/javascript
 */
function rot13(message) {
    let newMsgChars = [];

    for (let i = 0; i < message.length; i++) {
        let char = message[i];
        let charCode = char.charCodeAt(0);

        charCode = alphaRotate(charCode, 13);
        newMsgChars[i] = (String.fromCharCode(charCode));
    }
    return newMsgChars.join("");
}

/**
 * Rotates the alphabetic character by provided amount, but keeps original casing.
 *
 * If the charCode is not recognised within the bounds of alphabetic characters, return it without change.
 *
 * @param charCode decimal unicode value for the character
 * @param rotation integer amount to rotate by
 * @returns {*} the charCode + rotation, or the original character
 */
function alphaRotate(charCode, rotation) {
    let upperLimit;

    if (charCode > 64 && charCode < 91) { // upper
        upperLimit = 90;
    } else if (charCode > 96 && charCode < 123) { // lower
        upperLimit = 122;
    } else {
        return charCode;
    }

    let newCharCode = charCode + rotation
    if (newCharCode > upperLimit) {
        newCharCode -= 26;
    }

    return newCharCode;
}

module.exports = rot13