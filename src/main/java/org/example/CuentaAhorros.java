package org.example;

public class CuentaAhorros extends CuentaBancaria implements ICuenta{

    private double porcentajeInteres;

    public CuentaAhorros(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
        this.porcentajeInteres = 0.1;
    }

    @Override
    public String retirarSaldo(double montoRetirar) {
        if (montoRetirar>=10000 && montoRetirar<= this.saldo){
            this.saldo = this.saldo - montoRetirar;
            this.historial = this.historial+"Se retiro "+montoRetirar+" pesos\n";
            return "Se retiró "+montoRetirar+" pesos, el saldo actual es "+this.saldo;

        }else {
            return "El monto ingresado es invalido";
        }
    }

    public String agregarInteres(){
        this.saldo = this.saldo + (this.saldo * this.porcentajeInteres);
        return "El nuevo saldo de la cuenta es "+ this.saldo + " pesos";
    }

    @Override
    public String consultarMovimientos() {
        return "El saldo actual es "+this.saldo+"\n"+this.historial;
    }
}
