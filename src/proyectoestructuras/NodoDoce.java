package proyectoestructuras;
public class NodoDoce {

    private Dato elemento;
    private NodoDoce siguiente;

    public NodoDoce() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoDoce getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoce siguiente) {
        this.siguiente = siguiente;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/