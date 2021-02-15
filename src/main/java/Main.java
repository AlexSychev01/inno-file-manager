import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager("F:\\Projects\\InnopolisFileManager\\root");

        String input = scanner.nextLine();

        while (!input.equals(Commands.EXIT)) {
            String tokens[] = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case Commands.LIST_OF_FILES:
                    fileManager.listOfFiles(false);
                    break;
                case Commands.LIST_OF_FILES_WITH_SIZE:
                    fileManager.listOfFiles(true);
                    break;
                case Commands.COPY_FILE:
                    String sourceFileName = tokens[1];
                    String destFileName = tokens[2];
                    fileManager.copyFile(sourceFileName, destFileName);
                    break;
                case Commands.CREATE_FILE: {
                    String fileName = tokens[1];
                    fileManager.createFile(fileName);
                    break;
                }
                case Commands.FILE_CONTENT:
                    String fileName = tokens[1];
                    fileManager.fileContent(fileName);
                    break;
                case Commands.CHANGE_DIRECTORY:
                    String folderName = tokens[1];
                    fileManager.changeDirectory(folderName);


                    break;
                case Commands.EXIT:
                    break;
            }
            input = scanner.nextLine();

        }
    }
}
