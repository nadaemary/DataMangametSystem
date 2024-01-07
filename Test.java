public class Test {


    public static void main(String[] args) {
        System.out.println("This program tests if the CRUD operaton is done correctly");
        DataManager manager1 = new DataManager();
        Menu m1 = new Menu(manager1);
        Doctor d0 = new Doctor(0, "Harry", "cardiology");
        Doctor d1 = new Doctor(1, "Ron", "managemetn");
        Patient p2 = new Patient(2, "Luna", "diabitic");
        Patient p4 = new Patient(4, "Fred", "cancer");
        Patient p3 = new Patient(3, "Goorge", "dimensia");

        m1.addInterface(d0);
        //m1.displayInterface();
        m1.addInterface(p2);
        m1.updateInterface(p2,p3);
        System.out.println(manager1.getIndeces());
        m1.displayInterface();

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
