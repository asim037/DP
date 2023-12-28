class ApprovedState implements FeedbackState {
    @Override
    public void submit() {
        System.out.println("Cannot submit feedback in the approved state.");
    }

    @Override
    public void review() {
        System.out.println("Cannot review feedback in the approved state.");
    }

    @Override
    public void approve() {
        System.out.println("Feedback is already approved.");
    }
}

