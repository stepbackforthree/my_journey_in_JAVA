package Advanced.day7.ObjectCommunication;

import java.io.Serializable;

public class MyData<T> implements Serializable {
    private T data; // 数据类传递的数据，比如在登录验证的时候这个数据就是User
    private Boolean flag; // 客户端请求功能执行成败的标志
    private String info; // 客户端请求功能执行后的文字描述
    private String func; // 客户端请求服务器时的功能，如果是登录，order保存"login"，服务器通过这个属性就可以知道客户端请求的是登录验证

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }
}
