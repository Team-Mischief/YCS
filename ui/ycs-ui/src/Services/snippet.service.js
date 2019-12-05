const axios = require('axios');

class SnippetService {

    constructor(){};

    getSnippets() {
        return axios.get(
        'http://localhost:9000/mischief/code/code');
    }
    addSnippet(code) {
        return axios.post(
        'http://localhost:9000/mischief/code/code',
        code);
    }
    getSnippet(id) {
        return axios.get(
        'http://localhost:9000/mischief/code/code/'+id);
    }
}

export default SnippetService;