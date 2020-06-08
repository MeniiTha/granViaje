package miPack;

public class Motor {
    private Double temperatura = 0.0;
    private Double limiteMaxima = 95.0;
    private Double consumoPromedio = 133.0;

    public void apagar() {
        this.temperatura = 0.0;
    }

    public void aumentarTemperatura(Auto auto, Double grados){
        this.temperatura += grados;
        enfriarSiNecesita(auto);
    }

    private void enfriarSiNecesita(Auto auto) {
        if(this.temperatura >= this.limiteMaxima){
            auto.enfriar();
        }
    }

    public void disminuirTemperatura(Double grados) {
        this.temperatura -= grados;
    }

    public void desplazar(Auto auto) {
        //Solucionar Timestamp
    }

    public void consumirCombustible(Auto auto, Double litros) {
        auto.getTanqueDeCombustible().consumir(litros);
    }

    private Double consumoPromedioEnLitros(){
        return this.consumoPromedio / 1000;
    }
    private Double velocidadEnSegundos(Double velocidad){
        return velocidad / 3600;
    }
}
