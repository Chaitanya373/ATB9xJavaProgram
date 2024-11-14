package Oct.ex_101024;

public class Lab6 {
    /* Examples for
        Integer Literals
        Floating-Point Literals
        Character Literals
        String Literals
        Boolean Literals
        Null Literal*/
    public static void main(String[] args) {
        // Integer Literals
        int decimal_number = 10;
        long long_decimal_number = 1000000666L;

        // Floating-Point Literals
        float float_number = 15.22F;
        double double_number = 15.336;

        //Character Literals
        char a = 'q';
        char new_line = '\n';
        char tab_space = '\t';
        char back_space = '\b';

        //String Literals
        String str = "Testing";

        //boolean Literals
        boolean bool = true;

        // Null literals
        String null_val = null;

        System.out.println(decimal_number);
        System.out.println(long_decimal_number);
        System.out.println(float_number);
        System.out.println(double_number);
        System.out.println(str + new_line);
        System.out.println(str + tab_space + str);
        System.out.println(str + back_space);
        System.out.println(str);
        System.out.println(a);
        System.out.println(bool);
        System.out.println(null_val);



    }
}
