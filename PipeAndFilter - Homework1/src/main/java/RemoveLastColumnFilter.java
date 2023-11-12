import java.util.Arrays;

public class RemoveLastColumnFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        // Split the input CSV row into columns
        String[] columns = input.split(",");

        // Check if the row has enough columns (assuming email is the last column)
        if (columns.length > 5) {
            // Remove the email column (assuming it's the sixth column, adjust as needed)
            columns = Arrays.copyOfRange(columns, 0, 5);

            // Join the columns back into a CSV row
            return String.join(",", columns);
        }

        // If the row doesn't have enough columns, return the original row
        return input;
    }
}
