package proyectoestructuras;

public class Dato {

    private int telefono;
    private long cedula;
    private String correo;
    private String nombre;
    private String nombrePesa;
    private int pesoPesa;

    public Dato() {
        this.cedula = 0;
        this.telefono = 0;
        this.correo = null;
        this.nombre = null;
        this.nombrePesa = null;
        this.pesoPesa = 0;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePesa() {
        return nombrePesa;
    }

    public void setNombrePesa(String nombrePesa) {
        this.nombrePesa = nombrePesa;
    }

    public int getPesoPesa() {
        return pesoPesa;
    }

    public void setPesoPesa(int pesoPesa) {
        this.pesoPesa = pesoPesa;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/