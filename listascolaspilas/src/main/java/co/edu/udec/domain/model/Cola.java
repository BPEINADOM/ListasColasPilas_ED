package co.edu.udec.domain.model;

public class Cola {
    private int cuenta;
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        cuenta = 0;
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return cuenta == 0;
    }

    // Encolar (agregar al final)

    public void encolar(Object data) throws Exception {
        if (data == null) {
            throw new Exception("No se puede agregar un dato nulo a la cola.");
        }

        Nodo nuevo = new Nodo(data);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setDerecha(nuevo);
            nuevo.setIzquierda(fin);
            fin = nuevo;
        }

        ++cuenta;
    }

    // Desencolar (eliminar del frente)

    public Object desencolar() throws Exception {
        if (estaVacia()) {
            throw new Exception("La cola esta vacia.");
        }
        
        Object dato = frente.getDato();
        frente = frente.getDerecha();

        if (frente != null) {
            frente.setIzquierda(null);
        } else {
            fin = null;
        }

        --cuenta;
        return dato;
    }

    // Consultar el frente

    public Object peek() throws Exception {
        if (estaVacia()) {
            throw new Exception("La cola esta vacia.");
        }
        return frente.getDato();
    }

    // Tamaño

    public int tamanio() {
        return cuenta;
    }

}
