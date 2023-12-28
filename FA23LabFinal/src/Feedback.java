import java.util.ArrayList;
import java.util.List;

public class Feedback {
    private FeedbackStrategy feedbackStrategy;
    private FeedbackState feedbackState;
    private List<Observer> observers = new ArrayList<>();

    public void setFeedbackStrategy(FeedbackStrategy feedbackStrategy) {
        this.feedbackStrategy = feedbackStrategy;
    }

    public void setFeedbackState(FeedbackState feedbackState) {
        this.feedbackState = feedbackState;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void submitFeedback() {
        feedbackState.submit();
    }

    public void reviewFeedback() {
        feedbackState.review();
        notifyObservers();
    }

    public void approveFeedback() {
        feedbackState.approve();
        notifyObservers();
    }

    public void askStudentQuestions() {
        feedbackStrategy.askStudentQuestions();
    }

    public void askParentQuestions() {
        feedbackStrategy.askParentQuestions();
    }

    public void recordFeedback(String feedbackData) {
        feedbackStrategy.recordFeedback(feedbackData);
    }
}
