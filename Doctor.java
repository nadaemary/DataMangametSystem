public class Doctor extends User {

    private String department;

    public Doctor(int i, String n, String d){
        super(i,n);
        setTypeOfUser("Doctor");
        department = d;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayUser() {
        super.displayUser();
        System.out.println("Doctor's department is " + getDepartment());
    }
}

