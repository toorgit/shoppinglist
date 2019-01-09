import React, {Component} from 'react';
import Storelist from './Storelist'

const client = require('../client');



class Stores extends Component {
    constructor(props){
        super(props);
        this.state = {stores: []};
    }

    componentDidMount() {
        client({method: 'GET', path:'/api/stores'}).done(response => {
            this.setState({stores: response.entity._embedded.stores});
        });
    }

    render(){
        return (
            <Storelist stores={this.state.stores}/>
        )
    }
}

export default Stores;