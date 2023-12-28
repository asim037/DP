class Parent implements Observer {
    private int parentID;
    private String name;
    private String contactInformation;

    public Parent(int parentID, String name, String contactInformation) {
        this.parentID = parentID;
        this.name = name;
        this.contactInformation = contactInformation;
    }

    @Override
    public void update() {
        System.out.println("Parent " + name + " notified about feedback update.");
    }

    public void provideFeedback(String feedbackData) {
        System.out.println("Providing feedback: " + feedbackData);
    }

    public void answerQuestions() {
        System.out.println("Answering questions...");
    }
}
