package co.edu.udec;

import co.edu.udec.domain.model.Lista;

public class PruebaDeLista {
    public static void main(String[] args) {
        String s1 = "Toyota";
        String s2 = "Mazda";
        Lista l = new Lista();

        try {
            System.out.println("Elementos: " + l.cuentaElementos());
            l.agregar(s1);
            System.out.println("Elementos: " + l.cuentaElementos());
            l.agregar(s2);
            System.out.println("Elementos: " + l.cuentaElementos());
            System.out.println("En la posicion 1: " + l.buscarDato(1));
            System.out.println("En la posicion 0: " + l.buscarDato(0));
            System.out.println("El Mazda esta en la posicion: " + l.buscarDato("Mazda"));
            System.out.println("El Toyota esta en la posicion: " + l.buscarDato("Toyota"));
            System.out.println("El Nissan esta en la posicion: " + l.buscarDato("Nissan"));
            System.out.println(l.buscarDato((2)));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
