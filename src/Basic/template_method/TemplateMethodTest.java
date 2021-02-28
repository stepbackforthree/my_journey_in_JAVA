package template_method;

abstract class Template {
    public void runTime() {
        long start = System.currentTimeMillis();
        this.runCode();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public abstract void runCode();
}

class ComputeFull extends Template {
    @Override
    public void runCode() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}

class ComputeEven extends Template {
    @Override
    public void runCode() {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class TemplateMethodTest {
    public static void main(String[] args) {
        Template a = new ComputeFull();
        Template b = new ComputeEven();
        a.runTime();
        b.runTime();
    }
}
