import React, {useState}from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
const Display = (props) => {
    // state the coutry in compent
    const [thiscountry,setThiscountry]=useState(props.country) 
  return (
    <div> <table>
        <tr>
            <th>country name</th>
            <th>flag</th>
            <th>actions</th>
        </tr>
        <tr>
            <td>{thiscountry.name.common}</td>
            <td><img src={thiscountry.fl ags.png} alt="" /></td>
            <td><input type="checkbox"   /> Independent | <button onClick={props.deleteCountry(props.index)}>Delete</button></td>
        </tr>
        </table>
    </div>
  )
}

export default Display