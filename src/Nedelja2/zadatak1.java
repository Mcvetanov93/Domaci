package Nedelja2;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        vracamanjeod3(x, y, z);
        System.out.println(vracamanjeod2(x, y));
        System.out.println(vracamanjeod3(x, y, z));
        System.out.println(ntistepen(x,y));
        System.out.println(zbirbrojevaNM(x,y));



    }

    public static int vracamanjeod2(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }

    }
    public static int vracamanjeod3(int x, int y, int z) {
        int minixy = vracamanjeod2(x, y);
        int minixz = vracamanjeod2(minixy, z);
        return minixz;

    }


    public static int zbirbrojevaNM (int x, int y){
        int zbirbr=0;
        for (int i=x; i<=y;i++){
            zbirbr=zbirbr+i;
        }
        return zbirbr;



    }







    public static int ntistepen(int x,int n) {


        int ntistepen=x;
        for (int i=1;i<=n;i++){
            System.out.println(i);
            ntistepen=ntistepen*x;

       }
        return ntistepen;

    }
}
