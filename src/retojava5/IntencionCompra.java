package retojava5;

public class IntencionCompra {
    private String cliente_alias;
    private String motocicletas_nom_fab;
    private String bicicleta_nom_fab;
    private String fecha;

    public IntencionCompra(String cliente_alias, String motocicletas_nom_fab, String bicicleta_nom_fab, String fecha) {
        this.cliente_alias = cliente_alias;
        this.motocicletas_nom_fab = motocicletas_nom_fab;
        this.bicicleta_nom_fab = bicicleta_nom_fab;
        this.fecha = fecha;
    }

    public String getCliente_alias() {
        return cliente_alias;
    }

    public void setCliente_alias(String cliente_alias) {
        this.cliente_alias = cliente_alias;
    }

    public String getMotocicletas_nom_fab() {
        return motocicletas_nom_fab;
    }

    public void setMotocicletas_nom_fab(String motocicletas_nom_fab) {
        this.motocicletas_nom_fab = motocicletas_nom_fab;
    }

    public String getBicicleta_nom_fab() {
        return bicicleta_nom_fab;
    }

    public void setBicicleta_nom_fab(String bicicleta_nom_fab) {
        this.bicicleta_nom_fab = bicicleta_nom_fab;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "IntencionCompra{" + "cliente_alias=" + cliente_alias + ", motocicletas_nom_fab=" + motocicletas_nom_fab + ", bicicleta_nom_fab=" + bicicleta_nom_fab + ", fecha=" + fecha + '}';
    }
    
    
}
