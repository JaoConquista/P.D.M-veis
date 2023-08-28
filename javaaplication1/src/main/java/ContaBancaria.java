/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class ContaBancaria {

    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular (String titular){
        this.titular = titular;
    }


    public String depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            return "Valor de " + deposito + " depositado, seu saldo atual é de: " + saldo;
        } else {
            return "O valor de depósito deve ser positivo.";
        }
    }

    public String sacar(double saque) {
        if (saque > 0) {
            if (saldo >= saque) {
                this.saldo -= saque;
                return "Valor de " + saque + " foi sacado, seu saldo atual é de: " + saldo;
            } else {
                return "Saldo insuficiente para sacar";
            }
        } else {
            return "O valor de saque deve ser positivo.";
        } 
    }
    
    
}
