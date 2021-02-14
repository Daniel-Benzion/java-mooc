
import java.util.ArrayList;

public class RemoveLast {
    
    public static void removeLast(ArrayList<Integer> numbers) {
    if (numbers.isEmpty()) {
        return;
    }

    numbers.remove(numbers.size() - 1);
}

    public static void main(String[] args) {
        // Try your method in here
    }

}
