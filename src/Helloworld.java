public class Helloworld {
    public static void main(String[] args) {

        Playground playObj = new Playground();
        Playground playObjCopy = new Playground();

        playObj.myName = "Ali";

        System.out.println(playObj.myName);
        System.out.println(playObjCopy.myName);
        System.out.println(playObj.myCar);

        playObj.myMethod();
        playObj.printVariable();
        playObj.printFlag(true, 30);
        playObj.printFlag(false, 10);
        playObj.calculate(5,10);
    }
}
