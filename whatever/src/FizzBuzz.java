
public class FizzBuzz {

    public String readyOne(int number) {
        String result = "";
        if(divide3and5(number)) {
            result="FizzBuzz";
        }
        else if(divide5(number)) {
            result="Buzz";
        }
        else if(divide3(number)) {
            result="Fizz";
        }else{
        result = String.valueOf(number);
        }
        return result;
    }

    private boolean divide3(int number) {
        return number%3==0;
    }

    private boolean divide5(int number) {
        return number%5==0;
    }

    private boolean divide3and5(int number) {
        return divide3(number) && divide5(number);
    }

}
