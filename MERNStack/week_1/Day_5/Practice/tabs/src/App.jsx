
import { useState } from 'react';
import './App.css';
import Tabs from './components/tabs';
import TabsDisplay from './components/display';


function App() {
  const [data,setData]=useState("");

  const newtabs=(content)=>{
    setData(content);
  }
  return (
    
    <div className="App">
    
     <fieldset>
      <Tabs/>
      <TabsDisplay data={newtabs}/>
    
      </fieldset>
    </div>
  );
}

export default App;