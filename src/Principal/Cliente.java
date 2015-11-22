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
public abstract class Cliente {
    int IdCliente;
    String Nome;
    String Sobrenome;
    String CPF_CNPJ;
    String Contas;

    public Cliente(int IdCliente, String Nome, String Sobrenome, String CPF_CNPJ, String Contas) {
        this.IdCliente = IdCliente;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF_CNPJ = CPF_CNPJ;
        this.Contas = Contas;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public String getContas() {
        return Contas;
    }

    public void setContas(String Contas) {
        this.Contas = Contas;
    }
    
    
}
