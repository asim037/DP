public interface FeedbackStrategy {
    void askStudentQuestions();
    void askParentQuestions();
    void recordFeedback(String feedbackData);
}
