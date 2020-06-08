package miPack;

public class EnMovimiento extends Estado{
    private Double temperaturaInicial = 0.2;

    public EnMovimiento(Auto auto, int velocidad) {
        auto.setVelocidadActual((velocidad));
    }


    @java.lang.Override
    public void detener(Auto auto){
        auto.cambiarEstado(new Detenido(auto));
    }

    @Override
    public void apagar(Auto auto){
        auto.cambiarEstado(new Apagado(auto));
    }

    @java.lang.Override
    public void acelerar(Auto auto, int kmH){
        aumentarTemperaturaAlAcelerar(auto, kmH);
        consumirCombustible(auto);
        auto.setVelocidadActual(kmH);
    }

    private void consumirCombustible(Auto auto) {
        auto.getMotor().desplazar(auto);
    }

    private void aumentarTemperaturaAlAcelerar(Auto auto, int kmH) {
        Double agregarGrados = this.temperaturaInicial * kmH;
        auto.aumentarTemperatura(agregarGrados);
    }
}
