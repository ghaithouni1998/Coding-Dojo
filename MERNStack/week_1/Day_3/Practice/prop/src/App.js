import './App.css';
import PersonCard from './components/PersonCard';

function App() {
  const value1={
    firstName:"jon",
    lastName:"mak",
    age: 45,
    hairColor:"black"
  }
  const value2={
    firstName:"jihed",
    lastName:"abda",
    age: 81,
    hairColor:"read"
  }
  const value3={
    firstName:"jihed",
    lastName:"ouni",
    age: 45,
    hairColor:"black"
  }
  return (
    <div className="App">
      <PersonCard prop={value1}/>
      <PersonCard prop={value2}/>
      <PersonCard prop={value3}/>
    </div>
  );
}

export default App;