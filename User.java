public class User {
    private String typeOfUser;
    private int id;
    private String name;

    public User() {
    }

    public User(int i, String n){

        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public void displayUser(){
        System.out.println("Printing the data of the user in the system");
        System.out.println("ID is " + getId());
        System.out.println("Name is " + getName());
        System.out.println("Type of user is " + getTypeOfUser());

    }


}


