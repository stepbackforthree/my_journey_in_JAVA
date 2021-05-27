package Advanced.day5.RandomPrint;

public class RandomPrintTest {
    public static void main(String[] args) {
        RandomPrint randomPrint = new RandomPrint();
        randomPrint.start();
        ReadCommand readCommand = new ReadCommand(randomPrint);
        readCommand.start();
    }
}
