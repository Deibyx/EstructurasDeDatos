package proyectoestructuras;

import javax.swing.JOptionPane;

public class Menu {

    private int opc, opc2, opc3, opc4, opc5;

    private Rutina r = new Rutina();
    private String s = "";

    public void mostrarMenu() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "*MENU PRINCIPAL*\n\n"
                + "1.Agregar Cliente\n"
                + "2.Mostrar Clientes\n"
                + "3.Buscar Clientes\n"
                + "4.Horarios\n"
                + "5.Maquinas\n"
                + "6.Pesas\n"
                + "7.Refrescos\n"
                + "8.Salir\n\n"
                + "Digite su opción:"));
        switch (opc) {
            case 1: {
                r.agregarClienteLDC();
                mostrarMenu();
            }
            case 2: {
                r.mostrarClienteLDC();
                mostrarMenu();
            }
            case 3: {
                r.buscarCliente();
                mostrarMenu();
            }
            case 4: {
                mostrarMenuDos();
            }
            case 5: {
                mostrarMenuTres();
            }
            case 6: {
                mostrarMenuCuatro();
            }
            case 7: {
                mostrarMenuCinco();
            }
            case 8: {
                System.exit(0);
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Debe seleeccionar una opción correcta!");
                mostrarMenu();
            }

        }
    }

    public void mostrarMenuDos() {

        opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "**MENU**\n\n"
                + "1.Agregar persona de 12PM a 2PM\n"
                + "2.Agregar persona de 2PM a 4 PM\n"
                + "3.Agregar persona de 4PM a 6PM\n"
                + "4.Agregar persona de 6PM a 8PM\n\n"
                + "5.Mostrar lista de 12PM a 2PM\n"
                + "6.Mostrar lista de 2PM a 4 PM\n"
                + "7.Mostrar lista de 4PM a 6PM\n"
                + "8.Mostrar lista de 6PM a 8PM\n"
                + "9.Salir\n\n"
                + "Digite su opción:"));

        switch (opc2) {
            case 1: {

                r.apilarDoce("");
                mostrarMenuDos();
            }
            case 2: {

                r.apilarDos("");
                mostrarMenuDos();
            }
            case 3: {
                r.encolarCuatro("");
                mostrarMenuDos();
            }
            case 4: {
                r.encolarSeis("");
                mostrarMenuDos();
            }
            case 5: {
                r.mostrarPilaDoce();
                mostrarMenuDos();
            }
            case 6: {
                r.mostrarPilaDos();
                mostrarMenuDos();
            }
            case 7: {
                r.mostrarColaCuatro();
                mostrarMenuDos();
            }
            case 8: {
                r.mostrarColaSeis();
                mostrarMenuDos();
            }
            case 9: {

                mostrarMenu();
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Debe seleeccionar una opción correcta!");
                mostrarMenu();
            }
        }

    }

    public void mostrarMenuTres() {

        opc3 = Integer.parseInt(JOptionPane.showInputDialog(null, "**MENU MAQUINAS**\n\n"
                + "1.Agregar Maquina\n"
                + "2.Mostrar listado de maquinas\n"
                + "3.Verificar estado maquina\n"
                + "4.Salir\n\n"
                + "Digite su opción:"));

        switch (opc3) {
            case 1: {
                r.agregarMaquinaSC();
                mostrarMenuTres();

            }
            case 2: {
                r.mostrarMaquinaSC();
                mostrarMenuTres();
            }
            case 3: {
                r.buscarMaquina();
                mostrarMenuTres();
            }
            case 4: {
                mostrarMenu();
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Debe seleeccionar una opción correcta!");
                mostrarMenu();
            }
        }

    }

    public void mostrarMenuCuatro() {

        opc4 = Integer.parseInt(JOptionPane.showInputDialog(null, "**MENU PESAS**\n\n"
                + "1.Agregar Pesa\n"
                + "2.Mostrar listado de pesas\n"
                + "3.Salir\n\n"
                + "Digite su opción:"));

        switch (opc4) {
            case 1: {
                r.agregarPesasLS();
                mostrarMenuCuatro();
            }
            case 2: {
                r.mostrarPesasLS();
                mostrarMenuCuatro();
            }
            case 3: {

                mostrarMenu();
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Debe seleeccionar una opción correcta!");
                mostrarMenu();
            }
        }
    }

    public void mostrarMenuCinco() {
        s = "";
        opc5 = Integer.parseInt(JOptionPane.showInputDialog(null, "**MENU Refrescos**\n\n"
                + "1.Agregar Refresco\n"
                + "2.Mostrar listado de frescos\n"
                + "3.Salir\n\n"
                + "Digite su opción:"));

        switch (opc5) {
            case 1: {

                r.agregarProductosLDC("Agua", 7777);
                r.agregarProductosLDC("Gatorade", 1425);
                r.agregarProductosLDC("Powerade", 2514);
                r.agregarProductosLDC("RedBull", 9856);

                r.agregarFresco();
                mostrarMenuCinco();
            }
            case 2: {
                s = s + r.mostrarFrescos(s);
                JOptionPane.showMessageDialog(null, "Lista de refrescos disponibles: \n" + s);
                mostrarMenuCinco();
            }
            case 3: {

                mostrarMenu();

            }
            default: {
                JOptionPane.showMessageDialog(null, "Debe seleeccionar una opción correcta!");
                mostrarMenu();
            }
        }
    }

}
/*Autores: Deiby Chaves Morales & Angelica Marenco Perez*/