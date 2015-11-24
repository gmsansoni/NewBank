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
			
			con = DriverManager.getConnection(ConexaoBD,"root", "");
                      
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
        
        
        
	
}
