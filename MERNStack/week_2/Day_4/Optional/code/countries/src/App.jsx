import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import axios from "axios"
import Display from './components/Display'
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {

const [countries,setCountries] = useState ([])
const [newC,setNewC]=useState("")
const [newF,setNewF]=useState("")
const fetchCountries=()=>{
  axios. get("https://restcountries.com/v3.1/all")
  .then(res=>{console.log("******************",res.data);setCountries(res.data)})
  .catch(err=>console.log("you have an eurror",err))
}
const handleInput = (e) => {
  e.preventDefault();
  setCountries([...countries,{name:{common:newC},flags:{png:newF}}])
  setNewC("")
  setNewF("")
}
const deleteCountry=()=>{
  setCountries(countries.filter((c,i)=> i  !==id))
}
const updateCountry = (id) = {
  const newList= countries
  newList[id].Independent= !newList
  setCountries(newList)
}
  return (
    <div className='app'>
    <form onSubmit={(e)=>{handleInput(e)}}>
      <label  > Name</label>
      <input type="text" className='from-control' onChange={(e)=> {setNewC(e.target.value)}} value={newC} />
      <label >flag: </label>
      <input type="text" className='from-control' onChange={(e)=> {setNewC(e.target.value)}} value={newF} />
      <button> add</button>
    </form>
    
    <button onClick={fetchCountries}>fetch countries</button>
    
      {countries.map((country,index)=>{
        return <Display country={country} ind = {index}/>
      }
      )
      }
    
    </div>
  )
}

export default App
