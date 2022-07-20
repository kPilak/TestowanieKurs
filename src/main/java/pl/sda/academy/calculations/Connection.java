package pl.sda.academy.calculations;

public class Connection {

    private boolean state;

    public void open() throws InterruptedException {
        Thread.sleep(500);
        state = true;
    }

    public void close() throws InterruptedException {
        Thread.sleep(500);
        state = false;
    }

    public boolean isOpened() {
        return state;
    }

    public boolean isClose() {
        return !isOpened();
    }

    public void refresh() {
        System.out.println("Refreshing the connection");
    }
}
