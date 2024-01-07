public class Menu {
    private DataManager dataManager;


    public Menu(DataManager manager){
        this.dataManager = manager;
        System.out.println("Choose which operation you want to perform as follows ");
        System.out.println("1: for adding a user");
        System.out.println("2: for deleting a user");
        System.out.println("3: for updating a user");
        System.out.println("4: for displaying all users");
    }


    public DataManager getDataManager() {
        return dataManager;
    }

    public void setDataManager(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void addInterface(User user1){
        dataManager.addUser(user1);
    }

    public void deleteInterface(User user1){
        dataManager.deleteUser(user1);
    }

    public void displayInterface(){
        dataManager.displayUsers();
    }

    public void updateInterface(User user1, User user2){
        dataManager.updateUser(user1, user2);
    }


}
