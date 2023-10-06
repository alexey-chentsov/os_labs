import java.util.Optional;
import os.lab1.Computation;

public class Main {
    public static void main(String[] args) { 
	System.out.println("compfunc(0): " + Computation.compfunc(0));

	System.out.print("compfunc(1) ");
	var result = Computation.compfunc(1);
	while (result.isEmpty()) {
	    System.out.print("."); 
	    System.out.flush();
	    result = Computation.compfunc(1);
	}
	System.out.println("\rcompfunc(1): " + result);
    }
}
