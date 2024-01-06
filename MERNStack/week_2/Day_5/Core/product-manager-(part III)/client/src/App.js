import { Routes, Route } from "react-router-dom";
import './App.css';
import HomePage from "./components/Home";
import Create from "./components/Create";
import OneProduct from "./components/One";
import Update from "./components/Update";

function App() {
  return (
    <div className="App">
    <h1>Products Home</h1>
    <Routes>
      <Route path="/" element ={<HomePage/>}/>
      <Route path="/Products/create" element ={<Create/>}/>
      <Route path="/Product/:id" element ={<OneProduct/>}/>
      <Route path="/Product/:id/update" element ={<Update/>}/>
      <Route path="*" element={<HomePage/>}/>
  

    </Routes>
    
    </div>
  );
}

export default App;