/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Bode
 */
public class Cliente extends Pessoa{
    int IdCliente;
    String Contas;

    public Cliente() {       
    }
    
    public Cliente(int IdCliente, String Contas, String Nome, String Sobrenome, String CPF_CNPJ) {
        super(Nome, Sobrenome, CPF_CNPJ);
        this.IdCliente = IdCliente;
        this.Contas = Contas;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getContas() {
        return Contas;
    }

    public void setContas(String Contas) {
        this.Contas = Contas;
    }
    
    
}
