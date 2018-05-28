package br.com.s2it.ex9;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo
 */
public class NumberGeneratorTest {
    
    public NumberGeneratorTest() {
    }

    @Test
    public void testBuildNumber() {
        
        int a = 10256, b = 512;
        
        int c = new NumberGenerator().buildNumber(a, b);
        
        assertEquals(-1, c);
    }
    
}
