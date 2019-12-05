const axios = require('axios');

class DevService {

    constructor(){};

    registerDev(dev) {
        return axios.post(
        'http://localhost:9000/mischief/dev/dev',
        dev);
    }

}

export default DevService;