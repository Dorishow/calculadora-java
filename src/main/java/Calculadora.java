import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class Calculadora extends JFrame implements ActionListener {
   JTextField firstNumber = new JTextField();
   JTextField secondNumber = new JTextField();
   Choice operation = new Choice();
   JLabel result = new JLabel("Resultado");

  Calculadora(){
     setLayout(new GridLayout(5,2,5,0));
     setSize(360, 480);
     add(new Label("Digite um número"));
     add(this.firstNumber);
     add(new Label("Digite outro número"));
     add(this.secondNumber);

     add(new Label("Selecione a operação"));
     operation.add("soma");
     operation.add("subtração");
     operation.add("multiplicação");
     operation.add("divisão");
     operation.add("porcentagem");
     operation.add("raiz");
     operation.add("potência");
     operation.addItemListener(this::itemStateChanged);
     add(operation);

     CustomButton btn = new CustomButton("Calcular");
     btn.addActionListener(this);
     add(btn);
     add(result);

     setVisible(true);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }


   @Override
   public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(this.firstNumber.getText());
        double b = Double.parseDouble(this.secondNumber.getText());
        Operacoes operacoes = new Operacoes();
        String operation = this.operation.getSelectedItem();
        double result = operacoes.calcular(this.operation.getSelectedItem(), a, b);
        this.result.setText(" = " + String.valueOf(result));
   }

   public void itemStateChanged(ItemEvent e){
      String operation = this.operation.getSelectedItem();
      if(operation == "raiz"){
         secondNumber.setText("2");
         this.result.setText("Apenas raiz quadrada");
      }
      if(operation == "potência"){
         secondNumber.setText("2");
         this.result.setText("Apenas elevar ao quadrado");
      }
   }
}
