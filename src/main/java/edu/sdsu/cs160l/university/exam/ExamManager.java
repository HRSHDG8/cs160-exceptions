package edu.sdsu.cs160l.university.exam;

import java.util.HashSet;
import java.util.Set;

public class ExamManager {
    private final Set<ExamObserver> observers;

    public ExamManager() {
        this.observers = new HashSet<>();
    }

    public void subscribeToResults(ExamObserver observer) {
        observers.add(observer);
    }

    public void unsubscribeFromResults(ExamObserver observer) {
        observers.remove(observer);
    }

    public void publishResults(String labName) {
        //some code that posts grade to canvas
        for (ExamObserver observer : observers) {
            observer.onResultPublished("Results for " + labName + " published");
        }
    }

}
