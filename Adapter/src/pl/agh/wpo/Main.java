package pl.agh.wpo;

public class Main {
    public static void main(String[] args) {
        TCPAdapter tcpAdapter = new TCPAdapter(new OldTCP());
        tcpAdapter.newMethod();
    }
}
