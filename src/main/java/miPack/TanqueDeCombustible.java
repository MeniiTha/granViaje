package miPack;

public class TanqueDeCombustible {
    private Double capacidadMaxima;
    private Double contenidoActual;

    public static TanqueDeCombustible deCapacidad(Double capacidadMaxima){
        return new TanqueDeCombustible(capacidadMaxima);
    }

    private TanqueDeCombustible(Double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.contenidoActual = capacidadMaxima;
    }

    public boolean enReserva() {
        return this.contenidoActual < 0.1 * this.capacidadMaxima;
    }

    public boolean proximoAReserva(){
        return this.contenidoActual < 0.15 * this.capacidadMaxima;
    }

    public Double combustibleActual(){
        return this.contenidoActual;
    }

    public void consumir(Double litros) {
        this.contenidoActual -= litros;
    }

    public void recargar(Double litros){
        this.contenidoActual += litros;
    }

    public Double capacidadMaxima(){
        return this.capacidadMaxima;
    }
}
