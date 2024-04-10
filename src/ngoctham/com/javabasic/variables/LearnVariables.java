package ngoctham.com.javabasic.variables;

public class LearnVariables {
    static int age = 29; //bien toan cuc

    public static void sayHello(){
        int n = 10; //bien cuc bo
        System.out.println("Gia tri cua n la: " +n);
    }

    public static void main(String[] args) {
        //String Fullname = "ngoc tham";
        System.out.println(age);

        //Cách 1
        LearnVariables abc = new LearnVariables();
        abc.sayHello();

        //Cách 2
        sayHello();
    }
}
