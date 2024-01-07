class Patient extends User
{
    private String medicalHistory;

    public Patient(int userId, String userName, String medicalHistory)
    {
        super(userId, userName);
        setTypeOfUser("Patient");
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory()
    {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory)
    {
        this.medicalHistory = medicalHistory;
    }
    @Override public void displayUser(){
        super.displayUser();
        System.out.println("Patient's Medical History is " + getMedicalHistory());


    }

}