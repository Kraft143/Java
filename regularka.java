
import java.util.Arrays;
import java.util.Scanner;

public class regularka {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String firstInput = scan.nextLine();
        boolean firstTest = true;
        boolean fitstTestOne = false;
        String arab1 = null;
        String[] romeMassiv = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int arabOne;
        int arabTwo;
        String arab2 = null;
        String roma1 = null;
        String roma2 = null;
        String operator = null;
        if (firstInput.matches("^([1-9]|10) (\\+|\\-|\\*|\\/) ([1-9]|10)") == firstTest) {
            String[] arab = firstInput.split(" ");
            arab1 = arab[0];
            arab2 = arab[2];
            operator = arab[1];
            System.out.println(Arrays.toString(arab));
            return;
        } else if (firstInput.matches("^[IXV]{1,3} (\\+|\\-|\\*|\\/) ([IXV]{1,3})") == firstTest) {
            String[] roma = firstInput.split(" ");
            roma1 = roma[0];
            roma2 = roma[2];
            operator = roma[1];
            System.out.println(Arrays.toString(roma));
            return;
        } else if ((Arrays.asList(romeMassiv).contains(roma1) && Arrays.asList(romeMassiv).contains(roma2) == firstTest)) {
            System.out.println("Римкие цифры были именно те что надо");

        } else throw new Exception("Ввод не отвечает условиям");

        if (roma1 != null) {
            arabOne = Integer.parseInt(roma1);
            arabTwo = Integer.parseInt(roma2);
        } else if (roma2 != null) {
            arabOne = Integer.parseInt(roma1);
            arabTwo = Integer.parseInt(roma2);
        }
       /* switch (operator) {case "+": ansewr=arabOne+arabTwo;
            System.out.println(ansewr); break;}*/

        System.out.println("Значит тут были арабские цифры " + arab1 + " и " + arab2);
        System.out.println("Значит тут были риские цифры " + roma1 + " и " + roma2);
        System.out.println("Действие было вот такое " + operator);
        ;

    }

}
