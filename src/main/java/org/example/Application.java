package org.example;

import java.util.ArrayList;


public class Application {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("123", 50000));
        cuentas.add(new CuentaCorriente("234", 1000000));
        cuentas.add(new CuentaCorriente("345", 20000));

        System.out.println(cuentas.get(0).retirarSaldo(60000));
        System.out.println(cuentas.get(1).retirarSaldo(2000000));
        System.out.println(cuentas.get(1).retirarSaldo(3000000));

        System.out.println(((CuentaAhorros)cuentas.get(0)).agregarInteres());

        ICuenta cuentaAhorros = new CuentaAhorros("123",50000);
        System.out.println(cuentaAhorros.consultarMovimientos());
        System.out.println(((CuentaAhorros)cuentaAhorros).retirarSaldo(30000));
        System.out.println(cuentaAhorros.consultarMovimientos());
    }
}
