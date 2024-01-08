import java.util.ArrayList;
public class Test {


    public static void main(String[] args) {
        //ArrayList<User> allUsers = new ArrayList<User>();

        System.out.println("This program tests if the CRUD operaton is done correctly");
        DataManager manager1 = new DataManager();
        Menu m1 = new Menu(manager1);

        Doctor drHarry = new Doctor(0, "Harry", "cardiology");
        m1.addUerToDatabase(drHarry);
        Doctor drRon = new Doctor(1, "Ron", "managemetn");
        m1.addUerToDatabase(drRon);
        Patient patientLuna = new Patient(2, "Luna", "diabitic");
        m1.addUerToDatabase(patientLuna);
        Patient patientFred = new Patient(4, "Fred", "cancer");
        m1.addUerToDatabase(patientFred);
        Patient patientGoorge = new Patient(3, "Goorge", "dimensia");
        m1.addUerToDatabase(patientGoorge);
        m1.manageInterface();
        //m1.displayInterface();



        /*
        m1.addInterface(drHarry);
        //m1.displayInterface();
        m1.addInterface(patientLuna);
        m1.updateInterface(patientLuna,patientFred);
        System.out.println(manager1.getIndeces());
        m1.displayInterface();
*/
        /*
        m1.addInterface(d1);
        m1.addInterface(d2);
        System.out.println("Harry and Ron should be printed");
        m1.displayInterface();
        m1.updateInterface(d1, u1);
        System.out.println("Harry and Luna should be printed");
        m1.displayInterface();
        m1.deleteInterface(d1);
        System.out.println("Ron and Luna should be printed");
        m1.displayInterface();*/




    }
}
