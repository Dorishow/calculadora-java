import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tela tela = new Tela();
        CustomButton btnCalcular = new CustomButton("Calcular", true);
        btnCalcular.setBounds(50,300,250,50);
//        btnCalcular.addActionListener(this::teste);
        btnCalcular.setVisible(true);
        tela.add(btnCalcular);

        JTextField text1 = new JTextField("primeiro número");
        text1.setBounds(50, 150, 250, 50);
        text1.setVisible(true);
        tela.add(text1);

        String[] list = new String[] {"somar", "subtrair", "multiplicar", "dividir"};
        JComboBox cb = new JComboBox(list);
        cb.setBounds(50, 200, 250, 50);
        cb.setVisible(true);

        JTextField text2 = new JTextField("segundo número");
        text2.setBounds(50, 250, 250, 50);
        text2.setVisible(true);

        tela.setVisible(true);
    }
}
