import { useEffect,React, useState } from "react";
import { Link } from "react-router-dom";
import axios from 'axios';
function Users(){
    const [users,setUsers]=useState([]);
    
    const url='http://localhost:9001/api/v6/signin';
    useEffect(()=>{
        axios.get(url).then(res=>{
            //console.log(res.data);
            setUsers(res.data)
        })

    },[]);
    
    const postDelete=(id,e)=>{
        e.preventDefault();
        axios.delete('http://localhost:9001/api/v6/delete/${id}')
        .then(res=>console.log("Deleted!!!!!",res)).catch(err=>console.log(err))

    }
    
   
    
    return(
        <>
        <h1>Get All users</h1><br/>
       <table id="product-table">
            <thead>
                <th>Id</th>
                <th>Name</th>
                <th>UserName</th>
                <th>Email</th>
                <th>Password</th>
                <th>Role</th>
            </thead>
            {
                users.map(p=><tr><td>{p.id}</td>
                                <td>{p.name}</td>
                                <td>{p.username}</td>
                                <td>{p.email}</td>
                                <td>{p.password}</td>
                                <td>{p.role}</td>
                                <td><button >EDIT</button></td>
                                <td><button onClick={(e)=>postDelete(p.id,e)}>Delete</button></td>
                            </tr>)
            }
        </table>
        
        <Link to='/home'>Home</Link>
        </>
    )
}
export default Users;