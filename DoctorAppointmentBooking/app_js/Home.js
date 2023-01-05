import { Link } from "react-router-dom";
function Home(){
    return(
        <>
        <ul >
            <h5>Home</h5>
            <h5><Link to='/users'>Users</Link></h5>
        </ul>
        </>
    )

}
export default Home;