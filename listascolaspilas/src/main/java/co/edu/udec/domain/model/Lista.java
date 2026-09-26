package co.edu.udec.domain.model;

public class Lista {
    private int cuenta;
    private Nodo primero;
    private Nodo ultimo;

    public boolean estaVacia() {
        return cuenta == 0;
    }

    public void agregar(Object dato) throws Exception {
        if (dato == null) {
            throw new Exception("El dato no puede ser nulo");
        }

        Nodo objetivo = new Nodo(dato);
        if (estaVacia()) {
            objetivo.setIzquierda(null);
            objetivo.setDerecha(null);
            primero = objetivo;
            ultimo = objetivo;
        } else {
            ultimo.setDerecha(objetivo);
            objetivo.setIzquierda(ultimo);
            objetivo.setDerecha(null);
            ultimo = objetivo;
        }

        ++cuenta;
    }

    private Nodo buscar(int indice) throws Exception {
        if (estaVacia()) {
            throw new Exception("La lista esta vacia");
        }

        if (indice < 0 || indice >= cuenta) {
            throw new Exception("La posicion " + indice + " esta fuera del rango 0 - " + (cuenta - 1));
        }

        Nodo actual = primero;
        for (int i = 0; i < indice; ++i) {
            if (indice == i) {
                break;
            }
            actual = actual.getDerecha();
        }
        return actual;
    }

    private int buscar(Object dato) throws Exception {
        if (estaVacia()) {
            throw new Exception("La lista esta vacia");
        }
        Nodo actual = primero;

        for (int i = 0; i < cuenta; ++i) {
            if (actual.getDato().equals(dato)) {
                return i;
            }
            actual = actual.getDerecha();
        }
        throw new Exception("El elemento no se encuentra en la lista");
    }

    public Object buscarDato(int indice) throws Exception {
        Nodo objetivo = buscar(indice);
        return objetivo.getDato();
    }

    public int buscarDato(Object dato) throws Exception {
        return buscar(dato);
    }

    public int cuentaElementos() {
        return cuenta;
    }
}
