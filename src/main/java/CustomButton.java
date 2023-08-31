import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    CustomButton(String text){
        setText(text);
        setFont(new Font("Times New Roman", Font.PLAIN, 20));
        this.setForeground(new Color(48, 50, 61));
        this.setBackground(new Color(232, 197, 71));
    }

}
