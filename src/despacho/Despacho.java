package despacho;

import javax.swing.JOptionPane;

public class Despacho {

    int totalProductosPalmira;
    int totalProductosJamundi;
    int totalProductosYumbo;
    int cantDespachoPalmira = 0;
    int cantDespachoJamundi = 0;
    int cantDespachoYumbo = 0;
    int totalDespacho5T = 0;
    int totalDespacho10T = 0;
    int sumaProductos = 0;
    int contProducto = 0;

    /**
     * Metodo para realizar la entrega de productos en cada ciudad
     * correspondiente seleccioanda por el usuario
     *
     * @param camion. Pasaran los elementos del camion
     */
    public void entregarProducto(Camion camion) {
        int cantProductoPalmira, cantProductoYumbo, cantProductoJamundi;// Utilizaremos esta variable para guardar la cantidad de productos que el usuario desea entregar en una ciudad
        int producto = camion.getNumProducto();
        this.totalProductosPalmira = totalProductosPalmira = 0;
        this.totalProductosJamundi = totalProductosJamundi = 0;
        this.totalProductosYumbo = totalProductosYumbo = 0;
        
        do {
            String opcionCiudad = JOptionPane.showInputDialog(null, "Escribe la ciudad donde desea hacer la entrega el camino tipo " + camion.getTipoTonelada() + " :"
                    + "\nPalmira"
                    + "\nJamundi"
                    + "\nYumbo");

            if (opcionCiudad.equals("palmira")) {
                
                cantProductoPalmira = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cantidad de productos que deseas agregar a la ciudad de Palmira"
                                                                                                       +"\nTe queda por entregar "+producto+" productos."));

                if (cantProductoPalmira <= producto) {
                    producto = producto - cantProductoPalmira;
                    totalProductosPalmira += cantProductoPalmira;
                    cantDespachoPalmira++;
                    contProducto++;
                    if(camion.getTipoTonelada().equals("5 toneladas")){
                        totalDespacho5T++;
                    }
                    if(camion.getTipoTonelada().equals("10 toneladas")){
                        totalDespacho10T++;
                    }
                } else {
                    System.out.println("No puede entregar esa cantidad de productos.Digite otra cantidad");
                }
            }

            if (opcionCiudad.equals("jamundi")) {
                
                cantProductoJamundi = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cantidad de productos que deseas agregar a la ciudad de Jamundi"
                                                                                                        +"\nTe queda por entregar "+producto+" productos."));
                if (cantProductoJamundi <= producto) {
                    producto = producto - cantProductoJamundi;
                    totalProductosJamundi += cantProductoJamundi;
                    cantDespachoJamundi++;
                    contProducto++;
                    if(camion.getTipoTonelada().equals("5 toneladas")){
                        totalDespacho5T++;
                    }
                    if(camion.getTipoTonelada().equals("10 toneladas")){
                        totalDespacho10T++;
                    }
                } else {
                    System.out.println("No puede entregar esa cantidad de productos.Digite otra cantidad");
                }

            }

            if (opcionCiudad.equals("yumbo")) {

                cantProductoYumbo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cantidad de productos que deseas agregar a la ciudad de Yumbo"
                                                                                                     +"\nTe queda por entregar "+producto+" productos."));
                
                if (cantProductoYumbo <= producto) {
                    producto = producto - cantProductoYumbo;
                    totalProductosYumbo += cantProductoYumbo;
                    cantDespachoYumbo++;
                    contProducto++;
                    if(camion.getTipoTonelada().equals("5 toneladas")){
                        totalDespacho5T++;
                    }
                    if(camion.getTipoTonelada().equals("10 toneladas")){
                        totalDespacho10T++;
                    }
                } else {
                    System.out.println("No puede entregar esa cantidad de productos.Digite otra cantidad");
                }
            }

            sumaProductos += totalProductosPalmira + totalProductosJamundi + totalProductosYumbo;
        } while (producto != 0);
    }

    /**
     * Metodo para mostrar los productos entregados por cada tipo de camion
     *
     * @param camion
     */
    public void productosEntregados(Camion camion) {

        System.out.println(camion + " "
                + "Realizo un total de entregas en:"
                + "\nPalmira: " + totalProductosPalmira
                + "\nJamundi: " + totalProductosJamundi
                + "\nYumbo: " + totalProductosYumbo);
    }

    /**
     * Metodo para mostrar la totalidad de despachos
     */
    public void totalDespachos() {
        double promedio = 0.0;

        System.out.println("El camion tipo 5 toneladas tuvo un total de viajes de: " + totalDespacho5T);
        System.out.println("El camion tipo 10 toneladas tuvo un total de viajes de: " + totalDespacho10T);

        System.out.println("En la ciudad de Palmira tuvo un final despachado de: " + cantDespachoPalmira);
        System.out.println("En la ciudad de Jamundi tuvo un final despachado de: " + cantDespachoJamundi);
        System.out.println("En la ciudad de Yumbo tuvo un final despachado de: " + cantDespachoYumbo);

        promedio = (double)(sumaProductos / contProducto);

        System.out.println("La cantidad promedio de productos entregados es: " + promedio);

    }
}
