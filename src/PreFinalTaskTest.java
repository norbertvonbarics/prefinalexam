import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PreFinalTaskTest {

  PreFinalTask preFinalTask = new PreFinalTask();

  @Test
  public void testRemoveDuplicatesEquals() {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6));
    List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    assertEquals(expectedList, preFinalTask.removeDuplicateValues(inputList));
  }

  @Test
  public void testRemoveDuplicatesNotEquals() {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 4, 4, 5, 5, 5));
    List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    assertNotEquals(expectedList, preFinalTask.removeDuplicateValues(inputList));
  }
}