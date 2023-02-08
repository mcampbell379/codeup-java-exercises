package introtojava;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        for (int i = 0; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        int itwos = 0;
//        do {
//            itwos += 2;
//            System.out.printf("%n%3d", itwos);
//        }while(itwos < 100);
//        for (int j = 0; j <= 100; j+=2) {
//            System.out.printf("%n%3d", j);
//        }

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }
}
