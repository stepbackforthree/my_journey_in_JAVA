package Advanced.day7.ObjectCommunication;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                MyData userMyData = (MyData) objectInputStream.readObject();
                String order = userMyData.getFunc();
                if (order.equals("login")) {
                    User user = (User) userMyData.getData();
                    if (user.getName().equals("Tom") && user.getPassword().equals("123456")) {
                        userMyData.setFlag(true);
                        userMyData.setInfo("恭喜你登陆成功");

                    } else {
                        userMyData.setFlag(false);
                        userMyData.setInfo("用户名或密码错误，请重新输入");
                    }
                } else if (order.equals("signin")) {
                    // TODO
                }

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectOutputStream.writeObject(userMyData);
                objectOutputStream.flush();
                if (userMyData.getFlag()) {
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
