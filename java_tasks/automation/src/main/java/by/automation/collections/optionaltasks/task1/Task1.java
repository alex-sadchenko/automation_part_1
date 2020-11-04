package by.automation.collections.optionaltasks.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" +
                separator + "resources" + separator + "files" + separator +"Song");
        StringFile stringFile = new StringFile();
        List<String> songList = new ArrayList<>(stringFile.writeToListFromFile(file));

        songList.forEach(System.out::println);

        stringFile.writeToFileReverse(songList, file);
    }
}
