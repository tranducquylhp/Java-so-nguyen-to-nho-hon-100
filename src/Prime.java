public class Prime {
    public static void main(String[] args) {
        int number = 2;
        while (number <= 100) {
            boolean check = false;
            for (int i = 2; i <= Math.round(Math.sqrt(number)); i++) {
                check = number % i == 0;
                if (check) {
                    break;
                }
            }
            if (!check) {
                System.out.println(number);
            }
            number++;
        }
    }
}
