package org.example;

public class CuentaCorriente extends CuentaBancaria{

    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
        this.limiteSobregiro = 3000000;
    }

    @Override
    public String retirarSaldo(double montoRetirar) {
        if (montoRetirar>=10000 && montoRetirar <= this.saldo + this.limiteSobregiro){
            this.saldo = this.saldo - montoRetirar;
            return "El nuevo saldo de la cuenta es "+ this.saldo+" pesos";
        }else {
            return "El saldo de la cuenta + sobregiro es insuficientes";
        }
    }
}
