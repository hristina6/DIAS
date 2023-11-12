public class FilterOutEmptyData implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] columns = input.split(",");
        for (String column : columns) {
            if (column.trim().isEmpty()) {
                return null;  // Skip the row if any column is empty
            }
        }
        return input;
    }
}