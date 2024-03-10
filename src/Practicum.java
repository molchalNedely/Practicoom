private static void sieveOfEratosthenes(int n) {
    boolean[] isPrime = new boolean[n+1];
    for (int i = 1; i <= n; i++) {
        isPrime[i] = true;
    }

    // 1 — не простое и не составное число, игнорируем
    isPrime[1]=false;

    for (int number = 2; number <= n; number++) {
        if (isPrime[number]) {
            System.out.println(number + " - простое число");
            int numberMultiple = number * 2;
            while (numberMultiple <= n) {
                isPrime[numberMultiple] = false;
                numberMultiple += number;
            }
        } else {
            System.out.println(number + " - составное число");
        }
    }
} 1231312312312321312312323123131312313131313131313123123123123131312313131313123131313131313