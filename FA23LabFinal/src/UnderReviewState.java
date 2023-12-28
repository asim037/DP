class UnderReviewState implements FeedbackState {
    @Override
    public void submit() {
        System.out.println("Cannot submit feedback in the under review state.");
    }

    @Override
    public void review() {
        System.out.println("Feedback is already under review.");
    }

    @Override
    public void approve() {
        System.out.println("Approving feedback...");
    }
}