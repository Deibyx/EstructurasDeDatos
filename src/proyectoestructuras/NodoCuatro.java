package proyectoestructuras;
public class NodoCuatro {

    private Dato elemento;
    private NodoCuatro siguiente;

    public NodoCuatro() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoCuatro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCuatro siguiente) {
        this.siguiente = siguiente;
    }

}
