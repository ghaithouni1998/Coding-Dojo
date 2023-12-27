import React, { useState, useEffect } from 'react'
import { useParams, useNavigate } from 'react-router-dom'
import axios from 'axios';

const Hero = (props) => {
    const { id } = useParams();
    const [hero, setHero] = useState(null)
    const navigate = useNavigate()
   
    }
    
  
    const getData = async () => {
        try {
            const result = await axios.get(`https://swapi.dev/api/planets/${id}`)
            setHero(result.data)               
           
        }catch(error) {
            return nextHero()
        }
    }

    return (
        <>
          
             <h1>LUKE SKYWALKER</h1>
             <h2>height:</h2>
          
        </>
    )


export default Hero