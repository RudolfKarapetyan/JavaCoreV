package homework.homework17.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil implements Command {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            switch (printCommands()) {
                case EXIT:
                    isRun = false;
                    break;
                case FILE_SEARCH:
                    fileSearch();
                    break;
                case CONTENT_SEARCH:
                    contentSearch();
                    break;
                case FIND_LINES:
                    findLines();
                    break;
                case PRINT_SIZE_OF_PACKAGE:
                    printSizeOfPackage();
                    break;
                case CREATE_FILE_WITH_CONTENT:
                    createFileWithContent();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
                    break;
            }
        }
    }

    static String printCommands() {
        System.out.println("Input " + EXIT + " for exit");
        System.out.println("Input " + FILE_SEARCH + " for fileSearch");
        System.out.println("Input " + CONTENT_SEARCH + " for contentSearch");
        System.out.println("Input " + FIND_LINES + " for findLines");
        System.out.println("Input " + PRINT_SIZE_OF_PACKAGE + " for printSizeOfPackage");
        System.out.println("Input " + CREATE_FILE_WITH_CONTENT + " for createFileWithContent");
        String command = scanner.nextLine();
        return command;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch() {
        try {
            System.out.println("Please input path,fileName");
            String dataStr = scanner.nextLine();
            String[] dataArray = dataStr.split(",");
            File directory = new File(dataArray[0]);
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.getName().equals(dataArray[1])) {
                    System.out.println(true);
                    return true;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid URL");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Little data");
        }
        System.out.println(false);
        return false;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input path,keyword");
        String dataStr = scanner.nextLine();
        String[] dataArray = dataStr.split(",");
        File directory = new File(dataArray[0]);
        FilenameFilter filter = (dir, name) -> name.endsWith(".txt");
        File[] filesTxt = directory.listFiles(filter);
        for (File file : filesTxt) {
            try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
                String line = "";
                while ((line = inputStream.readLine()) != null && line.contains(dataArray[1])) {
                    System.out.println("File name: " + file.getName());
                }
            } catch (FileNotFoundException e) {
                System.out.println("The file at the specified path does not exist");
            } catch (IOException e) {
                System.out.println("Share the file");
            } catch (NullPointerException e) {
                System.out.println("Invalid URL");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Little data");
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input txtPath,keyword");
        String dataStr = scanner.nextLine();
        String[] dataArr = dataStr.split(",");
        File file = new File(dataArr[0]);
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = inputStream.readLine()) != null && line.contains(dataArr[1])) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file at the specified path does not exist");
        } catch (IOException e) {
            System.out.println("Share the file");
        } catch (NullPointerException e) {
            System.out.println("Invalid URL");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Little data");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static double printSizeOfPackage() {
        System.out.println("Please input path.");
        String dataStr = scanner.nextLine();
        try {
            File directory = new File(dataStr);
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                double sum = 0;
                for (File file : files) {
                    sum += file.length();
                }
                System.out.println("Sum: " + sum);
                return sum;
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid URL");
        }
        System.out.println("Please input folder path.");
        return -1;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static boolean createFileWithContent() {
        System.out.println("Please input path,fileName,content");
        String dataStr = scanner.nextLine();
        try {
            String[] dataArr = dataStr.split(",");
            File directory = new File(dataArr[0]);
            if (!directory.exists() && !directory.isDirectory()) {
                directory.mkdir();
                System.out.println("Package crated!");
            }
            final String FILE_PATH = dataArr[0] + "/" + dataArr[1];
            File newFile = new File(FILE_PATH);
            if (!newFile.exists()) {
                if (newFile.createNewFile()) {
                    System.out.println("File crated!");
                }
            } else {
                System.out.println("You have " + dataArr[1]);
            }
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
                dos.writeUTF(dataArr[2]);
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid URL");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Little data");
        } catch (IOException e) {
            System.out.println("Share the file");
        }
        return false;
    }
}
