/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidad2;

import Controlador.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author David Campoverde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada<Float> lista = new ListaEnlazada<>();
        ListaEnlazada<Float> lista2 = new ListaEnlazada<>();
        lista.llenarLista(20);
        lista2.llenarLista(20);
        System.out.println("ASCENDENTE");
        lista.ordenarQuickSort(null, 1).imprimirListaFloat();
        
        System.out.println("DESCENDENTE");
        lista2.ordenarQuickSort(null, 2).imprimirListaFloat();
        
//        ListaEnlazada<String> listaS = new ListaEnlazada<>();
//        listaS.insertar("David");
//        listaS.insertar("Nayeon");
//        listaS.insertar("Jeongyeon");
//        listaS.insertar("Momo");
//        listaS.insertar("Sana");
//        listaS.insertar("Jihyo");
//        listaS.insertar("Mina");
//        listaS.insertar("Dahyun");
//        listaS.insertar("Chaeyoung");
//        listaS.insertar("Tzuyu");
//        listaS.ordenarQuickSort(null, 2).imprimir();
//        
        
        
    }
    
}