import { useState } from 'react';
import {Link,useNavigate} from 'react-router-dom'
function Login2(){
    // const history = useHistory();
    const navigate = useNavigate();
    const [uname,setuname]=useState('');
    const [pwd,setpwd]=useState('');
    const validate=()=>{
        if(uname==""||pwd==""){
            alert("Fill Credentials")
        }
        let data={
            username:uname,
            password:pwd
        }
        fetch('http://localhost:9001/api/v6/validate',{
            method:"POST",
            body:JSON.stringify(data),
            headers:{
                "Content-Type":"application/json",
                "Access-Control-Allow-Origin":"*"
            }
        }).then(response=>{return response.text();})
        .then((text)=>{
            if(text=='valid'){
                // alert("login successful");
                // pathchg(history);
                navigate('/home');
            }
            else{
                alert("please verify credentials")
            }
        })
    }
    // const pathchg=(history)=>{
    //     let path = `/home`; 
    //     history.push(path);
    // }
    return(
        // <>
        // <h2>login</h2>
        // <Link to="/home" >Home</Link>
        // <Link to="/Signup" >Signup Here</Link>

        // </>
         <div id='login-div'>
         <h2>Login</h2>
         UserName:<input type="text" onChange={(e)=>setuname(e.target.value)}/><br/><br/>
         Password:<input type="password" onChange={(e)=>setpwd(e.target.value)}/><br/><br/>
         <button onClick={validate}>login</button><br/><br/>
         {/* <Link to="/home" >Home</Link> */}
         <Link to="/Signup" id='link' >Signup Here</Link>
         </div>
    )
}
export default Login2;
