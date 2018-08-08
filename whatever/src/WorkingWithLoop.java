
public class WorkingWithLoop {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 11; i+=2) {            
            sum+=i;
            System.out.println("----"+i);
            System.out.println(sum);
        }
        int i =0;
        while(i<5) {
            System.out.println("===="+i);
            i++;
        }
        i=0;
        do {
            i++;
            System.out.println("...."+i);
        }while(i<5);
    }
}
