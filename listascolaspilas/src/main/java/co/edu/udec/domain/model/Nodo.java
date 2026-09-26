package co.edu.udec.domain.model;

public class Nodo {
    private Object dato;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo() {

    }

    public Object getDato() {
        return dato;
    }  

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setIzquierda(Nodo vecino) {
        this.izquierda = vecino;
    }

    public void setDerecha(Nodo vecino) {
        this.derecha = vecino;
    }


}
