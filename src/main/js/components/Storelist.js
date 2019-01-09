import React, {Component} from 'react';
import Store from './Store'

class Storelist extends Component{
    render(){
        const stores = this.props.stores.map(store =>
            <Store key={store._links.self.href} store={store}/>
        );
        return (
            <table>
                <tbody>
                    <tr>
                        <th>Name</th>
                        <th>Description</th>
                    </tr>
                    {stores}
                </tbody>
            </table>
        )
    }
}

export default Storelist;