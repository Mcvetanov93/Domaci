package Nedelja3;

import java.util.*;

public class zadatak6 {
    public static void main(String[] args) {
        String x="Hello";
        Stack <String> y=new Stack<String>();
        for (int i=x.length()-1;i>=0;i--){
            y.push(String.valueOf(x.charAt(i)));
        }
        System.out.println(y);
    }
}
