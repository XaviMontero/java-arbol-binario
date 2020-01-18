/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgrafico;

/**
 *
 * @author ploks
 */
public class Nodo {
    
    private int dato;
    private String mensaje ;
    private Nodo izq, der;

    public Nodo(int dato,String mensaje, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
        this.mensaje=mensaje; 
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 

}
