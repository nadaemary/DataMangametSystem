import java.util.ArrayList;

public class DataManager {
    private ArrayList<User> usersList = new ArrayList<User>();

    public DataManager(){
        //this.usersList.clear();
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public void addUser(User user1){
        this.usersList.add(user1);
    }

    public void deleteUser(User user1){
        this.usersList.remove(user1.getId());
    }

    public void displayUsers(){
        for (int i = 0; i < usersList.size(); i++){
            System.out.print("the " + i + "th user is ");
            System.out.println(usersList.get(i));
        }
    }
    public void updateUser(User user1, User user2){
        this.usersList.set(user1.getId(), user2);
    }
    // TODO: this function updates certain user by another one
    // we need to implement other function where we can update user's name id or other.
    // first we have to decide how will we implement these functioalites.
}
