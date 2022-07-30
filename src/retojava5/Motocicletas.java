package retojava5;

public class Motocicletas {
    private String nombre_fabricante;
    private int precio_moto;
    private String bateria;
    private String nombre_prov;

    public Motocicletas(String nombre_fabricante, int precio_moto, String bateria, String nombre_prov) {
        this.nombre_fabricante = nombre_fabricante;
        this.precio_moto = precio_moto;
        this.bateria = bateria;
        this.nombre_prov = nombre_prov;
    }

    public String getNombre_fabricante() {
        return nombre_fabricante;
    }

    public void setNombre_fabricante(String nombre_fabricante) {
        this.nombre_fabricante = nombre_fabricante;
    }

    public int getPrecio_moto() {
        return precio_moto;
    }

    public void setPrecio_moto(int precio_moto) {
        this.precio_moto = precio_moto;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    @Override
    public String toString() {
        return "Motocicletas{" + "nombre_fabricante=" + nombre_fabricante + ", precio_moto=" + precio_moto + ", bateria=" + bateria + ", nombre_prov=" + nombre_prov + '}';
    }
    
}
