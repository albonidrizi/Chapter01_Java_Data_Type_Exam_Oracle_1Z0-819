
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        int varStatic = MethodVariableScope.staticField;
       // int varInstance = MethodVariableScope.instanceVariable;

        MethodVariableScope methodVariableScope = new MethodVariableScope();
        int test2 = methodVariableScope.instanceVariable;
        int test3 = methodVariableScope.staticField;

        System.out.println(varStatic);
        System.out.println(test2);
        System.out.println(test3);
    }
}