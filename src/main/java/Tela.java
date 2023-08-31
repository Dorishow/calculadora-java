import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
    public Tela(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(360, 480);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(48, 50, 61));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    private void teste(ActionEvent e){
        JOptionPane.showMessageDialog(null, "clicou");
    }
}
