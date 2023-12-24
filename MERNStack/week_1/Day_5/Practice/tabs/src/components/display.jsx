import React, { useState } from 'react'

const Tabs = () => { 
    const tab =["tab 1","tab 2","tab3"];
    const [msg,setMsg]= useState('') 
    const clickhandler=(e,y,i)=>{

        e.preventDefault();
        setMsg(y + "showing here");
    }
return (
 <></>

)
}

export default Tabs