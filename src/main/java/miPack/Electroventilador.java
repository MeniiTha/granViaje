package miPack;

public class Electroventilador {
    private Double gradosQueDisminuye;

    public Electroventilador(Double gradosQueDisminuye){
        this.gradosQueDisminuye = gradosQueDisminuye;
    }

    public void enfriar(Auto auto){
        auto.getMotor().disminuirTemperatura(this.gradosQueDisminuye);
    }
}
