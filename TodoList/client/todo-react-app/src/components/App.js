import React from 'react';

import {
  BrowserRouter as Router,
  Routes,
  Route
} from "react-router-dom";
import Main from './views/Main/Main'

class App extends React.Component{
  render() {
    return (
      <Router>
        <Routes>
          <Route exact path="/todo" element={<Main/>} />
        </Routes>
      </Router>
    );
  }
}

export default App
