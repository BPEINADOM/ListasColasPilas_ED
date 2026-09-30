package co.edu.udec.domain.model;

public class Pila {
    private int cuenta;
    private Nodo cima;

    public Pila() {
        cuenta = 0;
        cima = null;
    }

    public boolean estaVacia() {
        return cuenta == 0;
    }

    // Apilar (push)

    public void apilar(Object data) throws Exception {
        if (data == null) {
            throw new Exception("El dato no puede ser nulo.");
        }

        Nodo nuevo = new Nodo(data);

        if (estaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setDerecha(cima);
            cima.setIzquierda(nuevo);
            cima = nuevo;
        }

        ++cuenta;
    }

    // Desapilar (pop)

    public Object desapilar() throws Exception {
        if (estaVacia()) {
            throw new Exception("La pila esta vacia.");
        }

        Object dato = cima.getDato();
        cima = cima.getIzquierda();

        if (cima != null) {
            cima.setDerecha(null);
        }

        --cuenta;
        return dato;
    }

    // Consultar el tope (peek)

    public Object peek() throws Exception {
        if (estaVacia()) {
            throw new Exception("La pila esta vacia.");
        }

        return cima.getDato();
    }

    // Tamaño

    public int tamanio() {
        return cuenta;
    }
}
