const rgb = require('../main/rgb_to_hex_conversion');

describe("RGB to Hex Conversion :: Tests", () => {

    it('0,0,0', () => {
        expect(rgb(0, 0, 0)).toBe('000000');
    })

    it('1,1,1', () => {
        expect(rgb(1,1,1)).toBe('010101');
    })

    it('255,255,255', () => {
        expect(rgb(255,255,255)).toBe('FFFFFF');
    })

    it('254,254,254', () => {
        expect(rgb(254,254,254)).toBe('FEFEFE');
    })

    it('256,256,256', () => {
        expect(rgb(256,256,256)).toBe('FFFFFF');
    })

    it('2000,200,2000', () => {
        expect(rgb(2000,200,2000)).toBe('FFC8FF')
    })

})