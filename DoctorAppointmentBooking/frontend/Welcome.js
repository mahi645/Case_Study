import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';  
import { Navbar, Container, Nav, NavDropdown } from 'react-bootstrap';
import Image from "react-bootstrap/Image"; 
import baby from './baby.jpg';
function Welcome(){
    
    return(
        
          
          <div className='container-fluid'> 
        <Navbar collapseOnSelect expand="xl" bg="dark" variant="dark">  
        
        <div className="container"> 
        
          <Navbar.Brand href="#home">Sreenithya Health Care</Navbar.Brand>  
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />  
          <Navbar.Collapse id="responsive-navbar-nav">  
            <Nav className="me-auto">  
              <Nav.Link href="#features">About</Nav.Link>  
              <Nav.Link href="#pricing">Contacts</Nav.Link>  
              <NavDropdown title="Centres of Excellence" id="collasible-nav-dropdown">  
                <NavDropdown.Item href="#action/3.1">Pain Management</NavDropdown.Item>  
                <NavDropdown.Item href="#action/3.2">Kidney Transplant</NavDropdown.Item>  
                <NavDropdown.Item href="#action/3.3">Cardiology</NavDropdown.Item> 
                <NavDropdown.Item href="#action/3.3">Orthopedics</NavDropdown.Item> 
                <NavDropdown.Item href="#action/3.3">Oncology</NavDropdown.Item> 
                <NavDropdown.Item href="#action/3.3">ICU</NavDropdown.Item> 
                <NavDropdown.Item href="#action/3.3">Emergency</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.3">Gastroenterology</NavDropdown.Item>  

                <NavDropdown.Divider />  
                <NavDropdown.Item href="#action/3.4">Separated Item</NavDropdown.Item>  
              </NavDropdown>  
            </Nav>  
            <Nav>  
                <NavDropdown title="Login" id="collasible-nav-dropdown">
                    <NavDropdown.Item href="/admin/login">Admin</NavDropdown.Item>
                    <NavDropdown.Item href="/doctor/login">Doctor</NavDropdown.Item>
                    <NavDropdown.Item href="/user/login">Patient</NavDropdown.Item>
                </NavDropdown>
              <Nav.Link href="/welcome">Signup</Nav.Link>  
               
            </Nav>  
          </Navbar.Collapse>  
          
          
        </div>  
      </Navbar>
      <div className='container' id="welcome-body">
        <br/>
         <h1 id="welcome-title">Welcome to SreeNithya Healthcare</h1><br/>
          <div className='row'>
              <img
                src='https://uploads-ssl.webflow.com/5fe0853f9e6927bb4c1a6644/60190d624e95eb7ba1f57550_doctor%20patient-min%20(1)-p-1600.jpeg'
                className='img-fluid shadow-2-strong'
                alt=''
                />
              <div className='mask' style={{ backgroundColor: 'rgba(0, 0, 0, 0.6)' }}>
                  <div className='d-flex justify-content-center align-items-center h-100'>
                  <p className='text-white mb-0'>Always there for you and your family</p>
                  </div>
              </div>
          </div>
      
        </div>
        
    </div>
    
    )
}
export default Welcome;