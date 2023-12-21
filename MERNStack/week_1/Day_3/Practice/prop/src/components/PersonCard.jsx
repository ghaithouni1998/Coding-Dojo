import React from 'react'

const PersonCard = ({prop}) => {

    // const value=prop

  return (
    <div>
        {JSON.stringify(value)}
        <h1>{value.lastName},{value.firstName} </h1>
        <p>age :{value.age}</p>
        <p>hair color :{value.hairColor}</p>

    </div>
  )
}

export default PersonCard