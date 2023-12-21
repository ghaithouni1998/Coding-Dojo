

import "./App.css";
import PersonCard from "./components/personcard";

const peopleArr = [
  {
    firstName: "ghaith",
    lastName: "Jane",
    age: 45,
    hairColor: "Black",
  },
  {
    firstName: "nawfel",
    lastName: "John",
    age: 88,
    hairColor: "Brown",
  },
  {
    firstName: "jihed",
    lastName: "ouni",
    age: 45,
    hairColor: "Black",
  },

];

function App() {
  return (
    <div className="App">
      {peopleArr.map((personObj, index) => (
        <PersonCard
          key={index}
          firstName={personObj.firstName}
          lastName={personObj.lastName}
          age={personObj.age}
          hairColor={personObj.hairColor}
        />
      ))}
    
    </div>
  );
}

export default App;