package miPack;

public class Detenido extends Estado{
    private Double temperaturaCuandoSeDetiene = 0.04;

    public Detenido(Auto auto){
        aumentarTemperatura(auto);
        auto.setVelocidadActual(0);
    }

    @Override
    public void acelerar(Auto auto, int kmH){
        auto.cambiarEstado((new EnMovimiento(auto, kmH)));
    }

    private void aumentarTemperatura(Auto auto) {
        Double incrementarGrados = this.temperaturaCuandoSeDetiene * auto.getVelocidadActual();
        auto.aumentarTemperatura(incrementarGrados);
    }

    public void apagar(Auto auto){
        auto.cambiarEstado(new Apagado(auto));
    }
}
