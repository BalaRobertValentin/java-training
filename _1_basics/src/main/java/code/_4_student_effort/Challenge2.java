package code._4_student_effort;

public class Challenge2 {
    static void compute(int a)
    {
        int n = 0, ok = 0;
        int m = a;
        int[] A = new int[10];

        if ( a % 3 == 0) {
            System.out.print("Foo");
            ok = 1;
        }
        if ( a % 5 == 0) {
            System.out.print("Bar");
            ok = 1;
        }
        if ( a % 7 == 0) {
            System.out.print("Qix");
            ok = 1;
        }
        while(a > 0){
            n++;
            A[n] = a % 10;
            a = a / 10;
        }
        for (int i = n; i > 0; i--)
        {

            if (A[i] == 3) {
                System.out.print("Foo");
                ok = 1;
            }
            if (A[i] == 5) {
                System.out.print("Bar");
                ok = 1;
            }
            if (A[i] == 7) {
                System.out.print("Qix");
                ok = 1;
            }

        }
        if ( ok == 0 )
            System.out.print(m);

    }
    static void compute2(int a)
    {
        int n = 0, ok = 0;
        int[] A = new int[10];
        if ( a % 3 == 0 || a % 5 == 0 || a % 7 == 0)
            ok = 1;
        if ( a % 3 == 0)
            System.out.print("Foo");
        if ( a % 5 == 0)
            System.out.print("Bar");
        if ( a % 7 == 0)
            System.out.print("Qix");
        while(a > 0){
            n++;
            A[n] = a % 10;
            if ( A[n] == 3 || A[n] == 5 || A[n] == 7)
            {
                ok = 1;
            }
            a = a / 10;
        }
        for (int i = n; i > 0; i--)
        {
            if( ok == 1) {

                if (A[i] == 3)
                    System.out.print("Foo");
                if (A[i] == 5)
                    System.out.print("Bar");
                if (A[i] == 7)
                    System.out.print("Qix");
                if (A[i] == 0)
                    System.out.print("*");
            }
            else
            {

                if (A[i] == 0)
                    System.out.print("*");
                else
                    System.out.print(A[i]);
            }

        }
    }
}
