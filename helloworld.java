import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("Введите певрое число");
        int a = lol.nextInt();
        Scanner lol2 = new Scanner(System.in);
        System.out.println("Введите второе число число");
        int b = lol2.nextInt();
        lol.close();
        lol2.close();
        if (lol.hasNextInt() && lol2.hasNextInt()) {
            try {
                int c = a / b;
                System.out.println(c);

            } catch (Exception e) {
                System.out.println("Не вычислить");
            }    
        }
       
    }
    
}