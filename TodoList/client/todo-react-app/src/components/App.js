import React from 'react';

import {
  BrowserRouter as Router,
  Routes,
  Route
} from "react-router-dom";
import Todo from './views/Todo/Todo'

function App(props) {
  return (
    <Router>
      <Routes>
        <Route exact path="/todo" element={<Todo/>} />
      </Routes>
    </Router>
  );
}

export default App
