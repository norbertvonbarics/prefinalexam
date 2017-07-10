import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PreFinalTask {

  public List<Integer> removeDuplicateValues(List<Integer> inputList) {
    Set<Integer> outputSet = new HashSet<>();
    outputSet.addAll(inputList);
    return new ArrayList<>(outputSet);
  }
}
