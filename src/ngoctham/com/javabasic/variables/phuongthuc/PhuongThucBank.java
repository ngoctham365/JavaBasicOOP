package ngoctham.com.javabasic.variables.phuongthuc;

import ngoctham.com.javabasic.variables.kieudulieu.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.bankInfo();
        double tongTien = (Bank.getInterestRate() * 1000000) / 100;
        System.out.println("Tong tien lai: " +tongTien);
    }
}