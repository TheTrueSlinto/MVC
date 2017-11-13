package observer;
import java.util.*;

public class Subject {
    private ArrayList <Observer> observers = new ArrayList<>();
    
    public void attach (Observer o) {
        observers.add(o);
    }
    
    public void detattch (Observer o) {
        observers.remove(o);
    }
    
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
    
}
