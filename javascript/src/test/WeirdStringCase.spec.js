const toWeirdCase = require('../main/WeIrDsTrInGcAsE')

describe("Weird String Case :: Tests", () => {

    it('String => StRiNg', () => {
        expect(toWeirdCase("String")).toBe("StRiNg")
    })

    it('This => ThIs', () => {
        expect(toWeirdCase("This")).toBe("ThIs")
    })

    it('This is a test => ThIs Is A TeSt', () => {
        expect(toWeirdCase("This is a test")).toBe("ThIs Is A TeSt")
    })

})
