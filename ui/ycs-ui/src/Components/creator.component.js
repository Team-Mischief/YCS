import React, { Component } from 'react';
import { Form, Button } from 'react-bootstrap';
import CodeService from '../Services/code.service';

class Creator extends Component {

    codeService = new CodeService();

    constructor(props) {
        super(props)
        this.state = {
            code: {
                snippet: `function terribleCode(uselessParam){//broken}`,
                dev: {
                    developer_id: -1,
                    handle: '',
                    picture: ''
                }

            }
        }
        this.handleSnippetChange = this.handleSnippetChange.bind(this);
        this.handleDevChange = this.handleDevChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSnippetChange(event) {
        let newCode = this.state.code;
        newCode = {
            ...newCode,
            handle: event.target.value
        }
        this.setState({ code: newCode });
    }

    handleDevChange(event) {
        let newCode = this.state.code;
        let newDev = {developer_id: event.target.value};
        newCode = {
            ...newCode,
            dev: newDev
        }
        this.setState({ code: newCode });
    }

    handleSubmit(event) {
        this.codeService.registerCode(this.state.code)
            .then((ret) => { console.log(ret) });
        event.preventDefault();
    }

    render() {

        return <Form onSubmit={this.handleSubmit}>
            <Form.Group controlId="formHandle">
                <Form.Label>Code Snippet</Form.Label>
                <Form.Control value={this.state.code.snippet} onChange={this.handleSnippetChange} type="text" placeholder="hack$tr" />
            </Form.Group>

            <Form.Group controlId="formImg">
                <Form.Label>Dev</Form.Label>
                <Form.Control value={this.state.code.dev} onChange={this.handleDevChange} type="text" label="Dev" placeholder="https://images.app.goo.gl/ndfBHLYvnPsrxLQw5" />
                <Form.Text className="text-muted">
                    Who wrote this aweful trash
          </Form.Text>
            </Form.Group>
            <Button variant="primary" onClick={this.handleSubmit}>
                Submit
        </Button>
        </Form>
    }

}

export default Creator;