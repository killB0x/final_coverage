export {}
import {toJSON} from "../../../syntest-javascript/benchmark/top10npm/moment/src/lib/moment/to-type.js";
const chai = require('chai');
const chaiAsPromised = require('chai-as-promised');
const expect = chai.expect;
chai.use(chaiAsPromised);

describe('toJSON', () => {
	it('test for toJSON', async () => {
		const _returnValueeCE2uio = await toJSON()
	});
})