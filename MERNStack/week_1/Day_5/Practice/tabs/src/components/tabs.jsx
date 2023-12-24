
import React, { useState } from 'react'

import './tabs.css';

const Tabs = () => { 
    const tab =["tab 1","tab 2","tab3"];
    const [msg,setMsg]= useState('') 
    const clickhandler=(e,g, z)=>{

        e.preventDefault();
        setMsg( g   + " content is showing here");
    }
return (

    <div>
    { tab.map((value,i)=>{
        return <button id='btn'  type="button" class="btn btn-dark"  key={i} onClick={(e)=> clickhandler(e,value,i)}  >{value} </button >
    })
    }
    <fieldset>
    <h1 style={clientInformation}>{msg}</h1>
    </fieldset>
    </div>
    
)
}
export default Tabs