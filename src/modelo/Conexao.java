package modelo;

import java.sql.*;

public class Conexao {
	Connection conn;
	
	public void Conecta(){
	try {
	   Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","");
            System.out.println("Conectou!!!");
	}catch(ClassNotFoundException|SQLException e){
		System.out.println("Erro: +" + e);
	}

    }
	public void Desconecta() {
	try {
	  conn= DriverManager.getConnection("jdbc:mysql://localhost","root","");
            System.out.println("Desconectou");
	}catch(SQLException e){
		System.out.println("Erro: +" +e);
 	  }
   		
	}
        
       
            }
        
       