import java.util.Scanner;
public class ff{

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String stop;
        int n;

        while(true){
            System.out.println("Unsestie bilo koji broj sa tastature");
            n= sc.nextInt();
            System.out.println("Unesite stop ako zelite da prekinete");
            stop = sc.next();
            if(stop == "stop"){
                System.out.println("Stopirali ste program");
                break;
            }
            else{
                continue;
            }
        }

    }
}