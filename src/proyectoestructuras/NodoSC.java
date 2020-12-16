package proyectoestructuras;
public class NodoSC {
    private Maquina equipo;
    private NodoSC siguiente;
    
    public NodoSC(){
        this.siguiente=null;
    }

    public Maquina getEquipo() {
        return equipo;
    }

    public void setEquipo(Maquina equipo) {
        this.equipo = equipo;
    }

    public NodoSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/