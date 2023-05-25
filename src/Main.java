import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Task 1

        Integer[] digits = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};

        Arrays.sort(digits, Collections.reverseOrder());

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();
        System.out.println("___________________");




        //Task 2

        int[] numbers = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if ((currentNumber % 2) == 0) {
                System.out.println("Четное: " + currentNumber);
            } else {
                System.out.println("Не четное: " + currentNumber);
            }
        }

        System.out.println("_______________________________________________________");





        // Task 3

        int[] numbersForSecondTask = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};

        int odd = 0;
        int even = 0;

        for (int i = 0; i < numbersForSecondTask.length; i++) {
            int currentNumber = numbersForSecondTask[i];

            if ((currentNumber % 2) == 0) {
                even += currentNumber;
            } else {
                if (odd == 0) {
                    odd = currentNumber;
                } else {
                    odd = odd * currentNumber;
                }
            }
        }
        System.out.println("Сумма четных: " + even);
        System.out.println("Произведение нечетных: " + odd);

        System.out.println("_______________________________________________________");





        //Task 4

        String[] words = {"переменная", "функция", "метод", "аргумент", "параметр", "привязка", "длина", "высота", "размер"};
        String[] vowels = {"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        String[] consonants = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            for (int q = 0; q < currentWord.length(); q++) {
                char letter = currentWord.charAt(q);
                if (Arrays.asList(vowels).contains(String.valueOf(letter))) {
                    System.out.println("Буква " + letter + " является гласной.");
                } else {
                    System.out.println("Буква " + letter + " является согласной.");

                }
            }
            System.out.println("_______________________________________________________");
        }






        //Task 5

        String[] wordsOne = {"java","kotlin","python","javascript","nodejs","go","react","react native","swift"};
        String[] vowelsOne = {"a", "e", "i", "o", "u"};
        String[] consonantsOne = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        for (int i = 0; i < wordsOne.length ; i++) {
            String currentWord = wordsOne[i];

            for (int j = 0; j <currentWord.length() ; j++) {
                char letter = currentWord.charAt(j);
                if (Arrays.asList(vowelsOne).contains(String.valueOf(letter))) {
                    System.out.println("Буква " + letter + " является гласной.");
                } else {
                    System.out.println("Буква " + letter + " является согласной.");

                }
            }
        }
    }
}
