package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public FoodOrderGUI(){
        setTitle("Food Ordering System");

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                food_order();
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(550, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void food_order(){
        double sum = 0;
            if(cPizza.isSelected()){
                sum+= 100;
            }if(cBurger.isSelected()){
                sum+=80;
            }if(cFries.isSelected()){
                sum+=65;
            }if(cSoftDrinks.isSelected()){
                sum+=55;
            }if(cTea.isSelected()){
                sum+=50;
            }if(cSundae.isSelected()){
                sum+=40;
            }

            if(rbNone.isSelected()){
                String nFormat = String.format("%.2f",sum);
                JOptionPane.showMessageDialog(panel1,"The total price is Php "+ nFormat);
            }else if(rb5.isSelected()){
                double d1 = sum *.05;
                sum = sum - d1;
                String nFormat = String.format("%.2f",sum);
                JOptionPane.showMessageDialog(panel1,"The total price is Php "+ nFormat);
            }else if(rb10.isSelected()){
                double d1 = sum *.10;
                sum = sum - d1;
                String nFormat = String.format("%.2f",sum);
                JOptionPane.showMessageDialog(panel1,"The total price is Php "+ nFormat);
            }else if(rb15.isSelected()) {
                double d1 = sum * .15;
                sum = sum - d1;
                String nFormat = String.format("%.2f", sum);
                JOptionPane.showMessageDialog(panel1, "The total price is Php " + nFormat);
            }


    }

}
