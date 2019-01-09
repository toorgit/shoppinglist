'use strict';

import React from 'react';
import ReactDOM from 'react-dom';



import Stores from "./components/Stores";

class App extends React.Component {

	constructor(props) {
		super(props);
	}



	render() {
		return (
			<div>
				<Stores/>
			</div>
		)
	}
}



ReactDOM.render(
	<App  />,
	document.getElementById('react')
)

