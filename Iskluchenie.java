
package iskluchenie;
import java.io.IOException;

public class Iskluchenie {
   
    public static void main(String[] args) {
        
        try {
            demoException(3);
        } catch(ArithmeticException ex) {
            System.out.println("Arithmetic exception: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("No Object");
        } catch (IOException ex) {
            System.out.println("I/O exception: " + ex.getMessage());;
        } catch (MyIskluchenie ex) {
            
            System.out.println("Exception value = " + ex.value);
        }
        System.out.println("End of main");
    }

    private static void demoException(int n) throws IOException, MyIskluchenie {
        switch(n) {
            case 0: int a = 1/n;
                System.out.println("a = " + a);
                break;
            case 1: Object obj = null;
                    obj.hashCode();
                    break;
            case 2: throw new IOException("Smth is bad");
            case 3: throw new MyIskluchenie(1024, "My esception");
            default: System.out.println("All is well");
        }
        
    }
    
}
class MyIskluchenie extends Exception {
    
    final int value;

    public MyIskluchenie(int value, String message) {
        super(message);
        this.value = value;
    }

    

    
    
}
