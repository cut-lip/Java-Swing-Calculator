import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class CalculatorPanel extends JPanel {
    private JButton decimalPoint;
    private JButton a0Button;
    private JTextArea display;
    private JButton logButton;
    private JButton cotButton;
    private JButton a4Button;
    private JButton button6;
    private JButton button7;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton cosButton;
    private JButton button13;
    private JButton a7Button;
    private JButton button15;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton sinButton;
    private JButton tanButton;
    private JButton lnButton;
    private JButton button2;

    public CalculatorPanel() {
        //this.setBackground(Color.green);
        display.setEditable(false);
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        display.addComponentListener(new ComponentAdapter() {
        });
    }
}
