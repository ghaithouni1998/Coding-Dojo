import React, { useState } from 'react'

const Form = () => {

    const [firstname, setFirstname] = useState('')
    const [lastname, Setlastname] = useState('')
    const [email, Setemail] = useState('')
    const [password, Setpassword] = useState('')
    const [confirmpassword, Setconfirmpassword] = useState('')

    const createUser = (e) => {
        // we must prevent the default refresh of the browser to keep our state from being reset
        e.preventDefault();
    };

    return (
        <fieldset>
            <form onSubmit={createUser}>
                <div>
                    <label>firstname :</label>
                    <input type="text" onChange={(e) => setFirstname(e.target.value)} />
                    {firstname.length < 2 ? <p >firstname must be at least 2</p> : <p > firstname Valid!</p>}
                </div>
                <div>
                    <label>lastname : </label>
                    <input type="text" value={lastname} onChange={(e) => Setlastname(e.target.value)} />
                    {lastname.length < 2 ? <p >lastname must be at least 2</p> : <p > lastname Valid!</p>}
                </div>
                <div>
                    <label> email : </label>
                    <input type="email" value={email} onChange={(e) => Setemail(e.target.value)} />
                    {email.length < 2 ? <p >email must be at least 2</p> : <p > email Valid!</p>}
                </div>
                <div>
                    <label> password :</label>
                    <input type="password" value={password} onChange={(e) => Setpassword(e.target.value)} />
                    {password.length < 8 ? <p >password must be at least 8 </p> : <p > password Valid!</p>}
                </div>
                <div>
                    <label> confirmpassword : </label>
                    <input type="password" value={confirmpassword} onChange={(e) => Setconfirmpassword(e.target.value)} />
                    <p style={{color:"red"}}>{confirmpassword!=password?"Passwords mast match !":""}</p>
                    {/* <input type="password" onChange={(e) => setUserCPass(e.target.value)} /> */}
                </div>
            </form>

        </fieldset>
    )
}

export default Form