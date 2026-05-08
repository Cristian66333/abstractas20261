package org.example;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("123", 50000));
        cuentas.add(new CuentaCorriente("234", 1000000));
        cuentas.add(new CuentaCorriente("345", 20000));

        System.out.println(cuentas.get(0).retirarSaldo(60000));
        System.out.println(cuentas.get(1).retirarSaldo(2000000));
        System.out.println(cuentas.get(1).retirarSaldo(3000000));
    }
}
