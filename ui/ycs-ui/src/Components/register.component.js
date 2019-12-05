import React, { Component } from 'react';
import { Form, Button } from 'react-bootstrap';
import DevService from '../Services/dev.service';

class Register extends Component {

    devService = new DevService();

    constructor(props) {
        super(props)
        this.state = {
            dev: {
                handle: `hack$tr`,
                picture: `https://images.app.goo.gl/ndfBHLYvnPsrxLQw5`

            }
        }
        this.handleHandleChange = this.handleHandleChange.bind(this);
        this.handlePicChange = this.handlePicChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleHandleChange(event) {
        let newDev = this.state.dev;
        newDev = {
            ...newDev,
            handle: event.target.value
        }
        this.setState({ dev: newDev });
    }

    handlePicChange(event) {
        let newDev = this.state.dev;
        newDev = {
            ...newDev,
            picture: event.target.value
        }
        this.setState({ dev: newDev });
    }

    handleSubmit(event) {
        this.devService.registerDev(this.state.dev)
            .then((ret) => { console.log(ret) });
        event.preventDefault();
    }

    render() {

        return <Form onSubmit={this.handleSubmit}>
            <Form.Group controlId="formHandle">
                <Form.Label>Handle</Form.Label>
                <Form.Control value={this.state.dev.handle} onChange={this.handleHandleChange} type="text" placeholder="hack$tr" />
                <Form.Text className="text-muted">
                    Your dark web legit black hat haxxr handle
          </Form.Text>
            </Form.Group>

            {/* <Form.Group controlId="formPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control type="password" placeholder="ILikeTurtles" />
        </Form.Group> */}
            <Form.Group controlId="formImg">
                <Form.Label>Pic</Form.Label>
                <Form.Control value={this.state.dev.picture} onChange={this.handlePicChange} type="text" label="Pic" placeholder="https://images.app.goo.gl/ndfBHLYvnPsrxLQw5" />
                <Form.Text className="text-muted">
                    Sic URL format 973@$3
          </Form.Text>
            </Form.Group>
            <Button variant="primary" onClick={this.handleSubmit}>
                Submit
        </Button>
        </Form>
    }

}

export default Register;