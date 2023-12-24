import React from 'react'
import {useState, useEffect } from 'react'



function App() {
  const [people, setPeople] = useState([])

useEffect (() => {
  fetchPokemon()
}, [])


const fetchPokemon = () => {
  fetch('https://pokeapi.co/api/v2/pokemon?limit=807')
  .then(response => {
    return response.json();
  }).then(data => {
    console.log(data);
    setPeople(data.results);
  })
  .catch(err => {
    console.log("errrrororooror", err)
  })
}
  return (
    <div>
      <h1>Pokemon API</h1>

      <button onClick={() => {fetchPokemon()}}>Fetch Pokemon</button>
      <hr />
      <h2>Pokemon Name</h2>
      <ul>
      {people.length > 0 &&
          people.map((pokemon, index) => {
            return <li key={index}>{pokemon.name}</li>;
          })}
      </ul>
    </div>
  )
}

export default App