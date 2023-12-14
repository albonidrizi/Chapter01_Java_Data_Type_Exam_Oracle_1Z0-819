public class MethodVariableScope {


    public static int staticField = 100; // static field
    public int instanceVariable = 200;  // instance field



    public static void aStaticMethod(){
        staticField++;
        // instanceVariable++;
    }

    public void anInstanceMethod(){
        staticField++;
        instanceVariable++;

    }




    // varJashtKushteveDheLoops1,varJashtKushteveDheLoops2,
    // varBrendaIf,varBrendaIfIf,
    // varBrendaElse,varBrendaElseFor,
    // varBrendaWhiles
    public static void main(String[] args) {

        int varJashtKushteveDheLoops1 = 11;


        if(true){
            int varBrendaIf = 222;
            if(true){
                int varBrendaIfIf = varJashtKushteveDheLoops1;

            }

        }else{
            int varBrendaElse = 2;
            for(int i = 0; i < 10; i++){
                int varBrendaElseFor = varJashtKushteveDheLoops1;

            }

        }
        int varJashtKushteveDheLoops2 = 3;

        while(true){
            int varBrendaWhile = varJashtKushteveDheLoops2;

        }
    }

}
