
public class WorkingWithArray {
    public static void main(String[] args) {
        int[] number1 = new int[5];
        number1[0]=9;
        number1[1]=number1[0];
        for (int i : number1) {
            System.out.println(i);
        }
    }
}
