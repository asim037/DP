public class SurveyFeedback implements FeedbackStrategy{
    public void askStudentQuestions() {
        System.out.println("Asking survey questions to students...");
    }
    @Override
    public void askParentQuestions() {
        System.out.println("Asking survey questions to parents...");
    }

    @Override
    public void recordFeedback(String feedbackData) {
        System.out.println("Recording survey feedback: " + feedbackData);
    }


}
