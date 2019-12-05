import React, { Component } from 'react';
import { Route, Link, BrowserRouter as Router } from 'react-router-dom'
import Register from './register.component'
import SnippetReview from './snippet-review.component'
import { Navbar, Nav } from 'react-bootstrap';

class Routing extends Component {

    render() {

        return <Router>
            <div>
                <Navbar bg="light" expand="lg">
                    <Navbar.Brand href="/">Your Code Sucks</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link href="register">Register</Nav.Link>
                            <Nav.Link href="review">Snippet Review</Nav.Link>
                        </Nav>
                    </Navbar.Collapse>
                </Navbar>
                <Route exact path="/" component={Register} />
                <Route path="/review" component={SnippetReview} />
                <Route path="/register" component={Register} />
            </div>
        </Router>

    }

}


export default Routing;