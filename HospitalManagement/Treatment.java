public class Treatment {

    private int treatmentID;
    private String type;
    private String description;

    public void setTreatmentID(int treatmentID) {
        this.treatmentID = treatmentID;
    }

    public int getTreatmentID() {
        return treatmentID;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
