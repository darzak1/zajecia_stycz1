import java.util.Random;

public class JackPot {
    public static void main(String[] args) {

        int i;
        Random random = new Random();

        for (i=0; i < 100; i++) {

            {random.nextInt(10);
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int z = random.nextInt(10);


            System.out.println("Wylosowane liczby to: " + x + ", " + y + ", " + z);


            if (x == 7 && y == 7 && z == 7) {
                System.out.println(x + y + z + "Gratulacje główna wygrana!!!!!!!!!");
            }
            }
        }


    }
}
