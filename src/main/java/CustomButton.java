import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    CustomButton(String text, boolean disable){
        setText(text);
        setFont(new Font("Times New Roman", Font.PLAIN, 20));
        this.setDisable(disable);
    }
    public void setDisable(boolean disable){
        if(disable){
            this.setForeground(new Color(77, 80, 97));
            this.setBackground(new Color(205, 209, 196));
        } else {
            this.setForeground(new Color(48, 50, 61));
            this.setBackground(new Color(232, 197, 71));
        }
    }
}
