public class Admin implements Observer {
    private String name;

    public Admin(String name) {
        this.name = name;
    }


    public void viewStudentFeedback(int studentID) {
        System.out.println("Viewing feedback for student ID: " + studentID);
    }

    public void generateAdmissionReport() {
        System.out.println("Generating admission report...");
    }

    public void informStudentAboutReview(int studentID) {
        System.out.println("Informing student with ID " + studentID + " about feedback review.");
    }

    public void update() {
        System.out.println("Admin " + name + " notified about feedback update.");
    }
}
