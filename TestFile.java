import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFile {
    public static void main(String[] args) throws IOException {
        new TestFile().treeWords("read.txt");
    }

    private void treeWords(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.forName("UTF-8"));
        List<String> list = new ArrayList<>();

        for (String str : lines) {
            list.addAll(Arrays.asList(str.split(" ")));
        }
        for (int g = 2; g < list.size(); g += 3) {
            System.out.println(list.get(g));
        }
    }
}
