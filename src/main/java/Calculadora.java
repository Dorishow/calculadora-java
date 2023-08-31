import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame{
     Calculadora(){
        setLayout(new GridLayout(5,2,5,0));
        setSize(360, 480);
        add(new Label("Digite um número"));
        add(new JTextField("número"));
        add(new Label("Digite outro número"));
        add(new JTextField("número"));


        Choice c = new Choice();
        c.add("soma");
        c.add("subtração");
        c.add("multiplicação");
        c.add("divisão");
        c.add("porcentagem");
        c.add("raiz");
        c.add("potência");
        add(new Label("Selecione a operação"));
        add(c);

        add(new CustomButton("Calcular", true));
         add(new Label("100"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


}
