package despacho;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Despacho d1 = new Despacho();
        int cant5Toneladas = 0;
        int cant10Toneladas = 0;
        int productos = 0;

        cant5Toneladas = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite la cantidad de camiones tipo 5 toneladas "
                                                  +"\nque va a realizar el despacho de productos en las"
                                                  +"\nprincipales ciudades."));
        
        cant10Toneladas = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite la cantidad de camiones tipo 10 toneladas "
                                                  +"\nque va a realizar el despacho de productos en las"
                                                  +"\nprincipales ciudades."));
        
        Camion[] camion5Toneladas = new Camion[cant5Toneladas];
        Camion[] camion10Toneladas = new Camion[cant10Toneladas];
        
        for (int i = 0; i < camion5Toneladas.length; i++) {
            productos = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite la cantidad de productos que entregara el camion"
                                                                             +(i+1)+" tipo 5 toneladas"));
            Camion camion5T = new Camion("5 toneladas", productos);
            camion5Toneladas[i] = camion5T;
            
            System.out.println("");
            d1.entregarProducto(camion5T);
            d1.productosEntregados(camion5T);
        }
        
        for (int i = 0; i < camion10Toneladas.length; i++) {
            productos = Integer.parseInt(JOptionPane.showInputDialog(null, "Dígite la cantidad de productos que entregara el camion"
                                                                             +(i+1)+" tipo 10 toneladas"));
            Camion camion10T = new Camion("10 toneladas", productos);
            camion10Toneladas[i] = camion10T;
            
            System.out.println("");
            d1.entregarProducto(camion10T);
            d1.productosEntregados(camion10T);
        }
        
        d1.totalDespachos();
    }    
}
