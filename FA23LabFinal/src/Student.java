class Student implements Observer {
    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Student " + name + " notified about feedback update.");
    }

    public void suggestProgram() {
        System.out.println("Suggesting a program...");
    }

    public void answerQuestions() {
        System.out.println("Answering questions...");
    }

}
