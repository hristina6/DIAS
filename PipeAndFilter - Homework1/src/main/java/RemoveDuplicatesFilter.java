import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFilter implements Filter<String> {
    private Set<String> uniqueRows = new HashSet<>();

    @Override
    public String execute(String input) {
        // Check if the row is unique by adding it to the set
        // If the row is not unique (already exists in the set), return null to skip it
        if (uniqueRows.add(input)) {
            return input;
        } else {
            return null;
        }
    }
}