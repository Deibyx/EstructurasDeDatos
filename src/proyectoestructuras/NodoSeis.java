package proyectoestructuras;

public class NodoSeis {

    private Dato elemento;
    private NodoSeis siguiente;

    public NodoSeis() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoSeis getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSeis siguiente) {
        this.siguiente = siguiente;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/