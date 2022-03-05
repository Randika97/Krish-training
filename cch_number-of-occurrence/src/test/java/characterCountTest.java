import com.training.cch.CountOccurrences;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
public class characterCountTest {

    @Test
    public void tc_001() {
        CountOccurrences countOccurances = new CountOccurrences();
        HashMap<Character, Integer> dt_001 = new HashMap<Character, Integer>();
        dt_001.put('a',2);
        dt_001.put('d',1);
        dt_001.put('i',1);
        dt_001.put('k',1);
        dt_001.put('n',1);
        dt_001.put('r',1);
        HashMap<Character, Integer> tc_001 = countOccurances.characterCount("Randika");
        assertEquals(tc_001, dt_001);
    }
    @Test
    public void tc_002() {
        CountOccurrences countOccurances = new CountOccurrences();
        HashMap<Character, Integer> dt_002 = new HashMap<Character, Integer>();
        dt_002.put('c',1);
        dt_002.put('o',1);
        dt_002.put('m',1);
        dt_002.put('p',1);
        dt_002.put('u',1);
        dt_002.put('t',1);
        dt_002.put('e',1);
        dt_002.put('r',1);
        HashMap<Character, Integer> tc_002 = countOccurances.characterCount("Computer");
        assertEquals(tc_002, dt_002);
    }

}
