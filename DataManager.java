import java.util.Scanner;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class DataManager {
    private ArrayList<User> usersList = new ArrayList<User>();
    private Map<String, Integer> indeces= new HashMap<>();
    // this dictiionary is used to map the name of the user to it's index in the arraylist

    int lastIndex;
    public DataManager(){
        System.out.println("a Data Manager is assingned!");
        lastIndex = 0;
        this.usersList.clear();
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public Map<String, Integer> getIndeces() {
        return indeces;
    }


    public boolean isAdded(User user){

        for ( String key: indeces.keySet()){
            if (key.equals(user.getName())){
                return true;
            }
        }
        return false;
        }

    public int getIndex(User user){
        return indeces.get(user.getName());
    }

    public void addUser(User user){
        if (isAdded(user)){
            System.out.println("user " + user.getName() + " is aleady added");
        }
        else {
            indeces.put(user.getName(), lastIndex);
            lastIndex += 1;
            this.usersList.add(user);
            System.out.println("user " +  user.getName() +" added!");
        }

    }

    public void deleteUser(User user){
        if (isAdded(user)){
            int index = indeces.get(user.getName());
            indeces.remove(user.getName());
            this.usersList.remove(index);
            for (int i = index; i < usersList.size(); i++){
                indeces.put(usersList.get(i).getName(),i);
            }
            System.out.println("user " +  user.getName() +" deleted!");
        }
        else {
            System.out.println("user " + user.getName()+ " is not part of our system");
        }

    }

    public void displayUsers(){
        if (usersList.isEmpty()){
            System.out.println("our System is empty ");
        }
        else {
            int numberOfUsers = usersList.size();
            System.out.println("We have "+ numberOfUsers + " users as follows");
            System.out.println("displaying users");
            for (User user : usersList) {
                user.displayUser();
            }
        }
    }
    public void updateUser(User user1, User user2){
        if (isAdded(user1)){
            this.usersList.set(getIndex(user1), user2);
            // we changed the users list
            // now we need to update the indices map
            indeces.remove(user1.getName());
            lastIndex -= 1;
            indeces.put(user2.getName(), lastIndex);
            lastIndex += 1;
            for (int i = 0; i < usersList.size(); i++){
                indeces.put(usersList.get(i).getName(),i);
            }
            System.out.println("user "+ user1.getName() + " updated by " + user2.getName());
        }
        else {
            System.out.println(user1.getName()+ "is not part of our system");
        }
    }

    public void updateUser(User user, String newName){
        if (isAdded(user)){
            String oldName = user.getName();
            user.setName(newName);
            System.out.println("user's name updated from "+ oldName + " to " + newName);
        }
        else {
            System.out.println(user.getName()+ "is not part of our system");
        }

    }


    // TODO: this function updates certain user by another one
    // we need to implement other function where we can update user's name id or other.
    // first we have to decide how will we implement these functioalites.
}
