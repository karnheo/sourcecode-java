
public class WorkshopStringEqual {

    public static void main(String[] args) {
        String m1 = "M1";
        String n = "Chalermchat";
        String n2 = "Chalermchat";
        if ("M1".equals(m1)) {//ค่าคงที่ขึ้นก่อน
        }
        
        if (n.equals(n2)) {
            System.out.println("==");   
        }else {
            System.out.println("!=");
        }
        
        if (n==n2) {
            System.out.println("==");   
        }else {
            System.out.println("!=");
        }

    }
}
