import logo from './logo.svg';
import './App.css';


    function App() {
      const prop = [
        {firstName:"Jane",  lastName:"Doe",age:45, haircolor:"black"}, 
        {firstName:"john",  lastName:"smith",age:88, haircolor:"brown"},
        {firstName:"millard",  lastName:"fillmore",age:50, haircolor:"brown"},
        {firstName:"maria",  lastName:"smith",age:62, haircolor:"brown"}];
      // return (
      // )
      return prop.map((user, index)=><div><h1 key={index}> {user.lastName}, {user.lastName}</h1> <br/> age: {user.age} <br/> hair color: {user.haircolor}</div>)

  }
  

export default App;
