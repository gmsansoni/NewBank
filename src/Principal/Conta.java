/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Guilherme
 */
public class Conta {
    private int num_conta;
    private String tipo;
    private double saldo;
    private double limite;

    public Conta() {
    }

    public Conta(int num_conta, String tipo, double saldo, double limite) {
        this.num_conta = num_conta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
}
