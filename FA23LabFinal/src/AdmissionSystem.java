public class AdmissionSystem {
    private static AdmissionSystem instance;
    private Feedback feedback;

    private AdmissionSystem() {
        this.feedback = new Feedback();
    }

    public static AdmissionSystem getInstance() {
        if (instance == null) {
            instance = new AdmissionSystem();
        }
        return instance;
    }

    public void suggestProgram(int studentID) {
        System.out.println("Suggesting a program for student ID: " + studentID);
    }

    public void recordFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
