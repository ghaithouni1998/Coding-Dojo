

import React from 'react'
import { useParams } from 'react-router-dom'

const Hello = () => {
    console.log("useParams Content :", useParams())
    const { usertext } = useParams()
    return (
        <fieldset>
        
            <h2> the word is  : {usertext} 
                
            </h2>
        </fieldset>
    )
}

export default Hello