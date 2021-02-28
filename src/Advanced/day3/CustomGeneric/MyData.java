package Advanced.day3.CustomGeneric;

public class MyData<T, U> {
    private T Data;
    private U Data1;
    private Integer order;
    private Boolean flag;

    public MyData(T data, U data1) {
        Data = data;
        Data1 = data1;
    }

    public MyData() {

    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public U getData1() {
        return Data1;
    }

    public void setData1(U data1) {
        Data1 = data1;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
