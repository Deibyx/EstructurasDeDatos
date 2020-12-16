package proyectoestructuras;
public class Maquina {
    private String nombre;
    private int codigoMaquina;
    private String tipo;
    private String estado;
    
    public Maquina(){
        this.codigoMaquina=0;
        this.nombre=null;
        this.estado=null;
        this.tipo=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(int codigoMaquina) {
        this.codigoMaquina = codigoMaquina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/