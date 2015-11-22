/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.ConexaoBD.con;
//import java.sql.PreparedStatement;
import java.sql.*;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Guilherme
 */
public class ClienteDAO {
    
    
    public void CadastraCliente(String nome,String sobrenome, String cpf, String contas)
	{
	
		try
		{
			PreparedStatement CadastraCliente = con.prepareStatement("insert into " + " cliente(nome,sobrenome,cpf_cnpj,contas)" + "values(?,?,?,?)");
			
			CadastraCliente.setString(1,nome);
                        CadastraCliente.setString(2,sobrenome);
                        CadastraCliente.setString(3,cpf);
                        CadastraCliente.setString(4,contas);
                                         
			
			int qtdLinhasAfetadas = CadastraCliente.executeUpdate();
			System.out.println("Linhas Afetadas: " + qtdLinhasAfetadas);
			
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
    public void DeletaCliente(int id)
	{
		try 
		{
			PreparedStatement DeletaCliente = con.prepareStatement("delete form cliente where id_cliente = ?");
                        DeletaCliente.setInt(1, id);
			
			int qtdLinhasAfetadas = DeletaCliente.executeUpdate();
                        
                                             
			System.out.println("Linhas Afetadas: " + qtdLinhasAfetadas);
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
     public void updateCliente(String nome,String sobrenome, String cpf,int id)
	{
		try
		{
			PreparedStatement updateCliente = con.prepareStatement("update cliente set nome = "+"?"+ ", sobrenome = "+"?"+", cpf_cnpj = "+"?"+" where id_cliente = ?");
			updateCliente.setString(1,nome);
                        updateCliente.setString(2,sobrenome);
                        updateCliente.setString(3, cpf);
                        updateCliente.setInt(4,id);
                        
                        
                        int qtdLinhasAfetadas = updateCliente.executeUpdate();
			
			System.out.println("Linhas Afetadas: " + qtdLinhasAfetadas);
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
    public void preencherTabela(){
             ArrayList dados = new ArrayList();
             
             String [] Colunas = new String[]{"ID","NOME","SOBRENOME","CPF/CNPJ","NºConta","SALDO","LIMITE"};
             Statement stm = null;
             ResultSet rs = null;
             String procura = Form_cliente.txtPesquisar.getText();
             try{
              stm = con.createStatement();
                         
              if(procura != "")
              rs = stm.executeQuery("select id_cliente,nome,sobrenome,cpf_cnpj,num_conta,saldo,limite from cliente C, conta D where C.id_cliente = D.num_conta && C.nome like '%"+ procura +"%' order by nome");
              if(procura == "")
              rs = stm.executeQuery("select id_cliente,nome,sobrenome,cpf_cnpj,num_conta,saldo,limite from cliente C, conta D where C.id_cliente = D.num_conta order by id_cliente ASC");           
             
             
             
             
             rs.first();
             do{
                 dados.add(new Object[]{rs.getInt("id_cliente"),rs.getString("nome"),rs.getString("sobrenome"),rs.getString("cpf_cnpj"),rs.getInt("num_conta"),rs.getDouble("saldo"),rs.getDouble("limite")});
             }
             while(rs.next());
             
             }
              catch(SQLException e)
             {
                System.err.println(e);
             }
	      catch(Exception e)
		{
                System.err.println(e);
                
		}
             
             ModeloTabela modelo = new ModeloTabela(dados, Colunas);
             Form_cliente.jTableCliente.setModel(modelo);
             Form_cliente.jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
             Form_cliente.jTableCliente.getColumnModel().getColumn(0).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(1).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(2).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(3).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(4).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(5).setResizable(false);
             Form_cliente.jTableCliente.getColumnModel().getColumn(6).setPreferredWidth(100);
             Form_cliente.jTableCliente.getColumnModel().getColumn(6).setResizable(false);
             Form_cliente.jTableCliente.setAutoResizeMode(Form_cliente.jTableCliente.AUTO_RESIZE_OFF);
             Form_cliente.jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }              
}
