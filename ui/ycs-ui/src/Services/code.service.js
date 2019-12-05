const axios = require('axios');

class CodeService {

    constructor(){};

    registerCode(code) {
        return axios.post(
        'http://localhost:9000/mischief/code/code',
        code);
    }

}

export default CodeService;