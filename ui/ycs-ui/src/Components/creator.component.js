import React, { Component } from 'react';
import { Form, Button } from 'react-bootstrap';
import CodeService from '../Services/code.service';
import DevService from '../Services/dev.service';

class Creator extends Component {

    codeService = new CodeService();
    devService = new DevService();

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

            },
            allDevs: []
        }
        this.devService.getDevs().then((devs) => {
            console.log(devs);
            this.setState({ ...this.state, allDevs: devs.data})});
            this.handleSnippetChange = this.handleSnippetChange.bind(this);
            this.handleDevChange = this.handleDevChange.bind(this);
            this.handleSubmit = this.handleSubmit.bind(this);
        }

    handleSnippetChange(event) {
            let newCode = this.state.code;
            newCode = {
                ...newCode,
                snippet: event.target.value
            }
        this.setState({...this.state, code: newCode });
        }

    handleDevChange(event) {
            let newCode = this.state.code;
            let newDev = {};
            for (let dev of this.state.allDevs) {
                console.log(dev);
                if (dev.handle === event.target.value) {
                    newDev = dev;
                }
            }
            newCode = {
                ...newCode,
                dev: newDev
            }
        this.setState({...this.state, code: newCode });
        }

    handleSubmit(event) {
            this.codeService.registerCode(this.state.code)
                .then((ret) => { console.log(ret) });
            event.preventDefault();
        }

    render() {

            return<Form onSubmit = {this.handleSubmit
        } >
        <Form.Group controlId="formHandle">
            <Form.Label>Code Snippet</Form.Label>
            <Form.Control value={this.state.code.snippet} onChange={this.handleSnippetChange} type="text" as="textarea" />
        </Form.Group>

        <Form.Group controlId="formImg">
            <Form.Label>Dev</Form.Label>
            <Form.Control value={this.state.code.dev.handle} onChange={this.handleDevChange} type="text" label="Dev" />
            <Form.Text className="text-muted">
                Who wrote this aweful trash
          </Form.Text>
        </Form.Group>
        <Button variant="primary" onClick={this.handleSubmit}>
            Submit
        </Button>
        </Form >
    }

}

export default Creator;