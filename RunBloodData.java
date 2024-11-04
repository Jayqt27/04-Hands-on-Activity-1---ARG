import java.util.Scanner;

class BloodData {
    static String bloodType; 
    static String rhFactor;

    public BloodData() {
        bloodType = "O"; 
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) { 
        bloodType = bt;
        rhFactor = rh; 
    }

    public void display() { 
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    } 
}

public class RunBloodData {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        String bt; 
        String rh; 
        BloodData bd = new BloodData(); 

        System.out.print("Enter blood type of patient: "); 
        bt = scan.nextLine().trim(); 

        System.out.print("Enter Rhesus factor (+ or -): "); 
        rh = scan.nextLine().trim(); 

        if (bt.equals("A") || bt.equals("B") || bt.equals("O") || bt.equals("AB")) { 
            bd = new BloodData(bt, rh); 
        } 

        bd.display(); 
        
        scan.close(); 
    } 
}