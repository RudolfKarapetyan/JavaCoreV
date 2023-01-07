package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int removerStart = 0, removerEnd = spaceArray.length;
        int resultLenght = spaceArray.length;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                removerStart++;
                resultLenght--;
            } else {
                break;
            }
            for (int j = spaceArray.length - 1; j > 0; j--) {
                if (spaceArray[j] == ' ') {
                    removerEnd--;
                    resultLenght--;
                } else {
                    break;
                }
            }
        }
        char[] result = new char[resultLenght];
        for (int i = removerStart, j = 0; removerStart < removerEnd; removerStart++, i++, j++) {
            result[j] = spaceArray[removerStart];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
