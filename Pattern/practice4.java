package Pattern;

public class practice4 {
    public static void main(String args[]){
        int count=0;
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
