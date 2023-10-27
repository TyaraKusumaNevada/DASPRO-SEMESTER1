import java.util.Scanner;
public class BubbleSortExample28 {
    public static void main(String[] args) {
        int [] intData = {34,18,87,72,32,54,43};
        int temp =0;
        for (int i=0; i<intData.length; i++){
            for (int j=1; j<intData.length-i; j++){
                if (intData[j-1] < intData[j]) {
<<<<<<< HEAD
                   
=======
                    
>>>>>>> c6922616e7736336003ca3f50fe41f1d2b810d4f
                    temp =intData[j];
                    intData[j]=intData[j-1];
                    intData[j-1]=temp;
                    
                }
            }
        }
        System.out.println("Hasil pengurutan: ");
        for (int i=0; i<intData.length; i++){
            System.out.println(intData[i]);
        }
    }
}
