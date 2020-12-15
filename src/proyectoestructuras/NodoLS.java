package proyectoestructuras;

public class NodoLS {
    private Dato elemento;
    private NodoLS siguiente;

    public NodoLS() {
        this.siguiente=null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoLS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
