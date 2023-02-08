package introtojava;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }

//        int itwos = 0;
//        do {
//            itwos += 2;
//            System.out.printf("%n%3d", itwos);
//        }while(itwos < 100);
        for (int j = 0; j <= 100; j+=2) {
            System.out.printf("%n%3d", j);
        }
    }
}
