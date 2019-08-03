/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_final;

/**
 *
 * @author fenix
 */
public class Nodo {
        public int dato;
    public Nodo iz=null;
    public Nodo Dr=null;

    

    public Nodo(int dato) {
        this.dato=dato;
        this.iz=null;
        this.Dr = null;
        
        
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIz() {
        return iz;
    }

    public void setIz(Nodo iz) {
        this.iz = iz;
    }

    public Nodo getDr() {
        return Dr;
    }

    public void setDr(Nodo Dr) {
        this.Dr = Dr;
    }

  
    public String toString() {
        return "este es el dato "+ dato;
    }
    
    
}
