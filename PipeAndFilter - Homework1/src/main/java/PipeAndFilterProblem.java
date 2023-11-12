import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PipeAndFilterProblem {

    public static void main(String[] args) throws IOException {
        ClassLoader loader = PipeAndFilterProblem.class.getClassLoader();
        Scanner scanner = new Scanner(new File(loader.getResource("dias-2.csv").getFile()));

        Pipe<String> formatingDataPipe = new Pipe<String>();

        FilterOutEmptyData filterOutEmptyData = new FilterOutEmptyData();
        RemoveDuplicatesFilter removeDuplicatesFilter = new RemoveDuplicatesFilter();
        RemoveLastColumnFilter removeLastColumnFilter = new RemoveLastColumnFilter();


        formatingDataPipe.addFilter(removeLastColumnFilter);
        formatingDataPipe.addFilter(filterOutEmptyData);
        formatingDataPipe.addFilter(removeDuplicatesFilter);


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String formated = formatingDataPipe.runFilters(line);
            System.out.println(formated);

        }

    }
}
