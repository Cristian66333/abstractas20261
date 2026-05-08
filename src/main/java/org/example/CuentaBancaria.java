package org.example;

public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected String historial;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.historial = "";
    }
    public CuentaBancaria(){

    }

    public String consignar(double montoConsignar){
        if (montoConsignar>=10000){
            this.saldo = this.saldo+montoConsignar;
            this.historial = this.historial+"Se consignó "+montoConsignar+" pesos\n";
            return "Se ha consignado "+montoConsignar+" pesos";
        }else {
            return "El monto a consignar es invalido";
        }
    }

    public abstract String retirarSaldo(double montoRetirar);

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
