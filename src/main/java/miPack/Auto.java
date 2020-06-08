package miPack;


import exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Auto {
    private Estado estado;
    private TanqueDeCombustible tanqueDeCombustible;
    private Electroventilador electroventilador;
    private Motor motor;
    private int velocidadActual;
    private List<Recorrido> recorridos; //Recorridos que hace el auto

    public Auto() {
        this.recorridos = new ArrayList<>();
    }
    public List<Recorrido> recorridosComenzados(){
        return this.recorridos.stream()
                .filter(r-> r.comenzado())
                .collect(Collectors.toList());
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTanqueDeCombustible(TanqueDeCombustible tanqueDeCombustible) {
        this.tanqueDeCombustible = tanqueDeCombustible;
    }

    public void setElectroventilador(Electroventilador electroventilador) {
        this.electroventilador = electroventilador;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public TanqueDeCombustible getTanqueDeCombustible() {
        return tanqueDeCombustible;
    }

    public Electroventilador getElectroventilador() {
        return electroventilador;
    }

    public Motor getMotor() {
        return motor;
    }

    public boolean tanqueEnReserva() {
        return true;
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void aumentarTemperatura(Double grados) {
        this.motor.aumentarTemperatura(this, grados);
    }

    public void enfriar() {
        this.electroventilador.enfriar(this);
    }

    public Double capacidadMaximaCombustible(){
        return this.tanqueDeCombustible.capacidadMaxima();
    }

    public void encender() throws NoSePuedeEncenderException, SinCombustibleException {
        this.estado.encender(this);
    }

    public void apagar() throws NoSePuedeApagarException {
        this.estado.apagar(this);
    }

    public void acelerar(int kmH) throws NoSePuedeAcelerarException {
        this.estado.acelerar(this, kmH);
    }

    public void detener() throws NoSePuedeDetenerException{
        this.estado.detener(this);
    }

    public void recargarCombustible(Double cantidad){
        this.tanqueDeCombustible.recargar(cantidad);
    }

}
