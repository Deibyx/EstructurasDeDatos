package proyectoestructuras;
public class NodoLDC {
    private Dato elemento; 
    private NodoLDC siguiente; 
    private NodoLDC anterior;
    
    public NodoLDC(){
        this.siguiente=null;
        this.anterior=null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoLDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDC anterior) {
        this.anterior = anterior;
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/