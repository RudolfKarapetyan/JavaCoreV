package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int numCharactersArray = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                numCharactersArray++;
            }
        }
        System.out.println("В массиве chars " + numCharactersArray + " переменная(ых) c");
        System.out.println("\n");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int twoMeanVariables = chars2.length / 2;
        boolean evenOrOdd;
        if (chars2.length % 2 == 0) {
            evenOrOdd = true;
        } else {
            evenOrOdd = false;
        }
        if (evenOrOdd == true) {
            System.out.println(chars2[twoMeanVariables--]);
            System.out.println(chars2[twoMeanVariables]);
        } else {
            System.out.println(chars2[twoMeanVariables++]);
            System.out.println(chars2[twoMeanVariables]);
        }
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        boolean endOfArray;
        if ((chars3[chars3.length - 1]) == 'y' && (chars3[chars3.length - 2]) == 'l') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.println(text[i]);
            }
        }
    }
}
