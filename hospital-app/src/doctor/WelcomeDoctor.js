import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';  
import { Navbar, Container, Nav, NavDropdown, NavItem } from 'react-bootstrap';
import doctor from '../images/doctor.jpg';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
function WelcomeDoctor(){
return(
    
        <div id='user-main'>
        <Navbar collapseOnSelect expand="xl" bg="dark" variant="dark" id="navbar-user">  
    
        <div className='container' id="nav-user" style={{height:56}}>
          <Navbar.Brand href="#home">Sreenithya Health Care</Navbar.Brand><br/>  
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />  
          <Navbar.Collapse id="responsive-navbar-nav">  
            <Nav className="me-auto">  
                <NavItem>Hello User</NavItem>
            </Nav>
            
            <Nav>  
                <Nav.Link href='/user/doctors'>Doctors</Nav.Link>
                <Nav.Link href='/appointments'>Appointments</Nav.Link>
                <Nav.Link href="/welcome">Sign out</Nav.Link>  
               
               
            </Nav>  
          </Navbar.Collapse>  
          
          
    
        </div>
        
      </Navbar>
      <div style={{display:'block'}} id="user-body">
        
        <Row id="user-row">
            <Col id='user-text'>
                <p/><br/>
                <p/><br/>
                <p/><br/>
                <p/><br/>
                <p/><br/>
                <p/><br/>
                <h3 style={{textAlign:'center'}}>We Always there for you.</h3>
                <div>
                    <p style={{fontSize:20}}>Feel free to express your Problem.
                    Efficiency is our priority for you.This is your healthcare.Save A Life.Where care comes first 
                    </p>
                </div>
                </Col>
           
            <Col id="user-image" >
                <img  style={{height:600}} src={doctor} 
                alt=''/>
                
      
            </Col>
        </Row>
    </div>
    </div>

)
}
export default WelcomeDoctor;