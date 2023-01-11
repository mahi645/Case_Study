import logo from './logo.svg';
import './App.css';
import {Routes,Route,BrowserRouter} from 'react-router-dom';
import Welcome from './Welcome';
import Login from './Login';
import Signup from './Signup';
import WelcomeUser from './WelcomeUser';
import AdminViewDoctors from './AdminViewDoctors';
import AddDoctor from './AddDoctor';
import UserViewDoctor from './UserVIewDoctor';
function App() {
  return (
    
         <>
         <BrowserRouter>
          <Routes>
            <Route path="welcome" element={<Welcome/>}> </Route>
            <Route path="/login" element={<Login/>}> </Route>
            <Route path="/signup" element={<Signup/>}> </Route>
            <Route path="/userwelcome" element={<WelcomeUser/>}> </Route>
            <Route path="/admin/doctors" element={<AdminViewDoctors/>}> </Route>
            <Route path="/add/doctors" element={<AddDoctor/>}> </Route>
            <Route path="/user/doctors" element={<UserViewDoctor/>}> </Route>
          </Routes>
         </BrowserRouter>
         </>
  );
}

export default App;
