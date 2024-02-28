/**
 * https://www.codewars.com/kata/52b757663a95b11b3d00062d/javascript
 *
 * Passed String is only expected to contain alphabetical and space characters.
 *
 * NOTE: Description of challenge wasn't very clear - it is expecting that each word is indexed independently
 */
function toWeirdCase(victim) {
    let newStr = "";
    let spaceOffset = 0;
    for (let i = 0; i < victim.length; i++) {
        let char = victim.charAt(i);

        let isEven = (i + spaceOffset) % 2 === 0;
        if (" " === char) {
            spaceOffset++;
        } else if (!isEven) {
            char = char.toLowerCase();
        } else {
            char = char.toUpperCase();
        }
        newStr = newStr.concat(char);
    }
    return newStr;
}

module.exports = toWeirdCase;