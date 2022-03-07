import static org.junit.Assert.assertEquals;

import com.training.cch.FindMissingNumber;
import org.junit.Test;
public class FindMissingNumberTest {
    @Test
    public void tc_001() {
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int array[] = {1,3,4,5,6};
        int result = findMissingNumber.findMissingNumber(array);
        assertEquals(2, result);
    }
}
