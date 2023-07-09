/**
 * Convert the provided trio of numbers into a single hex string.
 *
 * https://www.codewars.com/kata/513e08acc600c94f01000001/train/javascript
 */
function rgb(r, g, b) {
    let rHex = convertToHex(r);
    let gHex = convertToHex(g);
    let bHex = convertToHex(b);

    return `${rHex}${gHex}${bHex}`;
}

/**
 * Converts the provided integer value into a hexadecimal string
 *
 * For values that are below 0 or above 255, the hex value becomes 00 or FF respectively.
 */
function convertToHex(value) {
    let hexVal;
    if (value < 16) {
        hexVal = (value > 0) ? `0${value.toString(16)}` : '00';
    } else if (value > 254) {
        hexVal = 'FF';
    } else {
        hexVal = value.toString(16);
    }
    return hexVal.toUpperCase();
}


module.exports = rgb;