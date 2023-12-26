import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './components/home';
import Hello from './components/hello';
import Number from './components/number';
import Hellocol from './components/hellocol';
function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route path='/home' element={<Home />} />
          <Route path='/:usertext' element={<Hello />} />
          <Route path='/num/:userid' element={<Number />} />
          <Route path='/:hello/:color1/:color2' element={<Hellocol />} />
          
        </Routes>
      </div>
    </Router>
  );
}

export default App;
