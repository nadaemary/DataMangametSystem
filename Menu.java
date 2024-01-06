public class Menu {
    private DataManager dataManager;

    public Menu(DataManager manager){
        this.dataManager = manager;

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
