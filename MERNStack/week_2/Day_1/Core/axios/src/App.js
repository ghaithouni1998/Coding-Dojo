import { useState,useEffect } from 'react'
import './App.css'
import axios from 'axios'


function App() {
  const [axiosPokemon, setAxiosPokemon] = useState([])
useEffect (() => {
}, []) 
const axiosAPI = () => {
  axios.get('https://pokeapi.co/api/v2/pokemon?limit=807')    
  .then(response => {
    console.log("AXIOS RESPONSE :", response.data)
    setAxiosPokemon(response.data.results)
  })
  .catch(error=> console.log("AXIOS ERROR:", error))
}
useEffect(()=>{
  axios.get('https://pokeapi.co/api/v2/pokemon?limit=807')
  .then(response => {
    console.log("UseEffect RESPONSE :", response.data.results)
  })
  .catch(error=> console.log("AXIOS ERROR:", error))
}, [])
return (
  <div>
    <h1>Pokemon API</h1>
    <button onClick={axiosAPI}>fetch Pokemon</button>
    <hr />
    <h2>Pokemon Name</h2>
    <ul>
    {axiosPokemon.length > 0  &&
        axiosPokemon.map((pokemon, index) => {
          return <li key={index}>{pokemon.name}</li>;
        })}
    </ul>
  </div>
)
}
export default App