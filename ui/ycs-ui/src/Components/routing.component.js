import React, { Component } from 'react';
import { Route, Link, BrowserRouter as Router } from 'react-router-dom'
import Register from './register.component'
import SnippetReview from './snippet-review.component'
import { Navbar, Nav } from 'react-bootstrap';

class Routing extends Component {

    render() {

        return <Router>
            <div>
                <Navbar id="navBar" bg="light" expand="lg">
                    <Navbar.Brand id="navBrand" href="/">Your Code Sucks</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link id="registerLink" href="register">Register</Nav.Link>
                            <Nav.Link id="reviewLink" href="review">Snippet Review</Nav.Link>
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