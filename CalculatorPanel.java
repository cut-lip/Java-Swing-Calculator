import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class CalculatorPanel extends JPanel {

    private int openParen;
    private int closeParen;
    private int openCurly;
    private int closeCurly;
    private boolean zeroOK; // This is to keep track of whether other digits are allowed after a zero, i.e. after a decimal point
    private JButton equal;
    private JButton a0Button;
    private JTextArea display;
    private JButton logButton;
    private JButton cotButton;
    private JButton a4Button;
    private JButton divide;
    private JButton subtract;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton cosButton;
    private JButton openParenButton;
    private JButton a7Button;
    private JButton openCurlyButton;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton closeParenButton;
    private JButton closeCurlyButton;
    private JButton add;
    private JButton multiply;
    private JButton sinButton;
    private JButton tanButton;
    private JButton lnButton;
    private JButton exponent;
    private JButton decimalPoint;

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
                if (!zeroOK) {
                    a1Button.setEnabled(false);
                    a2Button.setEnabled(false);
                    a3Button.setEnabled(false);
                    a4Button.setEnabled(false);
                    a5Button.setEnabled(false);
                    a6Button.setEnabled(false);
                    a7Button.setEnabled(false);
                    a8Button.setEnabled(false);
                    a9Button.setEnabled(false);
                }
            }
        });
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
        display.addComponentListener(new ComponentAdapter() {
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                a0Button.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        cotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                a0Button.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                a0Button.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                a0Button.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        exponent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        decimalPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                //subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equal.setEnabled(false);
                exponent.setEnabled(false);
                closeParenButton.setEnabled(false);
                closeCurlyButton.setEnabled(false);
                decimalPoint.setEnabled(false);
            }
        });
        openParenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        closeParenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        openCurlyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        closeCurlyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
