//import definition
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.*;

//to specify some actionevent
public class calculator extends JPanel implements ActionListener {
  final private JTextField display = new JTextField("0");
  private double result = 0;
  private String operator = "=";
  private boolean calculating = true;
 
  public calculator() {
    setLayout(new BorderLayout());
    //seteditable false user cant edit disp field
    display.setEditable(false);
    display.setPreferredSize(new Dimension(70,70));
    add(display, "North");
    Font bigFont = display.getFont().deriveFont(Font.PLAIN, 25f);
              display.setFont(bigFont);
    //setting Jpanel
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4,4));
    //labeling of buttons
    String buttonLabels = "789/456*123-0.=+";
    for (int i = 0; i < buttonLabels.length(); i++) {
      JButton b = new JButton(buttonLabels.substring(i, i + 1));
      b.setFont(bigFont);
      panel.add(b);
      b.addActionListener(this);
    }
    add(panel, "Center");
  }         
 
  public void actionPerformed(ActionEvent evt) {
    String cmd = evt.getActionCommand();
    if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
      if (calculating)
        display.setText(cmd);
      else
        display.setText(display.getText() + cmd);
      calculating = false;
    } else {
      if (calculating) {
        if (cmd.equals("-")) {
          display.setText(cmd);
          calculating = false;
        } else
          operator = cmd;
      } else {
        double x = Double.parseDouble(display.getText());
        calculate(x);
        operator = cmd;
        calculating = true;
      }
    }
  }
 

  private void calculate(double n) {
    switch (operator) {
      case "+" -> result += n;
      case "-" -> result -= n;
      case "*" -> result *= n;
      case "/" -> result /= n;
      case "=" -> result = n;
    }

    display.setText("" + result);
  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(false);
    JFrame frame = new JFrame();
    frame.setTitle("Calculator");
    frame.setSize(300,300);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
 
    Container contentPane = frame.getContentPane();
    contentPane.add(new calculator());
    frame.setVisible(true); // frame.show() is deprecated
  }    
}
