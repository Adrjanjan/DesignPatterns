package pl.agh.wpo;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ObserverImplementation());

        subject.event();
    }
}
