public class WrapperMethods {
    public static void main(String[] args) {
        //valueof() method
        Integer num1=10;
        Double num2=20.5;
        System.out.println(Integer.valueOf(num1));
        System.out.println(Double.valueOf(num2));
        //parseInt() method
        String str1="30";
        String str2="40.5";
        System.out.println(Integer.parseInt(str1));
        System.out.println(Double.parseDouble(str2));
        //toString() method
        Integer num3=50;
        Double num4=60.5;
        System.out.println(num3.toString());
        System.out.println(num4.toString());
        //compareTo() method
        Integer num5=70;
        Integer num6=80;
        System.out.println(num5.compareTo(num6));
        //equals() method
        Integer num7=90;
        Integer num8=90;
        System.out.println(num7.equals(num8));
        //hashCode() method
        Integer num9=100;
        System.out.println(num9.hashCode());
        //intValue() method
        Integer num10=110;
        System.out.println(num10.intValue());
        //doubleValue() method
        Double num11=120.5;
        System.out.println(num11.doubleValue());
        //byteValue() method
        Integer num12=130;
        System.out.println(num12.byteValue());
        //shortValue() method
        Integer num13=140;
        System.out.println(num13.shortValue());
        //longValue() method
        Integer num14=150;
        System.out.println(num14.longValue());
        //floatValue() method
        Double num15=160.5;
        System.out.println(num15.floatValue());
        //booleanValue() method
        Boolean bool1=true;
        System.out.println(bool1.booleanValue());
        //charValue() method
        Character char1='A';
        System.out.println(char1.charValue());
        //compare() method
        Integer num16=170;
        Integer num17=180;
        System.out.println(Integer.compare(num16, num17));
        //max() method, min() method
        Integer num19=200;
        Integer num20=210;
        System.out.println(Integer.max(num19, num20));
        System.out.println(Integer.min(num19, num20));
        //sum() method
        Integer num21=220;
        Integer num22=230;
        System.out.println(Integer.sum(num21, num22));
        //Character methods
        Character char2='B';
        System.out.println(Character.isDigit(char2));
        System.out.println(Character.isLetter(char2));
        System.out.println(Character.isWhitespace(char2));
        //Boolean methods
        Boolean bool2=false;
        System.out.println(Boolean.logicalAnd(bool1, bool2));
        System.out.println(Boolean.logicalOr(bool1, bool2));
    }
}
