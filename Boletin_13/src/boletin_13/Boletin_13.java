/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_13;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SeleccionFutbol equipo = new SeleccionFutbol();
        Xogador unXogador = new Xogador();
        Adestrador unAdestrador = new Adestrador();
        Masaxista unMasaxista = new Masaxista();
        
        unXogador.concentrarse();
        unAdestrador.concentrarse();
        unMasaxista.concentrarse();
        
        unXogador.viajar();
        unAdestrador.viajar();
        unMasaxista.viajar();
    }
    
}
