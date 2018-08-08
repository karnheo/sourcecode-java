
public class Sort {

    public int[] of(int[] input) {
        if(input.length >1) {
            for(int i=0;i<input.length-1;i++){
                    for(int j=0;j<input.length-1;j++){
                        if(input[j]>input[j+1]){
                            int temp=input[j+1];
                            input[j+1]=input[j];
                            input[j]=temp;
                        }
                    }
                }
            
            
        }
        return input;
    }

}
