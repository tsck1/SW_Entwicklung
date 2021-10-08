import javax.xml.transform.Result;

public class ArithmetischeOperatoren {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a + " b =" + b);
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        int h = 2;
        System.out.println(" h = " +h);

        double j =  2.0;
        System.out.println(" j = " +j);

        int multi = 3 * 3;
        System.out.println(multi);

        boolean eaven = 2 % 2 == 0;
        System.out.println(eaven);


        printResult(2 + 3);
        int c = 2 + 4;
        printResult(c);

        int result = add(7, 5);
        printResult(result);
        printResult(add(10, 11));
        schreibHallo();
        int ten = returnTen();
        System.out.println(ten);


    }

    public static void printResult(int result) {
        System.out.println(result);
    }
    public static int add(int c, int d){
        return c + d;
    }
    public static void schreibHallo(){
        System.out.println("Hallo");
    }

    public static int returnTen() {
        return 10;
    }

}
