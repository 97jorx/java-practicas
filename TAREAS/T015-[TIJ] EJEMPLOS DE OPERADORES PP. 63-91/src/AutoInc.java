
//: operators/AutoInc.java
// Demonstrates the ++ and -- operators.

public class AutoInc {
public static void main(String[] args) {
int i = 1;
System.out.println("i : " + i);
System.out.println("++i : " + ++i); // Pre-increment // PRIMERO INCREMENTA Y LUEGO ACCEDE AL VALOR
System.out.println("i++ : " + i++); // Post-increment // PRIMERO SE ACCEDE AL VALOR Y LUEGO SE INCREMENTA
System.out.println("i : " + i);
System.out.println("--i : " + --i); // Pre-decrement
System.out.println("i-- : " + i--); // Post-decrement
System.out.println("i : " + i);
}
} /* Output:
i : 1
++i : 2
i++ : 2
i : 3
--i : 2
i-- : 2
i : 1
*///:~�