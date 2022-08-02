import java.util.Scanner;

public class functionsHW_Solution {
    private static void printHelloWorld(){
        System.out.println("hello world");
    }
    private static void print1to100intwhile(){
        int x = 100;
        int y = 1;
        while (y <= x){
            System.out.println(y);
            y++;
        }
        for(int i = x; i > 0; i--){
            System.out.println(i);
        }
    }
    private static void numEvenOrOdd(int randomNum , boolean checker){
        if(checker){
            System.out.println("the number " + randomNum + " is even");
        }
        else{
            System.out.println("the number " + randomNum + " is odd");
        }

    }
    private static void numEvenOrOdd2(int userInput , boolean checker){
        if(checker){
            System.out.println("the number " + userInput + " is even");
        }
        else{
            System.out.println("the number " + userInput + " is odd");
        }
    }
    private static void numEvenorOdd3(int x) {
        if (x % 2 == 0) {
            System.out.println("the number " + x + " is even");
        } else {
            System.out.println("the number " + x + " is odd");
        }

    }
    private static void intx(){

        int x = -50;
        System.out.println(x);
    }
    private static void A(){
        System.out.println("hello");
        B();
    }
    private static void B(){
        System.out.println("world");
        A();
    }
    public static void main(String[] args) {
//        printHelloWorld();
//        print1to100intwhile();
//        Scanner s = new Scanner(System.in);
//        System.out.println("please enter int");
//        int userInput = s.nextInt();
//        int minimum = -10000;
//        int maximum = 10000;
//        int randomNum = randomNum = minimum + (int)(Math.random() * maximum);
//        boolean checker = (userInput%2==0);
//        numEvenOrOdd(randomNum , checker);
//        numEvenOrOdd2(userInput ,checker);
//        numEvenorOdd3(3);
//        numEvenorOdd3(54);
//        int x = 10;
//        System.out.println(x);
//        intx();


        //Yoni please don't call A
        //A();
    }
}
