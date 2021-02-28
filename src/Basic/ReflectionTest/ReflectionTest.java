package ReflectionTest;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name();
}

class Person {
    private String name;
}

class Animal {
    private String animalName;
    public int animalAge;

    private void animalInfo() {
        System.out.println("private animalInfo");
    }

    public void animalSay() {
        System.out.println("public animalSay");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                '}';
    }
}

@MyAnnotation(name = "ReflectionTest.Dog")
class Dog extends Animal {
    private String dogName;
    @MyAnnotation(name = "3")
    public int dogAge;

    public Dog() {
        System.out.println("Dog's Constructor");
    }

    private Dog(int dogAge) {
        System.out.println("Dog's Private Constructor" + dogAge);
    }

    private void dogInfo() {
        System.out.println("private dogInfo");
    }

    public int dogSay(int dogAge) {
        System.out.println("public dogSay");
        return dogAge;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}

public class ReflectionTest {
    @Test
    public void test() throws ClassNotFoundException {
        Class clazz = Person.class;

        Class clazz1 = new Person().getClass();

        Class clazz2 = Class.forName("ReflectionTest.Person");

        ClassLoader c = this.getClass().getClassLoader();
        Class clazz3 = c.loadClass("ReflectionTest.Person");

        System.out.println(clazz == clazz1 && clazz2 == clazz3 && clazz == clazz3);
    }

    @Test
    public void testField() {
        Class clazz = Dog.class;
        Field[] fields = clazz.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("-------------------------------");

        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
    }

    @Test
    public void testMethod() throws NoSuchMethodException {
        Class clazz = new Dog().getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-------------------------------");

        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
    }

    @Test
    public void testAssignField() throws NoSuchFieldException, IllegalAccessException {
        Dog dog = new Dog();
        Class clazz = Dog.class;
        Field field = clazz.getField("dogAge");
        field.setInt(dog, 3);
        Field field1 = clazz.getDeclaredField("dogName");
        field1.setAccessible(true); // dogName is private
        field1.set(dog, "papi");
        System.out.println(dog.toString());
    }

    @Test
    public void testMethodInvoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog();
        Class clazz = Dog.class;
        Method method = clazz.getMethod("dogSay", int.class);
        method.invoke(dog, 3);

        System.out.println("-------------------------------");

        Method method1 = clazz.getDeclaredMethod("dogInfo");
        method1.setAccessible(true); // dogInfo is private
        method1.invoke(dog);
    }

    @Test
    public void testSuperClass() {
        Class clazz = Dog.class;
        Class superClazz = clazz.getSuperclass();
    }

    @Test
    public void testAnnotation() throws NoSuchFieldException { // If want to get annotation through reflection, its retention must be RUNTIME
        Class clazz = Dog.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("-------------------------------");

        Field field = clazz.getDeclaredField("dogAge");
        Annotation[] annotations1 = field.getAnnotations();
        for (Annotation annotation : annotations1) {
            System.out.println(annotation);
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println(myAnnotation.name()); // Get the value of this annotation
        }
    }

    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Dog.class;
        Constructor constructor = clazz.getConstructor();
        constructor.newInstance();

        System.out.println("-------------------------------");

        Constructor constructor1 = clazz.getDeclaredConstructor(int.class);
        constructor1.setAccessible(true);
        constructor1.newInstance(3);

    }
}
