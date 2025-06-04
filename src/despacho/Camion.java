package despacho;

public class Camion {
    
    private String tipoTonelada;
    private int numProducto;

    public Camion(String tipoTonelada, int numProducto) {
        this.tipoTonelada = tipoTonelada;
        this.numProducto = numProducto;
    }

    public String getTipoTonelada() {
        return tipoTonelada;
    }

    public void setTipoTonelada(String tipoTonelada) {
        this.tipoTonelada = tipoTonelada;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    @Override
    public String toString() {
        return "Camion{" + "El camion es de =" + tipoTonelada + ",lleva una cantidad de= " + numProducto + " productos }";
    }
    
    
}
