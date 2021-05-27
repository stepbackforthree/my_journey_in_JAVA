package Advanced.day7.ObjectCommunication;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
        Socket socket = new Socket("localhost", 8800);
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入用户名：");
                String userName = scanner.next();
                System.out.println("请输入密码：");
                String password = scanner.next();
                User user = new User(userName, password);
                MyData<User> userMyData = new MyData<>();
                userMyData.setData(user);
                userMyData.setFunc("login");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(userMyData);
                objectOutputStream.flush();

                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                MyData<User> returnUserMyData = (MyData<User>) objectInputStream.readObject();
                System.out.println(returnUserMyData.getInfo());
                if (returnUserMyData.getFlag()) {
                    objectInputStream.close();
                    objectOutputStream.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
