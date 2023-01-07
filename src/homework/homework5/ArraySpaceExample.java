package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result = new char[spaceArray.length];
        int removerStart = 0, removerEnd = spaceArray.length;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                removerStart++;
            } else {
                break;
            }
            for (int j = spaceArray.length - 1; j > 0; j--) {
                if (spaceArray[j] == ' ') {
                    removerEnd--;
                } else {
                    break;
                }
            }
        }
        for (int i = removerStart; removerStart < removerEnd; removerStart++, i++) {
            result[i] = spaceArray[removerStart];
            System.out.print(result[i]);
        }
    }
}
