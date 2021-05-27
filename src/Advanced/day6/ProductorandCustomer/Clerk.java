package Advanced.day6.ProductorandCustomer;

public class Clerk {
    private Integer product;

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Clerk(Integer product) {
        this.product = product;
    }

    public synchronized void save() {
        // if (product >= 20) { // 只有一个生产线程的时候可以使用if判断
        while (product >= 20) { // 有多个生产线程的时候需要使用while
            System.out.println("现在商品数量已达上限，暂停生产");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("生产线程生产了一个商品，此时商品数量是：" + getProduct());
        // this.notify(); // 唤醒另一个线程
        this.notifyAll(); // 唤醒所有线程
    }

    public synchronized void consume() {
        // if (product <= 0) { // 只有一个消费线程的时候可以使用if判断
        while (product <= 0) { // 有多个消费线程的时候需要使用while
            System.out.println("商品已经消费空，暂停消费");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("消费线程消费了一个商品，此时商品数量是：" + getProduct());
        // this.notify(); // 唤醒另一个线程
        this.notifyAll(); // 唤醒所有线程
    }
}
