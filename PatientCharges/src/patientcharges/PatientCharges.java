/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientcharges;

import java.util.Scanner;

public class PatientCharges {

    public static double charge(double nights, double medication, double lab) {
        return nights + medication + lab;
    }
    
    public static double charge(double medication, double lab){
        return medication + lab;
    }
    
    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        double medication, lab;
        double nights;
        System.out.println("Hello Pateient, was your stay an overnight? Y/n");
        answer = input.next();
        if (answer.equals("Y")) {
            System.out.println("Please input the cost of nights, medication and lab?");
            nights = input.nextDouble();
            medication = input.nextDouble();
            lab = input.nextDouble();
            System.out.println("Your total is: $" + charge(nights, medication, lab));
        } else {
            System.out.println("Please input the cost of medication and lab?");
            medication = input.nextDouble();
            lab = input.nextDouble();
            System.out.println("Your total is: $" + charge(medication, lab));
        }
    }
    
}
