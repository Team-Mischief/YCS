import React, { Component }  from 'react';
import { Form, Button } from 'react-bootstrap';

class Register extends Component {

    render() {
        
        return <Form>
        <Form.Group controlId="formHandle">
          <Form.Label>Handle</Form.Label>
          <Form.Control type="text" placeholder="hack$tr" />
          <Form.Text className="text-muted">
            Your dark web legit black hat haxxr handle
          </Form.Text>
        </Form.Group>
      
        <Form.Group controlId="formPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control type="password" placeholder="ILikeTurtles" />
        </Form.Group>
        <Form.Group controlId="formImg">
          <Form.Label>Pic</Form.Label>
          <Form.Control type="text" label="Pic" placeholder="https://images.app.goo.gl/ndfBHLYvnPsrxLQw5"/>
          <Form.Text className="text-muted">
            Sic URL format 973@$3
          </Form.Text>
        </Form.Group>
        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>
    }

}

export default Register;