import React, {Component} from 'react';

class Store extends Component{
    render(){
        return (
            <tr>
                <td>{this.props.store.name}</td>
                <td>{this.props.store.description}</td>
            </tr>
        )
    }
}

export default Store;