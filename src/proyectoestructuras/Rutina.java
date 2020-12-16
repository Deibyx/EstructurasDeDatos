package proyectoestructuras;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Rutina {

    private NodoDoce inicioPila;
    private NodoDoce finPila;

    private NodoDos startPila;
    private NodoDos endPila;

    private NodoCuatro comienzoCola;
    private NodoCuatro finalizarCola;

    private NodoSeis empezarCola;
    private NodoSeis terminarCola;

    private NodoLS inicioLS;

    private NodoLDC inicioDC;
    private NodoLDC finDC;

    private NodoProductos inicioProductos;
    private NodoProductos finProductos;

    private NodoSC inicioSC;
    private NodoSC finSC;

    private NodoArbol raiz;

    private String Producto;

    public Rutina() {

        this.inicioPila = null;
        this.finPila = null;

        this.startPila = null;
        this.endPila = null;

        this.comienzoCola = null;
        this.finalizarCola = null;

        this.empezarCola = null;
        this.terminarCola = null;

        this.inicioLS = null;

        this.inicioDC = null;
        this.finDC = null;

        this.inicioSC = null;
        this.finSC = null;

        this.inicioProductos = null;
        this.finProductos = null;

    }

    /////////////////////////////////////////////////////////////
    public boolean esVaciaSC() {
        if (inicioSC == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaLS() {
        if (inicioLS == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaDoce() {
        if (inicioPila == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaDos() {
        if (startPila == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaCuatro() {
        if (comienzoCola == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaSeis() {
        if (empezarCola == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaLDC() {
        if (inicioDC == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaArbol() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esVaciaProductos() {
        if (inicioProductos == null) {
            return true;
        } else {
            return false;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isInt(String strNum) {
        try {
            int f = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    public void agregarClienteLDC() {
        Dato d = new Dato();

        d.setNombre(JOptionPane.showInputDialog(null,
                "Digite el nombre del cliente: "));

        boolean validacionCedula = false;
        while (!validacionCedula) {

            String cedula = JOptionPane.showInputDialog("Digite el numero de cedula: ");
            if (isInt(cedula)) {
                if (cedula.length() == 9) {
                    validacionCedula = true;

                } else {
                    JOptionPane.showMessageDialog(null, "El número ingresado es inválido.");
                }
                long cedulaValidada = Long.parseLong(cedula);
                d.setCedula(cedulaValidada);
            }
        }

        boolean validacionTelefono = false;
        while (!validacionTelefono) {

            String telefono = JOptionPane.showInputDialog("Digite el numero de telefono: ");
            if (isInt(telefono)) {
                if (telefono.length() == 8) {
                    validacionTelefono = true;

                } else {
                    JOptionPane.showMessageDialog(null, "El número ingresado es inválido.");
                }
                long ltelefono = Long.parseLong(telefono);
                d.setTelefono(Integer.parseInt(telefono));
            }
        }

        boolean validacionCorreo = false;
        while (!validacionCorreo) {

            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            String email = JOptionPane.showInputDialog("Digite el correo electronico: ");

            Matcher mather = pattern.matcher(email);

            if (mather.find() == true) {
                validacionCorreo = true;
            } else {
                JOptionPane.showMessageDialog(null, "El email ingresado es inválido.");
            }

            d.setCorreo(email);

        }

        NodoLDC nuevo = new NodoLDC();
        nuevo.setElemento(d);
        if (esVaciaLDC()) {
            inicioDC = nuevo;
            finDC = nuevo;
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else if (d.getCedula() < inicioDC.getElemento().getCedula()) {
            nuevo.setSiguiente(inicioDC);
            inicioDC = nuevo;
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else if (d.getCedula() >= finDC.getElemento().getCedula()) {
            finDC.setSiguiente(nuevo);
            finDC = nuevo;
            finDC.setSiguiente(inicioDC);
            inicioDC.setAnterior(finDC);
        } else {
            NodoLDC aux = inicioDC;
            while (aux.getSiguiente().getElemento().getCedula() < d.getCedula()) {
                //para ingresar un elemento al medio
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void mostrarClienteLDC() {
        if (!esVaciaLDC()) {
            String s = "";
            NodoLDC aux = inicioDC;
            s = s + " < " + aux.getElemento().getNombre() + " - " + aux.getElemento().getCedula() + " - " + aux.getElemento().getTelefono() + " - " + aux.getElemento().getCorreo() + " >" + "\n";
            aux = aux.getSiguiente();
            while (aux != inicioDC) {
                s = s + " < " + aux.getElemento().getNombre() + " - " + aux.getElemento().getCedula() + " - " + aux.getElemento().getTelefono() + " - " + aux.getElemento().getCorreo() + " >" + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "Nose puede mostrar, lista vacia!");
        }
    }

    public String buscarCliente() {

        String Name = "";

        if (esVaciaLDC()) {

            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");

        } else {

            long cedulaBuscada = Long.parseLong(JOptionPane.showInputDialog(null, "Digite la cédula a buscar:"));

            NodoLDC aux = inicioDC;
            while (aux != null) {
                if (cedulaBuscada == aux.getElemento().getCedula()) {
                    JOptionPane.showMessageDialog(null, "La Persona buscada es: " + aux.getElemento().getNombre());
                    Name = aux.getElemento().getNombre();
                    return Name;
                }
                Name = aux.getElemento().getNombre();
                aux = aux.getSiguiente();
            }

        }
        return Name;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public void apilarDoce(String Name) {

        Name = buscarCliente();

        Dato d = new Dato();

        d.setNombre(Name);

        NodoDoce nuevo = new NodoDoce();
        nuevo.setElemento(d);
        if (esVaciaDoce()) {
            inicioPila = nuevo;

        } else {
            nuevo.setSiguiente(inicioPila);
            inicioPila = nuevo;
        }
    }

    public void mostrarPilaDoce() {
        String s = "";
        if (!esVaciaDoce()) {
            NodoDoce aux = inicioPila;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La pila contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, pila vacía!");
        }
    }

    public void apilarDos(String Name) {
        Name = buscarCliente();
        Dato d = new Dato();
        d.setNombre(Name);
        NodoDos nuevo = new NodoDos();
        nuevo.setElemento(d);
        if (esVaciaDos()) {
            startPila = nuevo;
        } else {
            nuevo.setSiguiente(startPila);
            startPila = nuevo;
        }

    }

    public void mostrarPilaDos() {
        String s = "";
        if (!esVaciaDos()) {
            NodoDos aux = startPila;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La pila contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, pila vacía!");
        }
    }

    public void encolarCuatro(String Name) {
        Name = buscarCliente();
        Dato d = new Dato();
        d.setNombre(Name);
        NodoCuatro nuevo = new NodoCuatro();
        nuevo.setElemento(d);
        if (esVaciaCuatro()) {
            comienzoCola = nuevo;
            finalizarCola = nuevo;
        } else {
            finalizarCola.setSiguiente(nuevo);
            finalizarCola = nuevo;
        }

    }

    public void mostrarColaCuatro() {
        String s = "";
        if (!esVaciaCuatro()) {
            NodoCuatro aux = comienzoCola;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + " <--> ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, cola vacía!");
        }
    }

    public void encolarSeis(String Name) {
        Name = buscarCliente();
        Dato d = new Dato();
        d.setNombre(Name);
        NodoSeis nuevo = new NodoSeis();
        nuevo.setElemento(d);
        if (esVaciaSeis()) {
            empezarCola = nuevo;
            terminarCola = nuevo;
        } else {
            terminarCola.setSiguiente(nuevo);
            terminarCola = nuevo;
        }

    }

    public void mostrarColaSeis() {
        String s = "";
        if (!esVaciaSeis()) {
            NodoSeis aux = empezarCola;
            while (aux != null) {
                s = s + aux.getElemento().getNombre() + " <--> ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, cola vacía!");
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
    public void agregarPesasLS() {
        Dato d = new Dato();
        d.setNombrePesa(JOptionPane.
                showInputDialog(null, "Digite el nombre de la pesa: "));
        d.setPesoPesa(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite el peso de la pesa:")));
        NodoLS nuevo = new NodoLS();
        nuevo.setElemento(d);
        if (esVaciaLS()) {
            inicioLS = nuevo;
        } else if (d.getPesoPesa() < inicioLS.getElemento().getPesoPesa()) {
            nuevo.setSiguiente(inicioLS);
            inicioLS = nuevo;
        } else if (inicioLS.getSiguiente() == null) {
            inicioLS.setSiguiente(nuevo);
        } else {
            NodoLS aux = inicioLS;
            while ((aux.getSiguiente() != null) && (aux.getSiguiente().getElemento().getPesoPesa() < d.getPesoPesa())) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void mostrarPesasLS() {
        if (!esVaciaLS()) {
            String s = "";
            NodoLS aux = inicioLS;
            while (aux != null) {
                s = s + aux.getElemento().getNombrePesa() + " "
                        + aux.getElemento().getPesoPesa() + "<--";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar, lista vacía!");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregarMaquinaSC() {
        Maquina m = new Maquina();
        m.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la maquina: "));
        m.setCodigoMaquina(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo de la maquina: ")));
        m.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de maquina: "));
        m.setEstado(JOptionPane.showInputDialog(null, "Indique si la maquina esta en uso o reparacion: "));

        NodoSC nuevo = new NodoSC();
        nuevo.setEquipo(m);
        if (esVaciaSC()) {
            inicioSC = nuevo;
            finSC = inicioSC;
            finSC.setSiguiente(inicioSC);
        } else if (m.getCodigoMaquina() < inicioSC.getEquipo().getCodigoMaquina()) {
            nuevo.setSiguiente(inicioSC);
            inicioSC = nuevo;
            finSC.setSiguiente(inicioSC);
        } else if (m.getCodigoMaquina() >= finSC.getEquipo().getCodigoMaquina()) {
            finSC.setSiguiente(nuevo);
            finSC = nuevo;
            finSC.setSiguiente(inicioSC);
        } else {
            NodoSC aux = inicioSC;
            while (aux.getEquipo().getCodigoMaquina() < m.getCodigoMaquina()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            finSC.setSiguiente(inicioSC);
        }
    }

    public void mostrarMaquinaSC() {
        if (!esVaciaSC()) {
            String s = "";
            NodoSC aux = inicioSC;
            s = s + "< " + "Codigo: " + aux.getEquipo().getCodigoMaquina() + " Nombre: " + aux.getEquipo().getNombre()
                    + " Estado: " + aux.getEquipo().getEstado() + " Tipo: " + aux.getEquipo().getTipo() + " >\n";
            aux = aux.getSiguiente();
            while (aux != inicioSC) {
                s = s + "< " + "Codigo: " + aux.getEquipo().getCodigoMaquina() + " Nombre: " + aux.getEquipo().getNombre()
                        + " Estado: " + aux.getEquipo().getEstado() + " Tipo: " + aux.getEquipo().getTipo() + " >\n";

                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, lista Vacia!");
        }

    }

    public String buscarMaquina() {

        String Estado = "";

        if (esVaciaSC()) {

            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");

        } else {

            int maquinaBuscada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cédula a buscar:"));

            NodoSC aux = inicioSC;
            while (aux != null) {
                if (maquinaBuscada == aux.getEquipo().getCodigoMaquina()) {
                    JOptionPane.showMessageDialog(null, "El estado de la maquina es: " + aux.getEquipo().getEstado());
                    Estado = aux.getEquipo().getEstado();
                    return Estado;
                }
                Estado = aux.getEquipo().getEstado();
                aux = aux.getSiguiente();
            }

        }
        return Estado;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregarFresco() {
        Refrescos f = new Refrescos();
        f.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite un codigo de refresco: ")));
        NodoArbol nuevo = new NodoArbol();
        nuevo.setElemento(f);
        if (esVaciaArbol()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void crearNodo(NodoArbol raiz, NodoArbol nuevo) {
        if (nuevo.getElemento().getCodigo() <= raiz.getElemento().getCodigo()) {
            if (raiz.getEnlaceIzq() == null) {
                raiz.setEnlaceIzq(nuevo);
            } else {
                crearNodo(raiz.getEnlaceIzq(), nuevo);
            }
        } else {
            if (raiz.getEnlaceDer() == null) {
                raiz.setEnlaceDer(nuevo);
            } else {
                crearNodo(raiz.getEnlaceDer(), nuevo);
            }
        }
    }

    public String mostrarFrescos(String s) {
        if (!esVaciaArbol()) {
            s = s + mostrarNodo(raiz, s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar, árbol vacío!");
        }
        return s;
    }

    public String mostrarNodo(NodoArbol n, String s) {
        if (n != null) {

            s = mostrarNodo(n.getEnlaceIzq(), s);
            s = s + n.getElemento().getCodigo() + " " + this.buscarProductoLista(n.getElemento().getCodigo()) + " <==> ";
            s = mostrarNodo(n.getEnlaceDer(), s);
        }
        return s;
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    public void agregarProductosLDC(String nombre, int code) {
        Refrescos f = new Refrescos();
        f.setNombreProducto(nombre);
        f.setCodigo(code);

        NodoProductos nuevo = new NodoProductos();
        nuevo.setElemento(f);
        if (esVaciaProductos()) {
            inicioProductos = nuevo;
            finProductos = nuevo;
            finProductos.setSiguiente(inicioProductos);
            inicioProductos.setAnterior(finProductos);
        } else if (f.getCodigo() < inicioProductos.getElemento().getCodigo()) {
            nuevo.setSiguiente(inicioProductos);
            inicioProductos = nuevo;
            finProductos.setSiguiente(inicioProductos);
            inicioProductos.setAnterior(finProductos);
        } else if (f.getCodigo() >= finProductos.getElemento().getCodigo()) {
            finProductos.setSiguiente(nuevo);
            finProductos = nuevo;
            finProductos.setSiguiente(inicioProductos);
            inicioProductos.setAnterior(finProductos);
        } else {
            NodoProductos aux = inicioProductos;
            while (aux.getSiguiente().getElemento().getCodigo() < f.getCodigo()) {

                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void mostrarProductosLDC() {
        if (!esVaciaProductos()) {
            String s = "";
            NodoProductos aux = inicioProductos;
            s = s + " < " + aux.getElemento().getNombreProducto() + " - " + aux.getElemento().getCodigo() + " >" + "\n";
            aux = aux.getSiguiente();
            while (aux != inicioProductos) {
                s = s + " < " + aux.getElemento().getNombreProducto() + " - " + aux.getElemento().getCodigo() + " >" + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar, lista vacia!");
        }
    }

    public String buscarProductoLista(int code) {

        String Name = "";

        if (esVaciaProductos()) {

            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");

        } else {

            NodoProductos aux = inicioProductos;
            while (aux != null) {
                if (code == aux.getElemento().getCodigo()) {

                    Name = aux.getElemento().getNombreProducto();
                    return Name;
                }

                aux = aux.getSiguiente();
            }

        }
        return Name;
    }

    public String buscarProducto() {

        Producto = "";

        if (esVaciaArbol()) {

            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía!");

        } else {

            NodoArbol aux2 = raiz;
            int productoBuscado = aux2.getElemento().getCodigo();

            NodoProductos aux = inicioProductos;
            while (aux2 != null) {
                if (productoBuscado == aux2.getElemento().getCodigo()) {
                    JOptionPane.showMessageDialog(null, this.buscarProductoLista(productoBuscado));
                    Producto = aux2.getElemento().getNombreProducto();
                    return Producto;
                } else {

                    Producto = "No identificado";

                }
                Producto = aux2.getElemento().getNombreProducto();
                aux2 = aux2.getEnlaceDer();
            }

        }
        return Producto;
    }
}
