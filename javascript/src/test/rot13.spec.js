const rot13 = require('../main/rot13')

describe('ROT13 :: Tests', function () {

    it('test', () => {
        expect(rot13('test')).toBe('grfg');
    })

    it('Test', () => {
        expect(rot13('Test')).toBe('Grfg');
    })

    it('Codewars', () => {
        expect(rot13('Codewars')).toBe('Pbqrjnef');
    })

    it('Ruby is cool!', () => {
        expect(rot13('Ruby is cool!')).toBe('Ehol vf pbby!');
    })

    it('10+2 is twelve.', () => {
        expect(rot13('10+2 is twelve.')).toBe('10+2 vf gjryir.');
    })

    it('abcdefghijklmnopqrstuvwxyz', () => {
        expect(rot13('abcdefghijklmnopqrstuvwxyz')).toBe('nopqrstuvwxyzabcdefghijklm');
    })

});