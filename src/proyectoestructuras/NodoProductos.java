
package proyectoestructuras;

public class NodoProductos {
    
    private Refrescos elemento; 
    private NodoProductos siguiente; 
    private NodoProductos anterior;

    public NodoProductos() {
        this.elemento=null;
        this.siguiente=null;
        this.anterior=null;
    }

    public Refrescos getElemento() {
        return elemento;
    }

    public void setElemento(Refrescos elemento) {
        this.elemento = elemento;
    }

    public NodoProductos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProductos siguiente) {
        this.siguiente = siguiente;
    }

    public NodoProductos getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoProductos anterior) {
        this.anterior = anterior;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/