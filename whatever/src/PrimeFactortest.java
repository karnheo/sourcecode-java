
public class PrimeFactortest {

    public String of(int number) {
        String result = "";
        for (int x = 2; x <= number; x++) {            
            while(number%x==0) {
                result = result.concat(""+x);
                number = number/x;
            }
        }
        return result;
    }

}
