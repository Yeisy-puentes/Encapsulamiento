package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
        System.out.println("Saldo despues de depositar: " + saldo);
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Saldo despues de retirar: " + monto);
            return;
        }
        else if (monto < saldo) {};
        System.out.println("Fondo insuficiente para retitar: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
