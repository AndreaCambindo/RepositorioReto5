package retojava5;

public class ProveedorMotos {
   private String nombre_prov; 
   private String direccion_prov;
   private String telefono_prov;

    public ProveedorMotos(String nombre_prov, String direccion_prov, String telefono_prov) {
        this.nombre_prov = nombre_prov;
        this.direccion_prov = direccion_prov;
        this.telefono_prov = telefono_prov;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    public String getDireccion_prov() {
        return direccion_prov;
    }

    public void setDireccion_prov(String direccion_prov) {
        this.direccion_prov = direccion_prov;
    }

    public String getTelefono_prov() {
        return telefono_prov;
    }

    public void setTelefono_prov(String telefono_prov) {
        this.telefono_prov = telefono_prov;
    }

    @Override
    public String toString() {
        return "ProveedorMotos{" + "nombre_prov=" + nombre_prov + ", direccion_prov=" + direccion_prov + ", telefono_prov=" + telefono_prov + '}';
    }
   
}
