import React from 'react';

import {
  BrowserRouter as Router,
  Routes,
  Route
} from "react-router-dom";
import Main from './views/Main/Main'

function App(props) {
  return (
    <Router>
      <Routes>
        <Route exact path="/todo" element={<Main/>} />
      </Routes>
    </Router>
  );
}

export default App
