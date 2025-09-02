import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // voting age
        int[] ages = { 17, 21, -5, 18 };
        votingAge(ages);

        System.out.println();

        // positive negative zero
        int[] numbers = { 10, -7, 0, 15 };
        checkNumbers(numbers);

        System.out.println();

        // multiplication table
        multiplicationTable(7);

        System.out.println();

        // factors of a number
        factorsOfNumber(28);

        System.out.println();

        // FizzBuzz
        fizzBuzz(15);
    }

    // voting age
    public static void votingAge(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }

    // positive negative zero
    public static void checkNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }
    }

    // multiplication table
    public static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }

    // sum of numbers
    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("Sum of all numbers: " + total);
    }

    // mean height of football team
    public static void meanHeight() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int teamSize = 11;
        for (int i = 0; i < teamSize; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            sum += scanner.nextDouble();
        }
        double mean = sum / teamSize;
        System.out.println("Mean height of the football team: " + mean);
    }

    // odd and even numbers
    public static void oddAndEvenNumbers(int number) {
        if (number < 1) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }
        // Using arrays directly, as seen in your style
        int evenCount = number / 2;
        int oddCount = (number + 1) / 2;
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }

    // factors of a number
    public static void factorsOfNumber(int number) {
        int maxFactors = 10; // Initial capacity
        int[] factors = new int[maxFactors];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactors) {
                    // Dynamic array resizing, matching your reference code
                    maxFactors *= 2;
                    int[] temp = new int[maxFactors];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }

    // 2D to 1D array
    public static void twoDToOneDArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        int[][] twoDArray = new int[rows][columns];
        int[] oneDArray = new int[rows * columns];

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();
    }

    // FizzBuzz
    public static void fizzBuzz(int number) {
        if (number < 1) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        String[] results = new String[number];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        System.out.println("FizzBuzz results:");
        for (String result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
