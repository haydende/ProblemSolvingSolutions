/**
 * I didn't solve this one. The solution below has been copied.
 * https://www.codewars.com/kata/525f3eda17c7cd9f9e000b39/train/javascript
 */

function zero(fn) {
    // if a function is passed, call that function with 0
    // if no function is passed, return the value instead
    return fn ? fn(0) : 0
}

function one(fn) {return fn ? fn(1) : 1}
function two(fn) {return fn ? fn(2) : 2}
function three(fn) {return fn ? fn(3) : 3}
function four(fn) {return fn ? fn(4) : 4}
function five(fn) {return fn ? fn(5) : 5}
function six(fn) {return fn ? fn(6) : 6}
function seven(fn) {return fn ? fn(7) : 7}
function eight(fn) {return fn ? fn(8) : 8}
function nine(fn) {return fn ? fn(9) : 9}


function plus(n) {
    // return a new function that takes input v and adds to input n
    return function(v) {
        return v + n
    }
}

function minus(n) {return function(v) {return v - n}}
function times(n) {return function(v) {return v * n}}
function dividedBy(n) {return function(v) {return v / n}}

module.exports = { zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, times, dividedBy }