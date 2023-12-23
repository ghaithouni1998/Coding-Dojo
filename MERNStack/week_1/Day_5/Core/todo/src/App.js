import { useState } from 'react'
import './App.css'
import PlansComponent from './components/PlansComponent'
import FormComponent from './components/FormComponent'

function App() {
  localStorage.setItem("plans",JSON.stringify({ content: "Wake up at 6 am", status: false },
  { content: "Eat breakfast", status: true }))
  const savedPlans  = JSON.parse(localStorage.getItem("plans"))
  const [plans, setPlans] = useState([
    { content: "Wake up at 6 am", status: false },
    { content: "Eat breakfast", status: true }])
    

  const addPlan = (newPlan) => {
    setPlans([...plans, newPlan])
  }
  
  const updatePlan = (index) => {
    
    const plansUpdated = [...plans]
    
    plansUpdated[index].status = !plans[index].status
    setPlans(plansUpdated)
  }
  
  const deletePlan = (index) => {
    console.log("Plan To delete", index);
    const filtredPlans = plans.filter((plan, idx)=> idx != index)
    const filtredPlans2 = plans.filter((plan, idx)=> {
      if(idx != index){
        return plan
      }
    })
   

    setPlans(filtredPlans)
  }
  return (
    <>
     
      <FormComponent addPlan={addPlan} />
      <PlansComponent plans={plans} updatePlan={updatePlan} deletePlan={deletePlan} />
    </>
  )
}

export default App