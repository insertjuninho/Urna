package visao;

import java.awt.event.*;
import javax.swing.*;
import modelo.Conexao;

public class Cad extends JFrame {
    private static final long serialVersionUID = 1L;
     Conexao cn = new Conexao(); 
     JPanel painel = new JPanel();
     JLabel titulo;
     JLabel n;
    // JLabel n1;
     JTextField txtNome;
    // JTextField txtNome1;
     
     JTextField txtNumero;
     JButton btnCons;
     
     public Cad(){
         super("Urna 2019");
         setBounds(20, 20 , 450 , 450);
         setVisible(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         Consulta();
         setContentPane(painel);
         
    
}
     
     public void Consulta(){
         titulo = new JLabel("Presidente:");
         painel.add(titulo);
         
         txtNome = new JTextField(20);
         painel.add(txtNome);
         
         n = new JLabel("Numero:");
         painel.add(n);
         
         txtNumero = new JTextField(5);
         painel.add(txtNumero);
         
         btnCons = new JButton ("Confimar");
         painel.add(btnCons);
    
          titulo = new JLabel("Governador:");
         painel.add(titulo);
         
         txtNome = new JTextField(20);
         painel.add(txtNome);
         
         n = new JLabel("Numero:");
         painel.add(n);
         
         txtNumero = new JTextField(5);
         painel.add(txtNumero);
         
         btnCons = new JButton ("Confimar");
         painel.add(btnCons);
         
         btnCons.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
             //  cn.Consulta(txtNome.getText());
           }   
         });

}
}
