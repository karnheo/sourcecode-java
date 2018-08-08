
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "karn";
        int age = 22;
        String obj = name+"-+-"+age;//1
        StringBuffer buffer = new StringBuffer();//2
        buffer.append(name).append("======").append(age);
        
        StringBuilder builder = new StringBuilder();//3
        builder.append(name).append("===+++===").append(age);
        
        String result = String .format("%s==+++%d", name, age);
        System.out.println(obj);
        System.out.println(result);
        System.out.println(buffer.toString());
        System.out.println(builder.toString());
       
        
        String nickname ="karneiei";
        while (nickname.length()>0) {
            System.out.println(nickname.substring(0, 1));
            nickname = nickname.substring(1);
        }
        
        for (int i = 0; i < nickname.length(); i++) {
            
        }
    }

}
