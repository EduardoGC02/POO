package POOURU;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class UsoCoche {

    public static void main(String[] args) {
       
        Camioneta miCamioneta = new Camioneta();
       
        miCamioneta.estableceColor(JOptionPane.showInputDialog("Introduce Color"));
        
        System.out.println(miCamioneta.dimeColor());
               
        System.out.println(miCamioneta.DimeDatosGenerales());
       
        miCamioneta.estableceAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
       
        System.out.println(miCamioneta.dimeAsientos());
       
        miCamioneta.confClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
       
        System.out.println(miCamioneta.dimeClimatizador());
       
        System.out.println(miCamioneta.dimePesoCam());
        
        miCamioneta.confManejo(JOptionPane.showInputDialog("Es automatica?"));
        
        System.out.println(miCamioneta.dimeManejo());
        
        miCamioneta.confTraccion(JOptionPane.showInputDialog("Tiene traccion en todas las ruedas?"));
        
        System.out.println(miCamioneta.dimeTraccion());
       
        System.out.println("El precio final es: " +miCamioneta.precioCam());
       
       
       
    }

}
