package pl.agh.wpo;

public class ObserverImplementation implements Observer{
    @Override
    public  void update(){
        System.out.println("ObserverImplementation.update was called");
    }
}
