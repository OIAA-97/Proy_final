/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_final;

import java.util.Vector;

/**
 *
 * @author fenix
 */
public class arbol {
    Nodo raiz;
    Vector lista;
    

    public arbol() {
        lista = new Vector();
    }
    
    
    public boolean isempty()
    {
        return raiz== null;
    }
    
    public boolean esroot(Nodo nodo)
    {
        return raiz == nodo;
    }
    
    public boolean eshoja(Nodo nodo )
    {
        return nodo.getDr()==null&&nodo.getIz()==null;
    }
    
    
    
    public boolean esinterno(Nodo nodo)
    {
        return !eshoja(nodo);
    }
    
    
    public void insertar(int dato)
    {
         Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;
            while (true) {
                padre = auxiliar;
                if (dato < auxiliar.dato) {
                    auxiliar = auxiliar.iz;
                    if (auxiliar == null) {
                        padre.iz = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.Dr;
                    if (auxiliar == null) {
                        padre.Dr = nuevo;
                        return;
                    }
                }
            }

        }

    }

    public boolean estaVacio() {
        return raiz == null;
    }
    
    public Vector llamaInOrder(Nodo r){
       if(lista == null)
       {
           return inOrden(r);
       }
       else{
           lista.clear();
        return inOrden(r);
       }
    }
    public Vector llamaPreOrder(Nodo r){
        lista.clear();
        return preOrden(r);
    }
    public Vector llamaPosOrder(Nodo r){
        lista.clear();
         posOrden(r);
         
        return lista;
    }
    
    public Vector inOrden(Nodo r){ 
        System.out.println(r);
        if(r!=null){
            inOrden(r.iz);
            System.out.print(r.dato + ", "+"que on los valores");
            lista.add(r);
            inOrden(r.Dr);
        }
        return lista;
    }
    
    public Vector preOrden(Nodo r){
        if(r!=null){
            System.out.print(r.dato + ", ");
            lista.add(r);
            preOrden(r.iz);
            preOrden(r.Dr);
        }
        return lista;
    }
      public void posOrden(Nodo r){
        if(r!=null){
            posOrden(r.iz);
            posOrden(r.Dr);
            lista.add(r);
            System.out.print(r.dato + ", ");
         
        }
       
    }
      
      
      public boolean  eliminarnodo( int d)
      {
          Nodo aux=raiz;
          Nodo padre=raiz;
          boolean hijoiz=true;
          while(aux.dato !=d)
          {
              padre=aux;
              
              if(d<aux.dato)
              {
                  hijoiz=true;
                  aux=aux.iz;
              }
              else
              {
                  hijoiz=false;
                  aux=aux.Dr;
              }
              if(aux==null)
              {
                  return false;
              }
          }
          if(aux.iz==null&&aux.Dr==null)
          {
           if(aux==raiz)
           {
               raiz=null;
           }
           else if(hijoiz)
           {
               padre.iz=null;
           }
           else
           {
            padre.Dr=null;   
           }
           
          }
          else if(aux.Dr==null) 
           {
            if(aux==raiz)
           {
             raiz=aux.iz;
           }
           else if(hijoiz)
           {
               padre.iz=aux.iz;
           }
           else
           {
            padre.Dr=aux.iz;   
           }   
           }
           else if(aux.iz==null)
           {
               if(aux==raiz)
              {
               raiz=aux.Dr;
               }
               else if(hijoiz)
               {
               padre.iz=aux.Dr;
               }
               else
               {
                padre.Dr=aux.iz;   
                }   
           }
          else
           {
               Nodo remplazo=obtener(aux);
               if(aux==raiz)
               {
                   raiz=remplazo;
               }else if(hijoiz)
               {
                   padre.iz=remplazo;
               }
               else
               {
                   padre.iz=remplazo;
               }
               remplazo.iz=aux.iz;
               
           }
          return true; 
      }
      
      
      public Nodo obtener(Nodo nodoremplazo)
      {
         Nodo remplazarpadre= nodoremplazo;
         Nodo remplazo=nodoremplazo;
         Nodo aux=nodoremplazo.iz;
         while(aux!=null)
         {
             remplazarpadre=remplazo;
             remplazo=aux;
             aux=aux.iz;
         }
         if(remplazarpadre!=nodoremplazo.iz)
         {
             remplazarpadre.iz= remplazo.iz;
             remplazo.Dr=nodoremplazo.Dr;
         }
          System.out.println("el nodo remplazo es "+remplazo);
        return remplazo;
      }
      
      
      public Nodo buscarnodo(int d)
      {
          Nodo aux=raiz;
          
          while (aux.dato !=d)
          {
              if(d<aux.dato)
              {
                  aux=aux.iz;
              }
              else
              {
                  aux=aux.Dr;
              }
              if(aux==null)
              {
                  return null;
              }
             
          }
           return aux;
      }
      
      
      
}
