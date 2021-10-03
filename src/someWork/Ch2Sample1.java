package someWork;

import javax.swing.*;

public class Ch2Sample1 {

    public static void main(String[] args) {

        JFrame  myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("My first java program with J option");
        myWindow.setVisible(true);

        String temStr = "Espresso";
        temStr = temStr.substring(2,7);
        temStr.indexOf("E");
        System.out.print(temStr);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String fullName, firstName, lastName, space;
        fullName = new String("Decafe Latte");
        space = new String(" ");
        firstName = fullName.substring(0, fullName.indexOf(space));
        lastName = fullName.substring(fullName.indexOf(space) + 1, fullName.length());
        System.out.println("Full Name: " + fullName);
        System.out.println("First: " + firstName);
        System.out.println("Last: " + lastName);
        System.out.println("Your last name has " + lastName.length( )
                + " characters.");

    }
}
