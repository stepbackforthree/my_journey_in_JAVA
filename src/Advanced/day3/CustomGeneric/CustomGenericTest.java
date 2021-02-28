package Advanced.day3.CustomGeneric;

import org.junit.jupiter.api.Test;

public class CustomGenericTest {
    @Test
    public void customGenericTest() {
        MyData<Book, String> myData = new MyData<>();

        Book book = new Book("水浒传", 15.5, "施耐庵");
        String string = new String("aaa");
        myData.setData(book);
        myData.setData1(string);

        MyData<Integer, String> myData1 = new MyData<>();
        Integer integer = 5;
        String string1 = new String("bbb");
        myData1.setData(integer);
        myData1.setData1(string1);
    }
}
