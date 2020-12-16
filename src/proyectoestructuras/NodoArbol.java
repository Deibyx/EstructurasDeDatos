
package proyectoestructuras;

public class NodoArbol {
    
        private Refrescos elemento;
    private NodoArbol enlaceIzq;
    private NodoArbol enlaceDer;

    public NodoArbol(Refrescos f) {
        this.elemento = f;
    }

    public NodoArbol() {
        this.enlaceIzq = null;
        this.enlaceDer = null;
    }

    public Refrescos getElemento() {
        return elemento;
    }

    public void setElemento(Refrescos elemento) {
        this.elemento = elemento;
    }

    public NodoArbol getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoArbol enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoArbol getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoArbol enlaceDer) {
        this.enlaceDer = enlaceDer;
    }
}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/