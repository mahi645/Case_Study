import logo from './logo.svg';
import './App.css';
import Signup from './Signup';
import Login from './Login';
import Users from './Users';
import Home from './Home';
import {Routes,Route,BrowserRouter} from 'react-router-dom';
import AddUser from './AddUser';
import Login2 from './Login2';



function App() {
  return (
    <>
      <h1></h1>
      <BrowserRouter>
      <Routes>
        <Route path='/signup' element={<Signup/>}></Route>
        <Route path='/login' element={<Login/>}></Route>
        <Route path='/users' element={<Users/>}></Route>
        <Route path='/home' element={<Home/>}></Route>
        <Route path='/adduser' element={<AddUser/>}></Route>
        <Route path='/login2' element={<Login2/>}></Route>
        
      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
