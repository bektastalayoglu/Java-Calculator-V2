
public class Calculator {

    public boolean isPrime(int number){

        boolean prime = true;

        if(number <= 1){
            prime = false;
        } else if (number > 1) {
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public int fibonacciNumber(int N){
        if(N <= 0){
            return 0;
        }else if(N == 1){
            return 1;
        }else{
            int num[] = new int[N];
            num[0] = 1;
            num[1] = 1;

            for (int i = 2; i < N ; i++) {
                num[i] = num[i-1] + num[i-2];
            }

            return num[N - 1];

        }
    }

    public boolean armstrongNumbers(int number, int power){
        int tempNum = number;
        int digitNum;
        int digitPow;
        int sum = 0;

        while (tempNum != 0){
            digitNum = tempNum % 10;
            digitPow = (int) Math.pow(digitNum,power);
            sum += digitPow;
            tempNum = tempNum / 10;
        }
        if(number == 0 && power == 0){
            return false;
        }else if(sum == number){
            return true;
        }else{
            return false;
        }
    }
    public int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number*factorial(number-1);
    }

    public int numberReversal(int number){
        int newNum = 0;
        while (number != 0) {
            newNum = (newNum * 10) + (number % 10);
            number = number / 10;
        }
        return newNum;
    }

    public int[] productMaximiser(int[] a, int[] b) {
        int largestProduct = Integer.MIN_VALUE;
        int[] res = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int product = a[i] * b[j];
                if (product > largestProduct) {
                    largestProduct = product;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int[] a1 = {1, 2, 6, 4};
        int[] a2 = {5, 6, 7, 8};
        int[] x = cal.productMaximiser(a1, a2);

        System.out.println(x[0]);
        System.out.println(x[1]);

    }
}
