import React from 'react'
import { useParams } from 'react-router-dom'

const Hellocol = () => {
    console.log("useParams Content :", useParams())
    const { hello,color1,color2 } = useParams()
    return (
        <fieldset>
        
            <h2 style={{backgroundColor:color2,color:color1}}> the word is  : {hello}  {color1}</h2>
        </fieldset>
    )
}

export default Hellocol