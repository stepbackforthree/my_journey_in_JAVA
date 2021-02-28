package EcmDef;

class EcDefException extends RuntimeException {
    public EcDefException() {}

    public EcDefException(String message) {
        super(message);
    }
}

public class EcmDef {
    public static int ecm(int a, int b)  throws ArithmeticException{
        if (a < 0 || b < 0) {
            throw new EcDefException("Native number cannot be divided");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(ecm(a, b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lack of arguments");
        } catch (NumberFormatException e) {
            System.out.println("Format cannot match");
        } catch (ArithmeticException e) {
            System.out.println("0 cannot be divided");
        } catch (EcDefException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Please try again");
        }
    }
}
