public class Playground {

    public String myName = "John";
    public String myCar = "Ferrari";

    public void myMethod() {
        String myCar = "Myvi"; //Local Variable
        System.out.println(myCar);
    }

    public void printVariable() {
        String varString = "Text";
        int varInt = 29;
        double varDouble = 20.01;
        boolean varFlag = true;
        char varChar = 'H';

        System.out.println(varString);
        System.out.println(varInt*varDouble);
        System.out.println(varFlag);
        System.out.println(varChar);
    }

    public void printFlag(boolean flag, int number) {

        //input
        //!input
        //input == true
        if(flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }


        if(number==30 && flag) {
            System.out.println("Number is 30 AND flag is true");
        }

        if(number==10 && !flag) {
            System.out.println("Number is 10 AND flag is false");
        }

        if(number==30 || !flag) {
            System.out.println("Number is 30 OR flag is false");
        }
    }

    public void calculate(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(b/a);
        System.out.println(a*b);
    }
}
