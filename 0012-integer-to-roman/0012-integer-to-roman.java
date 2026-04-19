class Solution {
  static String[] c = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
    static String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    static String[] hundreds = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    static String[] thousands = new String[]{"","M","MM","MMM"};
    public static String intToRoman(int num) {
        return new StringBuilder().append(thousands[num/1000]).append(hundreds[(num%1000)/100]).append(tens[(num%100)/10]).append(c[num%10]).toString();

    }
}