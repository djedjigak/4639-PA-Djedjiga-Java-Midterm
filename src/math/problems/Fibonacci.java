package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */




        public static void main(String[] args) {

            int i = 1, n = 40, t1 = 0, t2 = 1;
            System.out.print("First " + n + " terms: ");

            while (i <= n)
            {
                System.out.print(t1 + " + ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;

                i++;
            }
        }





    }






