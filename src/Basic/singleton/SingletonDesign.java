package singleton;

// Eager Mode (Thread safe)
class EagerMode {
    private EagerMode() {
    }

    private static EagerMode eagerMode = new EagerMode();

    public static EagerMode getInstance() {
        return eagerMode;
    }
}

// Lazy Mode (Thread unsafe)
class LazyMode {
    private LazyMode() {
    }

    private static LazyMode lazyMode = null;

    public static LazyMode getInstance() {
        if (lazyMode == null) {
            lazyMode = new LazyMode();
        }
        return lazyMode;
    }
}

public class SingletonDesign {
    public static void main(String[] args) {
        System.out.println(EagerMode.getInstance());
        System.out.println(LazyMode.getInstance());
        System.out.println(LazyMode.getInstance());
    }
}