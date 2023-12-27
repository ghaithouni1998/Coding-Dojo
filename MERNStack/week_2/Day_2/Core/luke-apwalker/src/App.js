import {Routes, Route, Link, Navigate} from "react-router-dom"
// import './App.css'
import People from "./components/people"

import Form from "./components/Form"


function App() {

  return (
    <div className="container p-3 m-2">
      <Form/>
    <Routes>
      <Route path="/" element={<><h1>people </h1></>}/>
      
      <Route path="/people/:id" element={<People/>}/>
      
      
    </Routes>
    </div>
  )
}

export default App