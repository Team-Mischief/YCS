import React, { Component } from 'react';
import SnippetService from '../Services/snippet.service';

class SnippetReview extends Component {
    snippetService = new SnippetService();

    constructor(props) {
        super(props);
        this.state = { codes: []};
        this.snippetService.getSnippets().then(res => {
            console.log(res);
            this.setState({codes: res.data});
        });
    }
    render() {
        return (
            <>
                {this.state.codes.map(code => (
                    <div key={code.Id}>
                        <h3>{code.dev.handle}</h3>
                        <img src={code.dev.picture}></img>
                        <div>{code.avgRating}</div>
                        <p>{code.snippet}</p>
                    </div>
                ))}
            </>
        )

    }

}

export default SnippetReview;