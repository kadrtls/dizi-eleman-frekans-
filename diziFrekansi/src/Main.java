import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int[] array={11,2,5,10,7,11,10,2,9,7,4};
        Arrays.sort(array);
        int sayac=1;
        for (int i=1;i<array.length;i++){
            if (array[i]==array[i-1]){
                sayac++;
            }else {
                System.out.println(array[i-1]+" sayısı "+ sayac+"kere tekar etti");
                sayac=1;
            }
        }

    }
}