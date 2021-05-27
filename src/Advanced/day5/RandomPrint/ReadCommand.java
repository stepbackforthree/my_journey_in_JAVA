package Advanced.day5.RandomPrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCommand extends Thread {
    private RandomPrint randomPrint;

    public ReadCommand(RandomPrint randomPrint) {
        super();
        this.randomPrint = randomPrint;
    }

    @Override
    public void run() {
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        while (true) {
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            try {
                if (bufferedReader.readLine().contains("Q")) {
                    randomPrint.setFlag(false);
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            inputStreamReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
