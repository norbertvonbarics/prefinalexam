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

  public List<Integer> removeDuplicateValuesSecondSolution(List<Integer> inputList) {
    for (int i = 0; i < inputList.size(); i++) {
      for (int j = (i + 1); j < inputList.size(); j++) {
        if (inputList.get(i) == inputList.get(j)) {
          inputList.remove(inputList.get(i));
        }
      }
    }
    return inputList;
  }
}
