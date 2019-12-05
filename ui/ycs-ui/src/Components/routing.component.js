import React, { Component } from 'react';
import { Route, BrowserRouter as Router } from 'react-router-dom'
import Register from './register.component'
import SnippetReview from './snippet-review.component'
import { Navbar, Nav } from 'react-bootstrap';
import './routing.css';
<<<<<<< HEAD
import SnippetFinder from './snippet-finder.component';
import Home from './home.component';

=======
import Creator from './creator.component'
>>>>>>> 6c2850bca563d693b80fc20aed14b663f38b853b
class Routing extends Component {

    render() {

        return <Router>
            <div>
                <Navbar id="navBar" bg="light" expand="lg" sticky="top">
                    <img
                        src="/YCSIcon.png"
                        width="50"
                        height="50"
                        className="d-inline-block align-top"
                        alt="React Bootstrap logo"
                    />
                    <Navbar.Brand id="navBrand" className="display-1" href="/"> Your Code Sucks</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link id="registerLink" href="register">Register</Nav.Link>
                            <Nav.Link id="reviewLink" href="review">Snippet Review</Nav.Link>

                            <Nav.Link id="creatorLink" href="creator">Code Creator</Nav.Link>

                        </Nav>
                    </Navbar.Collapse>
                </Navbar>
                <Route exact path="/" component={Home} />
                <Route path="/review" component={SnippetReview} />
                <Route path="/register" component={Register} />

                <Route path="/creator" component={Creator} />

            </div>
            <div></div>
            <br></br>
        </Router>

    }

}


export default Routing;