import { useState } from "react";
import {json,Link } from "react-router-dom";
function Signup(){
    const [uname,setuname]=useState('');
    const [pwd,setpassword]=useState('');
    const [name,setname]=useState('');
    const [role,setrole]=useState('');
    const [email,setemail]=useState('');
    
    const register=()=>{
        alert(uname+" "+pwd);
        let data={
            name:name,
            username:uname,
            email:email,
            password:pwd,
            role:role
        }
        fetch('http://localhost:9001/api/v6/signup',{
            method:"POST",
            body:JSON.stringify(data),
            headers:{
                "Content-Type":"application/json",
                "Access-Control-Allow-Origin":"*"
            }
        }).then(response=>response.json())
        .then(json=>console.log(json));

    }

    return(
        <div id="signup-div">
            <h2>Sign up</h2>
            Name:<input type="text" onChange={(e)=>setname(e.target.value)}/><br/><br/>
            Email:<input type="email" onChange={(e)=>setemail(e.target.value)}/><br/><br/>
            UserName:<input type="text" onChange={(e)=>setuname(e.target.value)}/><br/><br/>
            Role:<input type="text" onChange={(e)=>setrole(e.target.value)}/><br/><br/>
            Password:<input type="password" onChange={(e)=>setpassword(e.target.value)}/><br/><br/>
            <button onClick={register}>Register</button><br/>
            <Link id="link" to='/login'>Alredy Registerd!!!! Login</Link> 
        </div>
    )
}
export default Signup;