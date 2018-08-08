
public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.hi(100);
        //System.out.println("Hello");
    }
    //Constant
    private static final int NUMBER_TWO = 2;
    //Class variable
    public static int index =1;
    //Instance variable
    private int number = 3;
    
    private void hi(int number) {
        int index = 0;//Local variable
        System.out.println(index);
        System.out.println(this.index);
        System.out.println(Hello.index);
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(NUMBER_TWO);
    }

}