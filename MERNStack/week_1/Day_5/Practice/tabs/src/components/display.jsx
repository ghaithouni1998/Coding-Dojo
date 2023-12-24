import React, { useState } from 'react'

const Tabs = () => { 
    const tab =["tab 1","tab 2","tab3"];
    const [message,setmessage]= useState('') 
    const clickhandler=(e,y,i)=>{

       
       
        e.preventDefault();
        setmessage(y + "showing here");
    }
return (
 <></>

)
}

export default Tabs