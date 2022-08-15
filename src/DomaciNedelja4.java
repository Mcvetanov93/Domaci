
import java.util.Arrays;
public class DomaciNedelja4 {

        public static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //Naziv funkcije,deklarise da fukncija nista ne treba da vraca zbog void i definise da uzima neki string vallue (int [] arr)
        public static void selectionSort(int[] arr)
        {
// outer loop ,ponavlja loop tako da funkcija prodje od prvog do poslednjeg integera u Stringu
            for (int i = 0; i < arr.length - 1; i++)
            {
// dodeljuje min-u vrednost i, i definise pocetak loop-a jednim karakterom ispred i-a, da funkcija ne proverava prvi int sa samim sobom
                int min = i;
                for (int j = i + 1; j < arr.length; j++)
                {
// funkcija koja svaki index j ako je manji od indexa i,prethodno definisan da bude isti kao int min, zameni i postavi kao novu vrednost int min.
                    if (arr[j] < arr[min]) {
                        min = j; // Додати коментар
                    }
                }
// ovde se redefinisu inputi koji ulaze u metod



                swap(arr, min, i);
            }
        }
        public static void main(String[] args)
        {
            int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
            selectionSort(arr);
// Ispisuje se sortiran string pomocu funkcije selection sort
            System.out.println(Arrays.toString(arr));
        }
    }









