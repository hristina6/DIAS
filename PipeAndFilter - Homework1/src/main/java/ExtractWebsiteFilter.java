public class ExtractWebsiteFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] columns = input.split(",");
        String website = columns[3].trim();  // Assuming website is in the 4th column
        if (!website.isEmpty()) {
            // You can further process or use the extracted website URL
            return website;
        }
        return input;
    }
}
