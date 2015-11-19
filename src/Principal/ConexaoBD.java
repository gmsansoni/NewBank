package Principal;

import Principal.Form_cliente;
import Principal.Form_deposito;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConexaoBD {
    static final String ConexaoBD = 
			"jdbc:mysql://localhost:3306/db_bankadmin";
	
	static Connection con = null;
        static ResultSet rs = null;
	
	public void disconnect()
	{
		try {
			con.close();
			
		JOptionPane.showMessageDialog(null,"A conexao foi encerrada com sucesso!");
			} 
		catch (SQLException e)
			{
			  e.printStackTrace();
			}
	}
	
	public void connect()
	{
		try
		{
			//criar a conexao
			
			con = DriverManager.getConnection(ConexaoBD,"root", "1234");
                      
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
         
        public void DeletaConta(int id)
	{
		try 
		{
			PreparedStatement DeletaConta = con.prepareStatement("delete from conta where num_conta = ?");
			DeletaConta.setInt(1, id);
			
			int qtdLinhasAfetadas = DeletaConta.executeUpdate();
                        
                                             
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
        
         public void CadastraConta(String tipo, String limite)
	{
	
		try
		{
			PreparedStatement CadastraCliente = con.prepareStatement("insert into " + " conta(tipo,limite)" + "values(?,?)");
			
			CadastraCliente.setString(1,tipo);
                        CadastraCliente.setString(2,limite);
                        
                        
                                         
			
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
         
         public void updateConta(double limite,int num_conta)
	{
		try
		{
			PreparedStatement updateConta = con.prepareStatement("update conta set limite = "+"?"+"where num_conta = ? ");
                        updateConta.setDouble(1, limite);
                        updateConta.setInt(2,num_conta);
			
                        
                        int qtdLinhasAfetadas = updateConta.executeUpdate();
			
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
         
         public void Deposito(double deposito,int num_conta)
	{
		try
		{
			PreparedStatement updateConta = con.prepareStatement("update conta set saldo = "+"?"+"where num_conta = ? ");
                        updateConta.setDouble(1, deposito);
                        updateConta.setInt(2,num_conta);
			
                        
                        int qtdLinhasAfetadas = updateConta.executeUpdate();
			
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
         
          public void Saque(double saque,int num_conta)
	{
		try
		{
			PreparedStatement updateConta = con.prepareStatement("update conta set saldo = "+"?"+"where num_conta = ? ");
                        updateConta.setDouble(1, saque);
                        updateConta.setInt(2,num_conta);
			
                        
                        int qtdLinhasAfetadas = updateConta.executeUpdate();
			
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
         
         public void preencherTabelaDeposito(){
            ArrayList dados = new ArrayList();
             
             String [] Colunas = new String[]{"ID","NOME","SOBRENOME","CPF/CNPJ","NºConta","SALDO","LIMITE"};
             Statement stm = null;
             ResultSet rs = null;
             String procura = Form_deposito.txtPesquisar.getText();
             try{
              stm = con.createStatement();
                         
              if(procura != "")
              rs = stm.executeQuery("select id_cliente,nome,sobrenome,cpf_cnpj,num_conta,saldo,limite from cliente C, conta D where C.id_cliente = D.num_conta && C.nome like '%"+ procura +"%' order by nome");
              if(procura == "")
              rs = stm.executeQuery("select id_cliente,nome,sobrenome,cpf_cnpj,num_conta,saldo,limite from cliente C, conta D where C.id_cliente = D.num_conta");           
             
             
             
             
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
             Form_deposito.jTableCliente2.setModel(modelo);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(0).setPreferredWidth(70);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(0).setResizable(false);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(1).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(1).setResizable(false);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(2).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(2).setResizable(false);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(3).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(3).setResizable(false);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(4).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(5).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(5).setResizable(false);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(6).setPreferredWidth(100);
             Form_deposito.jTableCliente2.getColumnModel().getColumn(6).setResizable(false);
             Form_deposito.jTableCliente2.setAutoResizeMode(Form_deposito.jTableCliente2.AUTO_RESIZE_OFF);
             Form_deposito.jTableCliente2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             
             
             
             
            
         }

         public void preencherTabelaSaque(){
            ArrayList dados = new ArrayList();
             
             String [] Colunas = new String[]{"ID","NOME","SOBRENOME","CPF/CNPJ","NºConta","SALDO","LIMITE"};
             Statement stm = null;
             ResultSet rs = null;
             String procura = Form_saque.txtPesquisar.getText();
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
             Form_saque.jTableCliente3.setModel(modelo);
             Form_saque.jTableCliente3.getColumnModel().getColumn(0).setPreferredWidth(70);
             Form_saque.jTableCliente3.getColumnModel().getColumn(0).setResizable(false);
             Form_saque.jTableCliente3.getColumnModel().getColumn(1).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(1).setResizable(false);
             Form_saque.jTableCliente3.getColumnModel().getColumn(2).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(2).setResizable(false);
             Form_saque.jTableCliente3.getColumnModel().getColumn(3).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(3).setResizable(false);
             Form_saque.jTableCliente3.getColumnModel().getColumn(4).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(5).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(5).setResizable(false);
             Form_saque.jTableCliente3.getColumnModel().getColumn(6).setPreferredWidth(100);
             Form_saque.jTableCliente3.getColumnModel().getColumn(6).setResizable(false);
             Form_saque.jTableCliente3.setAutoResizeMode(Form_saque.jTableCliente3.AUTO_RESIZE_OFF);
             Form_saque.jTableCliente3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
                        
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
         
         
          public static void backupContas() 
	{
		ConexaoBD c = new ConexaoBD();
			c.connect();
					
			ResultSet rs;
			Statement stm;
					
			try{
				stm = c.con.createStatement();
				
				rs = stm.executeQuery("select tipo , saldo , limite from conta");
				
				FileWriter arq = new FileWriter("backupContas.txt");
				
				PrintWriter gravaArq = new PrintWriter(arq);
				/*gravaArq.printf("BackUp dos Livros no Banco de Dados\n");
				gravaArq.println();
				gravaArq.printf("ID \t TITULO \t AUTOR");
				gravaArq.println("\n");*/
				
				while(rs.next())
				{
				gravaArq.printf("%s %s %s %s %s %s",rs.getString("tipo"),";",rs.getString("saldo"),";",rs.getString("limite"),";");
		
				
				}
				arq.close();
				JOptionPane.showMessageDialog(null, "Backup de Contas Realizado com sucesso!");
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
          
          
          public static void importaContas()
		{
			ConexaoBD c = new ConexaoBD();
			c.connect();
			
			int qtdLinhasAfetadas = 0;
			
			Statement stm = null;
			
			String line = null;  
			  
		      try {  
		    	 stm = c.con.createStatement();
		    	 
		         FileReader reader = new FileReader("backupContas.txt"); // Localização do Arquivo  
		         BufferedReader buffer = new BufferedReader(reader);  
		         StringTokenizer st = null;  
		           
		         int num_conta;         // Armazena campo de num_conta 
		         String tipo;      // Armazena campo de sobrenome
                         String saldo;            // armazena campo cpf
                         String limite;             // armazena a qtd de contas
		         
		  
		         while ((line = buffer.readLine()) != null) {  
		                                            
		              
		            // UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS  
		            st = new StringTokenizer(line, ";");  
		            String dados = null;  
		  
		            while (st.hasMoreTokens()) {  
		  
		               	                 
		               // Campo tipo 
		               dados = st.nextToken();  
		               tipo = dados;  
                               
                               dados = st.nextToken();
                               saldo = dados;
                               
                               dados = st.nextToken();
                               limite = dados;
		               
		               PreparedStatement importaConta = c.con.prepareStatement("insert into conta(tipo,saldo,limite) values(?,?,?)");
		               importaConta.setString(1, tipo);
                               importaConta.setString(2, saldo);
		               importaConta.setString(3, limite);
		               qtdLinhasAfetadas += importaConta.executeUpdate(); 
 		            }  
		            JOptionPane.showMessageDialog(null,"Importacao de Contas Concluida\nQuantidade de Contas Recuperados: "+ qtdLinhasAfetadas);
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
