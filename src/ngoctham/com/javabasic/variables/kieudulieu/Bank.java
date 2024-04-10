package ngoctham.com.javabasic.variables.kieudulieu;

public class Bank {
    static int number = 10000;
    static String bankName = "Vietinbank";
    static float number2 = 19999.6F;
    static String PHONE = "090902123";
    static float INTEREST_RATE = 7.3F;

    public static void bankInfo(){
        System.out.println("Bank name: " + bankName);
        System.out.println("Phone: " + PHONE);
    }
    public static float getInterestRate(){
        return INTEREST_RATE;
    }
}
