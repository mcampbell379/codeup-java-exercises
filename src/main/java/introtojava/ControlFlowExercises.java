package introtojava;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        int itwos = 0;
        do {
            itwos += 2;
            System.out.printf("%n%3d", itwos);
        }while(itwos < 100);
    }
}
