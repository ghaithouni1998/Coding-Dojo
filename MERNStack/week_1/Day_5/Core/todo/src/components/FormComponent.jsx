import React, { useState } from 'react'

const FromComponent = ({ addPlan }) => {
    const [plan, setPlan] = useState({content:"", status:false})
    const formHandler = (e) =>{
        e.preventDefault()
        
        addPlan(plan)
        setPlan({content:"", status:false})
    }
    return (
        <div>
            <form onSubmit={formHandler}>
                <input type="text" onChange={(e) => setPlan({...plan, content:e.target.value})} 
                value={plan.content} />
                <button   type="button" class="btn btn-red mb-2"  >Add</button>
            </form>
        </div>
    )
}

export default FromComponent