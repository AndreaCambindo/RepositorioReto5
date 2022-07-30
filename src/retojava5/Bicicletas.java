package retojava5;

public class Bicicletas {
    private String nombre_fab_bici;
    private String precio_bici;
    private String anno_construccion;

    public Bicicletas(String nombre_fab_bici, String precio_bici, String anno_construccion) {
        this.nombre_fab_bici = nombre_fab_bici;
        this.precio_bici = precio_bici;
        this.anno_construccion = anno_construccion;
    }

    public String getNombre_fab_bici() {
        return nombre_fab_bici;
    }

    public void setNombre_fab_bici(String nombre_fab_bici) {
        this.nombre_fab_bici = nombre_fab_bici;
    }

    public String getPrecio_bici() {
        return precio_bici;
    }

    public void setPrecio_bici(String precio_bici) {
        this.precio_bici = precio_bici;
    }

    public String getAnno_construccion() {
        return anno_construccion;
    }

    public void setAnno_construccion(String anno_construccion) {
        this.anno_construccion = anno_construccion;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "nombre_fab_bici=" + nombre_fab_bici + ", precio_bici=" + precio_bici + ", anno_construccion=" + anno_construccion + '}';
    }
      
}
