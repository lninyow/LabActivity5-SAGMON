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

    public void operations(){
        int n1 = Integer.parseInt(tfNumber1.getText());
        int n2 = Integer.parseInt(tfNumber2.getText());
        String op = (String) cbOperations.getSelectedItem();
            int result = 0;
        if(op.equals("+")) {
            result = n1 + n2;
        }else if(op.equals("-")){
            result = n1-n2;
        }else if(op.equals("*")){
            result = n1*n2;
        }else if(op.equals("/")){
            result = n1/n2;
        }
        lblResult.setText(Integer.toString(result));

        }
}
