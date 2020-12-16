package proyectoestructuras;
public class Nodo {
    private Dato elemento; 
    private Nodo siguiente; 
    
    public Nodo(){
        this.siguiente=null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/