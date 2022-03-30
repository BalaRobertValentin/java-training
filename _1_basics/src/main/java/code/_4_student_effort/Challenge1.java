package code._4_student_effort;

public class Challenge1 {

    public static void run() {
        for (int i = 1; i <= 100; i++ ){

            if ( i % 7 == 0){
                System.out.println("Rizz");
            }
            else if ( i % 11 == 0){
                System.out.println("Jazz");
            }
            else if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBUzz");
            }
            else if ( i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if ( i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
