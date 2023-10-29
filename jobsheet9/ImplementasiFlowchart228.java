public class ImplementasiFlowchart228{
    public static void main(String[] args) {
        int [] arrayBilangan = new int [10];
        for (int i=0; i<10; i++){
            arrayBilangan[i]= i+1;
        }
            for (int i=9; i>=0; i--) {
                System.out.println(arrayBilangan[i]+ " ");
            }
    }   
}
