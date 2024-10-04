import java.util.*;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BloodData bloodData = new BloodData();
        bloodData.defaultPatient();
        bloodData.displayBloodInfo();


        System.out.println("Enter a Blood Type");
        String bloodtype = input.next();
        bloodData.setBloodType(bloodtype);

        System.out.println("Enter a Rh factor: ");
        String rhfactor = input.next();
        bloodData.setRhFactor(rhfactor);

        bloodData.displayBloodInfo();

    }
    
}
