package guru.qa;

public class Main {
    public static int getNum(){
        return 5;
    }
    public static int calculate(int num){
        int result = 0;
        for (int i = 0; i < num; i++){
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        int counter = getNum();
        for (int i = 0; i < counter; i++) {
            System.out.println("Hello, world!");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("...");
        }
        System.out.println("Entire amount is: "+calculate(getNum()));
        System.out.println("The end!");
    }
}