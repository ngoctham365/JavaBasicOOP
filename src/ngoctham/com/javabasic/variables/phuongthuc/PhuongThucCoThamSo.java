package ngoctham.com.javabasic.variables.phuongthuc;

public class PhuongThucCoThamSo {
    static float INTEREST_RATE = 7.5F;

    public static double tinhLai(long soTienGui) {
        return ((soTienGui * INTEREST_RATE) / 100);
    }

    public static int cong2So(int number1, int number2) {
        return number1 + number2;
    }


    public static void main(String[] args) {
        System.out.println("Tien lai sau 12 thang: " + tinhLai(700000) + "vnd");
        System.out.println("Cong 2 so nguyen: " + cong2So(10, 20));
    }
}
