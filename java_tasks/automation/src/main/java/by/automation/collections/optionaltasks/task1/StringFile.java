package by.automation.collections.optionaltasks.task1;

import java.io.*;
import java.util.*;

public class StringFile {
    public List<String> writeToListFromFile(File file) {
        List<String> stringList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                String string = bufferedReader.readLine();
                stringList.add(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public void writeToFileReverse(List<String> list, File file) {
        Stack<String> stack = new Stack<>();
        stack.addAll(list);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (!stack.isEmpty()) {
                bufferedWriter.write(stack.pop());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
