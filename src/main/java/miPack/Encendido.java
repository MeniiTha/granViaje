package miPack;

public class Encendido extends Estado{
    private Double gradosIniciales = 70.0;
    private Double consumoCombustible = 0.001;

    public Encendido(Auto auto) {
        aumentarTemperatura(auto);
        consumirCombustible(auto);

    }

    private void consumirCombustible(Auto auto) {
        auto.aumentarTemperatura(this.gradosIniciales);
    }

    private void aumentarTemperatura(Auto auto) {
        Double consumirLitros = this.consumoCombustible;
        auto.getMotor().consumirCombustible(auto, consumirLitros);
    }

    @java.lang.Override
    public void apagar(Auto auto){
        auto.cambiarEstado(new Apagado(auto));
    }

    @java.lang.Override
    public void acelerar(Auto auto, int kmH){
        auto.cambiarEstado(new EnMovimiento(auto, kmH));
    }
}
