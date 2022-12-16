package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        setTitle("Simple Calculator");
        lblResult.setEditable(false);
        lblResult.setFocusable(false);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations();
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(550, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void operations() {
        try {
            double n1 = Integer.parseInt(tfNumber1.getText());
            double n2 = Integer.parseInt(tfNumber2.getText());
            String op = (String) cbOperations.getSelectedItem();
            double result = 0;
            if (op.equals("+")) {
                result = n1 + n2;
                String txt1 = String.format("%.0f",result);
                lblResult.setText(txt1);
            } else if (op.equals("-")) {
                result = n1 - n2;
                String txt1 = String.format("%.0f",result);
                lblResult.setText(txt1);
            } else if (op.equals("*")) {
                result = n1 * n2;
                String txt1 = String.format("%.0f",result);
                lblResult.setText(txt1);
            } else if (op.equals("/")) {
                if(n1 == 0 || n2 == 0){
                    JOptionPane.showMessageDialog(panel1,"Cannot divide by zero");
                    return;
                }
                result = n1 / n2;
                lblResult.setText(Double.toString(result));
            }
       }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(panel1,"Not a number\nPlease Enter a number!");
    }
        }
}
