import React from 'react'

const PlansComponents = ({plans, updatePlan, deletePlan}) => {
  return (
    <div>
        {plans.map((plan, idx)=> <div key={idx} style={{display:"flex"}}>
            <h4 style={plan.status?{backgroundColor:"red"}:{backgroundColor:"white"}}>{plan.content}</h4>
            <input type='checkbox' checked={plan.status} 
            onChange={(e)=> updatePlan(idx)}
            />
            <button onClick={()=> deletePlan(idx)  } type="button" class="btn btn-secondary mb-2">Delete</button>
            </div>)}
    </div>
  )
}

export default PlansComponents