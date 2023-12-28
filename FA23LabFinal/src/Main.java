import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FeedbackStrategy surveyFeedback = new SurveyFeedback();
        FeedbackStrategy pollingFeedback = new PollingFeedback();
        FeedbackStrategy directContactFeedback = new DirectContactFeedback();

        FeedbackState submittedState = new SubmittedState();
        FeedbackState underReviewState = new UnderReviewState();
        FeedbackState approvedState = new ApprovedState();

        // Create instances of observers
        Admin admin = new Admin("Admin1");
        Student student = new Student(1, "Student1");
        Parent parent = new Parent(1, "Parent1", "Contact123");

        // Create an instance of the AdmissionSystem
        AdmissionSystem admissionSystem = AdmissionSystem.getInstance();

        // Create an instance of Feedback
        Feedback feedback = new Feedback();
        feedback.setFeedbackState(submittedState);
        feedback.setFeedbackStrategy(surveyFeedback);

        // Add observers to the feedback
        feedback.addObserver(admin);
        feedback.addObserver(student);
        feedback.addObserver(parent);
        Scanner scanner = new Scanner(System.in);

        // Menu-driven simulation
        int choice;
        do {
            System.out.println("1. Submit Feedback");
            System.out.println("2. Review Feedback");
            System.out.println("3. Approve Feedback");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            // Assume user enters a valid integer choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    feedback.submitFeedback();
                    break;
                case 2:
                    feedback.reviewFeedback();
                    break;
                case 3:
                    feedback.approveFeedback();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
        scanner.close();
    }

}