import React, { Component } from 'react';
import { Route, Link, BrowserRouter as Router } from 'react-router-dom'
import Register from './register.component'
import SnippetReview from './snippet-review.component'
import { Navbar, Nav } from 'react-bootstrap';
import './routing.css';
import SnippetFinder from './snippet-finder.component';
import SnippetCreator from './snippet-creator.component';
import Home from './home.component';

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
                    <Navbar.Brand id="navBrand" class="display-1" href="/"> Your Code Sucks</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link id="registerLink" href="register">Register</Nav.Link>
                            <Nav.Link id="reviewLink" href="review">Snippet Review</Nav.Link>
                            <Nav.Link id="finderLink" href="finder">Snippet Finder</Nav.Link>
                            <Nav.Link id="creatorLink" href="creator">Snippet Creator</Nav.Link>

                        </Nav>
                    </Navbar.Collapse>
                </Navbar>
                <Route exact path="/" component={Home} />
                <Route path="/review" component={SnippetReview} />
                <Route path="/register" component={Register} />
                <Route path="/finder" component={SnippetFinder} />
                <Route path="/create" component= {SnippetCreator} />
            </div>
            <div></div>
            <br></br>
        </Router>

    }

}


export default Routing;