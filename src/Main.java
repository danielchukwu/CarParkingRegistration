import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Main {
    public static void main (String[] args) {
        // frame created
        JFrame pageFrame = new JFrame();

        // frame size set
        pageFrame.setSize(600, 900);
        // frame layout set
        pageFrame.setLayout(new GridLayout(10, 1));

        // label for title created
        JLabel title = new JLabel("Vehicle Parking Registration Form");

        // create text fields for from
        JTextField name_of_primary_driver = new JTextField("Enter Name Of Primary Driver");
        JTextField home_address = new JTextField("Enter Home Address");
        JTextField telephone = new JTextField("Enter Telephone");
        JTextField licence_number = new JTextField("Enter Licence Number");
        JTextField model = new JTextField("Enter Car Model");
        JTextField color = new JTextField("Enter Color");
        JTextField vehicle_plate_number = new JTextField("Enter Vehicle Plate Number");
        JTextField date = new JTextField("Enter Date");

        // add text fields to our frame(pageFrame)
        pageFrame.add(title);
        pageFrame.add(name_of_primary_driver);
        pageFrame.add(home_address);
        pageFrame.add(telephone);
        pageFrame.add(licence_number);
        pageFrame.add(model);
        pageFrame.add(color);
        pageFrame.add(vehicle_plate_number);
        pageFrame.add(date);

        // create button and add button
        JButton button = new JButton("submit");
        button.setBackground(Color.red);  // change button background color
        button.setForeground(Color.WHITE);  // change button text color
        pageFrame.add(button);  // add button

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // extract inputs from text field
                String name = name_of_primary_driver.getText();
                String home_ad = home_address.getText();
                String tele_p = telephone.getText();
                String licence_n = licence_number.getText();
                String mode_l = model.getText();
                String colo_r = color.getText();
                String vehicle_pn = vehicle_plate_number.getText();
                String dat_e = date.getText();

                // create a file and write into the file
                try {
                    // create a file
                    FileWriter reg_file = new FileWriter("vehicle_parking_registration_form.txt");

                    // write to file
                    reg_file.append("CAR PARKING REGISTRATION FORM\n\n");
                    reg_file.append("Name Of Primary Driver - " + name + "\n");
                    reg_file.append("Home Address - " + home_ad + "\n");
                    reg_file.append("Telephone - " + tele_p + "\n");
                    reg_file.append("Licence Number - " + licence_n + "\n");
                    reg_file.append("Vehicle Model - " + mode_l + "\n");
                    reg_file.append("Vehicle Color - " + colo_r + "\n");
                    reg_file.append("Vehicle Plate Number - " + vehicle_pn + "\n");
                    reg_file.append("Date - " + dat_e + "\n");

                    // close file
                    reg_file.close();

                } catch (Exception pg){   // in case any error occur with the file writing. catch that error
                    System.out.println("an error occurred");
                }
            }
        });

        // make frame(pageFrame) visible
        pageFrame.setVisible(true);
    }
}
