const express = require('express');
const axios = require('axios');

module.exports = (app) => {
    app.get('/api/pokemon', async(req, res) => {
        try {
            const apiUrl = 'https://pokeapi.co/api/v2/pokemon/'
            const response = await axios.get(apiUrl + '?limit=5');
            const pokemonList = response.data.results;
            res.json(pokemonList);
            
        } catch (error) {
            console.error("❌❌❌", error);
            res.status(500).json({message: "Internal Error"})
        }
    })

    app.get('api/pokemon', async(req, res) => {
        try {
            const id = req.params.pokemonId;
            const apiUrl = 'https://pokeapi.co/api/v2/pokemon/:id'
            const myPokemon = await axios.get(apiUrl + {id})
            res.json(myPokemon)
        } catch (error) {
            console.error("❌❌❌", error);
            res.status(500).json({message: " Error"})  
        }
    })
}