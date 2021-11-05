import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";


function Dashboard() {
    return (
        <>
            <NavBar></NavBar>
            <div className="container">
                <h1 className="text-primary">Dashboard de Vendas</h1>

                <div className="row px-3 py-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
                        <BarChart></BarChart>
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas as Vendas</h5>
                        <DonutChart></DonutChart>
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Todas as Vendas</h2>
                </div>

                <DataTable></DataTable>
            </div>
            <Footer></Footer>
        </>
    );
}

export default Dashboard;