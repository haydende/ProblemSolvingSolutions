const { zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, times, dividedBy } = require("../main/CalculatingWithFunctions");

describe("Calculating with Functions :: Tests", () => {

    it('zero(plus(one())) == 1', () => {
        expect(zero(plus(one()))).toBe(1);
    })

    it('four(minus(five())) == -1', () => {
        expect(four(minus(five()))).toBe(-1);
    })

    it('five(times(five())) == 25', () => {
        expect(five(times(five()))).toBe(25);
    })

    it('nine(dividedBy(three())) == 3',() => {
        expect(nine(dividedBy(three()))).toBe(3)
    })
})