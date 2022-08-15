package Test;

public class zadatak4 {
    public static void main(String[] args) {
        int [] x={10,13,14,16,25,30,32};
        System.out.println(nizDeljiv(x,3));

    }
    public static int nizDeljiv(int [] x,int y ){
        int brojdeljivih=0;
        for (int i=0;i<x.length;i++){
            if (x[i]%y==0){
                brojdeljivih++;
            }
        }
        return brojdeljivih;

    }
}
