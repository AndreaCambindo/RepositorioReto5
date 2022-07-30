package retojava5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDAO {
    
    public static boolean insertarClientes(Connection conn, Clientes clientes){
        int filasAfectadas=0;
        String sql="INSERT INTO clientes(cli_alias, cli_nombres, cli_apellidos, cli_email, cli_celular, cli_contraseña)"
                + "VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, clientes.getAlias_cliente());
            statement.setString(2, clientes.getNombre_cliente());
            statement.setString(3, clientes.getApellido_cliente());
            statement.setString(4, clientes.getEmail_cliente());
            statement.setString(5, clientes.getCelular_cliente());
            statement.setString(6, clientes.getContraseña_cliente());
            
            filasAfectadas=statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACION SQL");
            ex.printStackTrace();
        }
        if(filasAfectadas > 0){
            return true;
        }else{
            return false;
        }   
    }
    
    public static boolean insertarProveedorMotos(Connection conn, ProveedorMotos proveedor){
        int filasAfectadas=0;
        String sql="INSERT INTO proveedores(prov_nombre, prov_direccion, prov_telefono)"
                + "VALUES(?,?,?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, proveedor.getNombre_prov());
            statement.setString(2, proveedor.getDireccion_prov());
            statement.setString(3, proveedor.getTelefono_prov());

            filasAfectadas=statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACION SQL");
            ex.printStackTrace();
        }
        if(filasAfectadas > 0){
            return true;
        }else{
            return false;
        }   
    }    
    
    public static boolean insertarMotocicletas(Connection conn, Motocicletas moto){
        int filasAfectadas=0;
        String sql="INSERT INTO motocicletas_electricas(nombre_fabricante, mot_precio_unitario, mot_bateria, mot_prov_nombre)"
                + "VALUES(?,?,?,?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, moto.getNombre_fabricante());
            statement.setInt(2, moto.getPrecio_moto());
            statement.setString(3, moto.getBateria());
            statement.setString(4, moto.getNombre_prov());

            filasAfectadas=statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACION SQL");
            ex.printStackTrace();
        }
        if(filasAfectadas > 0){
            return true;
        }else{
            return false;
        }   
    }    
    
}
