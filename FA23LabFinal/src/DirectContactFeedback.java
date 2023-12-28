class DirectContactFeedback implements FeedbackStrategy {
    @Override
    public void askStudentQuestions() {
        System.out.println("Asking direct contact questions to students...");
    }

    @Override
    public void askParentQuestions() {
        System.out.println("Asking direct contact questions to parents...");
    }

    @Override
    public void recordFeedback(String feedbackData) {
        System.out.println("Recording direct contact feedback: " + feedbackData);
    }
}
