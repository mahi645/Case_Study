import axios from "axios";
import { useEffect,React, useState } from "react";
import { Link } from "react-router-dom";
function AddUser(){
    const [users,setUsers]=useState([]);
    const [name,setname]=useState('');
    const [uname,setusername]=useState('');
    const [email,setemail]=useState('');
    const [pwd,setpassword]=useState('');
    const [role,setrole]=useState('');
    
    
    
        
    const url='http://localhost:9001/api/v6/signup';
    useEffect(()=>{
        let data={
            name:name,
            username:uname,
            email:email,
            password:pwd,
            role:role
        }
        axios.get(url).then(res=>{
            console.log(res.data)
            setUsers(res.data)
        })

    },[]);
    const postData=(e)=>{
        e.preventDefault();
        axios.delete(url,{
            name:name,
            username:uname,
            email:email,
            password:pwd,
            role:role

        }).then(res=>console.log(res)).catch(err=>console.log(err))

    }
    return(
        <div id="signup-div">
        <h2>Sign up</h2>
        Name:<input type="text" onChange={(e)=>setname(e.target.value)}/><br/><br/>
        Email:<input type="email" onChange={(e)=>setemail(e.target.value)}/><br/><br/>
        UserName:<input type="text" onChange={(e)=>setusername(e.target.value)}/><br/><br/>
        Role:<input type="text" onChange={(e)=>setrole(e.target.value)}/><br/><br/>
        Password:<input type="password" onChange={(e)=>setpassword(e.target.value)}/><br/><br/>
        <button onClick={postData}>Register</button><br/>
        <Link id="link" to='/login'>Alredy Registerd!!!! Login</Link> 
    </div>
    )
}

export default AddUser;