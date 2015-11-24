/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.ConexaoBD.con;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
//import java.sql.PreparedStatement;
import java.sql.*;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Guilherme
 */
public class ClienteDAO {
    
    
    public void CadastraCliente(Cliente cli)
	{
	
		try
		{
                    
			PreparedStatement CadastraCliente = con.prepareStatement("insert into " + " cliente(nome,sobrenome,cpf_cnpj,contas)" + "values(?,?,?,?)");
			
			CadastraCliente.setString(1,cli.getNome());
                        CadastraCliente.setString(2,cli.getSobrenome());
                        CadastraCliente.setString(3,cli.getCPF_CNPJ());
                        CadastraCliente.setString(4,cli.getContas());
                                         
			
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
    public void DeletaCliente(Cliente cli)
	{
		try 
		{
			PreparedStatement DeletaCliente = con.prepareStatement("delete form cliente where cpf_cnpj = '?'");
                        DeletaCliente.setString(1, cli.getCPF_CNPJ());
			
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
     public void updateCliente(Cliente cli)
	{
		try
		{
			PreparedStatement updateCliente = con.prepareStatement("update cliente set nome = "+"?"+ ", sobrenome = "+"?"+", cpf_cnpj = "+"?"+" where id_cliente = ?");
			updateCliente.setString(1,cli.getNome());
                        updateCliente.setString(2,cli.getSobrenome());
                        updateCliente.setString(3, cli.getCPF_CNPJ());
                        updateCliente.setInt(4,cli.getIdCliente());
                        
                        
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
    public static void backupClientes() 
	{
		ConexaoBD c = new ConexaoBD();
			c.connect();
					
			ResultSet rs;
			Statement stm;
					
			try{
				stm = c.con.createStatement();
				
				rs = stm.executeQuery("select * from cliente");
				
				FileWriter arq = new FileWriter("backupCliente.txt");
				
				PrintWriter gravaArq = new PrintWriter(arq);
				/*gravaArq.printf("BackUp dos Livros no Banco de Dados\n");
				gravaArq.println();
				gravaArq.printf("ID \t TITULO \t AUTOR");
				gravaArq.println("\n");*/
				
				while(rs.next())
				{
				gravaArq.printf("%s %s %s %s %s %s %s %s",rs.getString("nome"),";",rs.getString("sobrenome"),";",rs.getString("cpf_cnpj"),";",rs.getString("contas"),";");
		
				
				}
				arq.close();
				JOptionPane.showMessageDialog(null, "Backup de Clientes Realizado com sucesso!");
			}
			catch(SQLException e)
				{
				System.out.println("Erro SQL");
				}
			catch(Exception e)
			{
				System.out.println("erro erro no backup de livro");
			}
	}
        public static void importaCliente()
		{
			ConexaoBD c = new ConexaoBD();
			c.connect();
			
			int qtdLinhasAfetadas = 0;
			
			Statement stm = null;
			
			String line = null;  
			  
		      try {  
		    	 stm = c.con.createStatement();
		    	 
		         FileReader reader = new FileReader("backupCliente.txt"); // Localização do Arquivo  
		         BufferedReader buffer = new BufferedReader(reader);  
		         StringTokenizer st = null;  
		           
		         String nome;         // Armazena campo de nome  
		         String sobrenome;      // Armazena campo de sobrenome
                         String cpf;            // armazena campo cpf
                         String contas;             // armazena a qtd de contas
		         
		  
		         while ((line = buffer.readLine()) != null) {  
		                                            
		              
		            // UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS  
		            st = new StringTokenizer(line, ";");  
		            String dados = null;  
		  
		            while (st.hasMoreTokens()) {  
		  
		               // Campo NUMERO  
		               dados = st.nextToken();  
		               nome = dados;  
		                 
		               // Campo MATRICULA  
		               dados = st.nextToken();  
		               sobrenome = dados;  
                               
                               dados = st.nextToken();
                               cpf = dados;
                               
                               dados = st.nextToken();
                               contas = dados;
		               
		               PreparedStatement importaCliente = c.con.prepareStatement("insert into cliente(nome,sobrenome,cpf_cnpj,contas) values(?,?,?,?)");
		               importaCliente.setString(1, nome);
		               importaCliente.setString(2, sobrenome);
                               importaCliente.setString(3, cpf);
		               importaCliente.setString(4, contas);
		               qtdLinhasAfetadas += importaCliente.executeUpdate(); 
 		            }  
		            JOptionPane.showMessageDialog(null,"Importacao de Clientes Concluida\nQuantidade de Clientes Recuperados: "+ qtdLinhasAfetadas);
		         }  
		         buffer.close();  
		         reader.close();  
		  
		      } 
		      catch(SQLException e)
		      {
		    	  System.err.println(e);
		      }
		      catch (Exception e)
		      {  
		         e.printStackTrace();  
		      } 
		}
          
               
}
