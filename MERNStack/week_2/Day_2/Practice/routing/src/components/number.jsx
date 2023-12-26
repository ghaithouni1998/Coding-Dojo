import React from 'react'
import { useParams } from 'react-router-dom'

const Number = () => {
    console.log("useParams Content :", useParams())
    const { userid} = useParams()
    return (
        <fieldset>
            
            <h1> the number : {userid} 
                
            </h1>
        </fieldset>
    )
}

export default Number