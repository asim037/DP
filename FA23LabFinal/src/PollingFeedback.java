class PollingFeedback implements FeedbackStrategy {
    @Override
    public void askStudentQuestions() {
        System.out.println("Asking polling questions to students...");
    }

    @Override
    public void askParentQuestions() {
        System.out.println("Asking polling questions to parents...");
    }

    @Override
    public void recordFeedback(String feedbackData) {
        System.out.println("Recording polling feedback: " + feedbackData);
    }
}
