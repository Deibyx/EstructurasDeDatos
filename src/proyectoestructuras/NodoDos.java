package proyectoestructuras;
public class NodoDos {

    private Dato elemento;
    private NodoDos siguiente;

    public NodoDos() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoDos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDos siguiente) {
        this.siguiente = siguiente;
    }

}
