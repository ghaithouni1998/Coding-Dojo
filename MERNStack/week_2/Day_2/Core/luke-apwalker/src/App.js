
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import './App.css';
import People from "./components/people";
import Forms from "./components/Forms";


function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<Forms/>}/>

        <Route path='/:pep/:id' element={<><People/> <Forms/></>}/>
        
        <Route path="*" element={<Error />} />


      </Routes>
    </div>
  );
}

export default App;