package Nedelja3;

public class DomaciNedelja3 {
    public static void main(String[] args) {
        String x = "{{(][)}{";
        System.out.println(zagrade(x));

    }
//    [{}({})] - true
//            [{})] - false
//    {()[({})]} - true
//    {{(][)}} - false
//            ([{)]} - false

    public static boolean zagrade(String x) {
        int brojac = 0;
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        int brojac5 = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(') {
                brojac++;
            } else if (x.charAt(i) == ')') {
                brojac1++;
            } else if (brojac1 > brojac) {
                return false;
            } else if (x.charAt(i) == '{') {
                brojac2++;
            } else if (x.charAt(i) == '}') {
                brojac3++;
            }
            else if (x.charAt(i) == '[') {
                brojac4++;
            } else if (x.charAt(i) == ']') {
                brojac5++;
            }

        }


        if (x.charAt(0) == ')' || x.charAt(0) == '}' || x.charAt(0) == ']') {
            return false;
        } else if (x.charAt((x.length() - 1)) == '(' && x.charAt((x.length() - 1)) == '{' && x.charAt((x.length() - 1)) == '[') {
            return false;
        }
        if (brojac1 != brojac && brojac3 != brojac2 && brojac5 != brojac4) {
            return false;
        }
        return true;
    }
}
