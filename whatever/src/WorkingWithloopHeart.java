
public class WorkingWithloopHeart {
    public static void main(String[] args) {
        int start = 9;
        //line1 
        System.out.print(" **   ** ");
        newLine();
        //line2
        for (int t = 0; t < start; t++) {
            if(t==start/2) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        newLine();
        for (int i = 0; i < 5; i++) {
            genSpace(i);
            genStar(start);
               newLine();
               start-=2; 
        }
      
      
    }

    private static void genSpace(int i) {
        for(int j=0; j<i; j++) {
            System.out.print(" ");
        }
    }

    private static void genStar(int start) {
        for(int x = 0;x<start; x++) {
            System.out.print("*");
        }
    }

    private static void newLine() {
        System.out.println();
    }
}
