package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        setTitle("Leap Year Checker");
    btnCheckYear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            leap_Year();
        }
    });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void leap_Year(){
       try {
           boolean leap_year;
           int year = Integer.parseInt(tfYear.getText());
           if (year % 4 == 0) {
               if (year % 100 == 0) {
                   if (year % 400 == 0)
                       leap_year = true;
                   else
                       leap_year = false;
               } else
                   leap_year = true;
           } else
               leap_year = false;

           if (leap_year) {
               JOptionPane.showMessageDialog(panel1, "Leap year");
           } else {
               JOptionPane.showMessageDialog(panel1, "Not a leap year");
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(panel1,"Not a number!, Please input again!");
       }
    }
}

