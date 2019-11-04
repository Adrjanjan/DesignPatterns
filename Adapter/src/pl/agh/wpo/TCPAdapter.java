package pl.agh.wpo;

public class TCPAdapter {
    private OldTCP oldTCP;

    public TCPAdapter(OldTCP oldTCP) {
        this.oldTCP = oldTCP;
    }

    public void newMethod(){
        this.oldTCP.oldMethod();
    }
}
