import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1>Olá Mundo</h1>

        <DataTable></DataTable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
