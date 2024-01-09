package ct2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIExample {
	
	
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Some text that is contained within a panel!"); 
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}



