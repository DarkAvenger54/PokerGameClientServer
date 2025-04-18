package pl.edu.wsisiz.darkavenger54;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JTextField textFieldPort;
    private JButton buttonStart;
    private JButton buttonStop;
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private JTextArea textAreaLog;
    private Server server;
    public MainForm()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setMinimumSize(new Dimension(300, 300));
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        buttonStart.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (Utility.tryParseStringToInt(textFieldPort.getText()))
                {
                    buttonStart.setEnabled(false);
                    buttonStop.setEnabled(true);
                    server = new Server(Integer.parseInt(textFieldPort.getText()));
                    textAreaLog.append("Server started\n");
                    server.start();
                }
                else
                {
                    textAreaLog.append("Error\n");
                }
            }
        });
        buttonStop.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                buttonStart.setEnabled(true);
                buttonStop.setEnabled(false);
                server.stop();
            }
        });
    }
}
