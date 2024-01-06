public class Test {

    public static void main(String[] args) {
        DataManager manager1 = new DataManager();
        Menu m1 = new Menu(manager1);

        Doctor d1 = new Doctor(0, "Harry", "cardiology");
        Doctor d2 = new Doctor(1, "Ron", "managemetn");
        User u1 = new User(1, "Luna");

        m1.addInterface(d1);
        m1.addInterface(d2);
        System.out.println("Harry and Ron should be printed");
        m1.displayInterface();
        m1.updateInterface(d1, u1);
        System.out.println("Harry and Luna should be printed");
        m1.displayInterface();
        m1.deleteInterface(d1);
        System.out.println("Ron and Luna should be printed");
        m1.displayInterface();




    }
}
