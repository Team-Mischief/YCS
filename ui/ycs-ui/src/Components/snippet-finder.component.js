import React, { Component } from 'react';
import { Form, Button, Card, Row, Col } from 'react-bootstrap';

class SnippetFinder extends Component {

    render(){

        return <Row>
    <Col></Col>
    <Col>
    <Card>
            <Card.Body style={{ width: '40rem'}}>
            <Form>
           
            <br></br>
            <br></br>
            
        <Form.Group controlId="formHandle">
          <Form.Label>Search Snippet</Form.Label>
          <Form.Control type="text" placeholder="Snip Snip" />
          <Form.Text className="text-muted">
            Choose your snippet
          </Form.Text>
        </Form.Group>
    
        <Button variant="primary" type="submit">
          Submit
        </Button>
        </Form>
        </Card.Body>
  
      </Card></Col>
    <Col></Col>
  </Row>
  
    



    }
}

export default SnippetFinder;