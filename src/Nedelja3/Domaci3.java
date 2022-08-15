package Nedelja3;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Domaci3 {
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        System.out.println(radnomBroj(alist));


    }

    public static String radnomBroj(ArrayList<String> x){
        int random = (int)(Math.random()*((x.size()-1)-0+1)+0);
        String rezultat=x.get(random);

    return rezultat;
    }
}
