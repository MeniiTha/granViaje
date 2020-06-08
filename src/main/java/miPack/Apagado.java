package miPack;


import exceptions.SinCombustibleException;

public class Apagado extends Estado{


    public Apagado(Auto auto) {
        auto.getMotor().apagar();
    }

    @Override
    public void encender(Auto auto) throws SinCombustibleException {
        verificarCombustible(auto);
        auto.cambiarEstado(new Encendido(auto));
    }

    private void verificarCombustible(Auto auto) throws SinCombustibleException {
        if(auto.getTanqueDeCombustible().enReserva()) {
            throw new SinCombustibleException();
        }

    }

}
