package CT2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankBalanceApplication {
    static double balance = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel balanceLabel = new JLabel("Balance: $" + balance);
        panel.add(balanceLabel);

        JTextField inputTextField = new JTextField(10);
        panel.add(inputTextField);
        
        JButton initialBalanceButton = new JButton("Initial Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        panel.add(initialBalanceButton);
        panel.add(depositButton);
        panel.add(withdrawButton);

        depositButton.setEnabled(false);
        withdrawButton.setEnabled(false);

        frame.add(panel);
        frame.setVisible(true);

        initialBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String initialBalanceString = inputTextField.getText();
                double initialBalance = Double.parseDouble(initialBalanceString);
                balance = initialBalance;
                balanceLabel.setText("Balance: $" + balance);
                initialBalanceButton.setEnabled(false);
                depositButton.setEnabled(true);
                withdrawButton.setEnabled(true);
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String depositAmountString = inputTextField.getText();
                double depositAmount = Double.parseDouble(depositAmountString);
                balance += depositAmount;
                balanceLabel.setText("Balance: $" + balance);
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String withdrawalAmountString = inputTextField.getText();
                double withdrawalAmount = Double.parseDouble(withdrawalAmountString);
                if (withdrawalAmount <= balance) {
                    balance -= withdrawalAmount;
                    balanceLabel.setText("Balance: $" + balance);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!");
                }
            }
        });
    }
}