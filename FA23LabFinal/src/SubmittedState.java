class SubmittedState implements FeedbackState {
    @Override
    public void submit() {
        System.out.println("Feedback is already in the submitted state.");
    }

    @Override
    public void review() {
        System.out.println("Reviewing feedback...");
    }

    @Override
    public void approve() {
        System.out.println("Cannot approve feedback in the submitted state.");
    }
}
