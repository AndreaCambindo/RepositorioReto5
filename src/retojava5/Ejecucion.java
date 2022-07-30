package retojava5;

import java.sql.Connection;

public class Ejecucion {
    
    public static void main(String[] args) {
        ConexionBDR4.conectarBDR4();
        Connection conn = ConexionBDR4.conectarBDR4();
        
        //Creo cliente
        Clientes cli1 = new Clientes("tito", "Alberto", "Ruiz", "AlRu@correo.com", "3103459811", "tito123");
        ProveedorMotos prov1 = new ProveedorMotos("Yamaha", "Calle 5 # 80c - 130", "3201236543");
        Motocicletas moto1 = new Motocicletas("Royal", 1200000, "40 horas", "Yamaha");
        
                
                
        //Create 
//        boolean resultado=EcoDAO.insertarClientes(conn, cli1);
//        if (resultado==true){
//            System.out.println("Inserto correctamente");
//        }else{
//            System.out.println("No se creo el registro");
//        }
        
//        boolean resultado=EcoDAO.insertarProveedorMotos(conn, prov1);
//        if (resultado==true){
//            System.out.println("Inserto correctamente");
//        }else{
//            System.out.println("No se creo el registro");
//        }        
        

//        boolean resultado=EcoDAO.insertarMotocicletas(conn, moto1);
//        if (resultado==true){
//            System.out.println("Inserto correctamente");
//        }else{
//            System.out.println("No se creo el registro");
//        }   
        
        
    }
}
