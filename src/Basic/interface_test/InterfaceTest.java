package interface_test;

class Printer implements USB, Bluetooth {

    @Override
    public void connect() {
        System.out.println("--------Printer connected--------");
    }

    @Override
    public void disConnect() {
        System.out.println("--------Printer disconnected--------");
    }

    @Override
    public void start() {
        System.out.println("--------Printer start working--------");
    }

    @Override
    public void close() {
        System.out.println("--------Printer stop working--------");
    }
}

class Mouse implements USB {

    @Override
    public void start() {
        System.out.println("--------Mouse start working--------");
    }

    @Override
    public void close() {
        System.out.println("--------Mouse stop working--------");
    }
}

class Computer {
    public void runUSB(USB usb) {
        usb.start();
        System.out.println("----------------");
        usb.close();
    }

    public void runBluetooth(Bluetooth bluetooth) {
        bluetooth.connect();
        System.out.println("----------------");
        bluetooth.disConnect();
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB mouse = new Mouse();
        computer.runUSB(mouse);

        Printer printer = new Printer();
        computer.runUSB(printer);
        computer.runBluetooth(printer);

    }
}
