import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATMGUI {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel loginPanel;
    private JPanel menuPanel;
    private JPanel historyPanel;
    private JPanel withdrawPanel;
    private JPanel depositPanel;
    private JPanel transferPanel;
    
    private JTextField userIDField;
    private JPasswordField userPINField;
    private JLabel messageLabel;
    
    private JLabel balanceLabel;
    private JLabel historyLabel;
    
    private JComboBox<String> fromAccountBox;
    private JComboBox<String> toAccountBox;
    private JTextField transferAmountField;
    
    private int userID;
    private int userPIN;
    private double balance;
    private StringBuilder transactionHistory;
    
    public ATMGUI() {
        // Initialize the components
        frame = new JFrame("ATM System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel(new CardLayout());
        
        loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        loginPanel.add(new JLabel("User ID:"), c);
        c.gridx++;
        userIDField = new JTextField(10);
        loginPanel.add(userIDField, c);
        c.gridx = 0;
        c.gridy++;
        loginPanel.add(new JLabel("User PIN:"), c);
        c.gridx++;
        userPINField = new JPasswordField(10);
        loginPanel.add(userPINField, c);
        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 2;
        messageLabel = new JLabel();
        loginPanel.add(messageLabel, c);
        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 1;
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        loginPanel.add(loginButton, c);
        
        menuPanel = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        balanceLabel = new JLabel("Balance: $0.00");
        menuPanel.add(balanceLabel, c);
        c.gridx++;
        JButton historyButton = new JButton("Transaction History");
        historyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showHistory();
            }
        });
        menuPanel.add(historyButton, c);
        c.gridx = 0;
        c.gridy++;
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showWithdraw();
            }
        });
        menuPanel.add(withdrawButton, c);
        c.gridx++;
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDeposit();
            }
        });
        menuPanel.add(depositButton, c);
        c.gridx = 0;
        c.gridy++;
        JButton transferButton = new JButton("Transfer");
        transferButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showTransfer();
            }
        });
        menuPanel.add(transferButton, c);
        c.gridx++;
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quit();
            }
        });
       
    }
}