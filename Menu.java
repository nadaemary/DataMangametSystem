import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private DataManager dataManager;
    private ArrayList<User> allUsers = new ArrayList<User>();


    public Menu(DataManager manager) {
        this.dataManager = manager;
    }


    public DataManager getDataManager() {
        return dataManager;
    }

    public void setDataManager(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }

    public void addInterface(User user1) {
        dataManager.addUser(user1);
    }

    public void deleteInterface(User user1) {
        dataManager.deleteUser(user1);
    }

    public void displayInterface() {
        dataManager.displayUsers();
    }

    public void updateInterface(User user1, User user2) {
        dataManager.updateUser(user1, user2);
    }

    public void updateInterface(User user, String name) {
        dataManager.updateUser(user, name);
    }

    public void addUerToDatabase(User user) {
        allUsers.add(user);
    }

    public void whichUpdateInterface(){
        System.out.println("choose which update you want to execute");
        System.out.println("U: update user by user");
        System.out.println("N: update user's name");
        Scanner scannerObj = new Scanner(System.in);
        String updateType = scannerObj.nextLine();
        switch (updateType){
            case "U":
                System.out.println("choose which user you want to be updated");
                int userToUpdate = scannerObj.nextInt();
                scannerObj.nextLine();
                System.out.println("choose which user you want to be updated by");
                int userToUpdateBy = scannerObj.nextInt();
                scannerObj.nextLine();
                updateInterface(allUsers.get(userToUpdate), allUsers.get(userToUpdateBy));
                break;
            case "N":
                int userToUpdate2 = scannerObj.nextInt();
                scannerObj.nextLine();
                System.out.println("what is the new name? ");
                String userNewName = scannerObj.nextLine();
                updateInterface(allUsers.get(userToUpdate2), userNewName);
                break;
        }
    }

    public void manageInterface() {
        System.out.println("print outside the do loop");
        System.out.println("Choose which operation you want to perform as follows ");
        System.out.println("1: for adding a user");
        System.out.println("2: for deleting a user");
        System.out.println("3: for updating a user");
        System.out.println("4: for displaying all users");
        System.out.println("5: to exit! ");
        Scanner scannerObj = new Scanner(System.in);
        String operaton = scannerObj.nextLine();
        while (!Objects.equals(operaton, "5")) {
            switch (operaton) {
                case "1":
                    System.out.println("You can add a user");
                    System.out.println("choose which user you want to add");
                    int userToAdd = scannerObj.nextInt();
                    scannerObj.nextLine();
                    addInterface(allUsers.get(userToAdd));
                    break;
                case "2":
                    System.out.println("You can delete a user");
                    System.out.println("choose which user you want to delete");
                    int userToDelete = scannerObj.nextInt();
                    scannerObj.nextLine();
                    deleteInterface(allUsers.get(userToDelete));
                    break;
                case "3":
                    System.out.println("You can update a user");
                    whichUpdateInterface();
                    break;
                case "4":
                    System.out.println("You can display all uers");
                    displayInterface();
                    break;
            }
            System.out.println("Choose which operation you want to perform as follows ");
            System.out.println("1: for adding a user");
            System.out.println("2: for deleting a user");
            System.out.println("3: for updating a user");
            System.out.println("4: for displaying all users");
            System.out.println("5: to exit! ");
            operaton = scannerObj.nextLine();
        }

        System.out.println("You finished managing");
    }
}



