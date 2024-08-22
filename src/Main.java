public class Main {
    public static void main(String[] args) {



        //Task 1
        System.out.println("Task 1");
        int[] payments = new int[5];
        payments[0] = 60_000;
        payments[1] = 64_000;
        payments[2] = 72_000;
        payments[3] = 80_000;
        payments[4] = 88_000;
        int sum = 0;
        for (int i = 0;  i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println("Task 2");

        int[] paymentsMonth = {60_000, 64_000, 72_000, 80_000, 88_000};
        int min = paymentsMonth[0];
        int max = paymentsMonth[0];
        for (int i = 0; i < paymentsMonth.length; i++) {
            if (paymentsMonth[i] < min){
                min = paymentsMonth[i];
            }
            if (paymentsMonth[i] > max){
                max = paymentsMonth[i];
            }
        }
        int minWeek = min / 4;
        int maxWeek = max / 4;
        System.out.println("Минимальная сумма трат за неделю составила " + minWeek  + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxWeek + " рублей");
        //Task 3
        System.out.println("Task 3");

        int[] payments2 = new int[5];
        payments2[0] = 60_000;
        payments2[1] = 64_000;
        payments2[2] = 72_000;
        payments2[3] = 80_000;
        payments2[4] = 88_000;
        int sum2 = 0;
        for (int i = 0;  i < payments.length; i++) {
            sum2 += payments[i];
        }
        double average = (double) sum2 / payments2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;

            char tempory = reverseFullName [leftIndex];
            reverseFullName [leftIndex] = reverseFullName [rightIndex];
            reverseFullName [rightIndex] = tempory;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}