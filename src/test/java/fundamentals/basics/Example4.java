package fundamentals.basics;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Example4 {
    
    @Test
    public void testAssertJMachers() {
        //given
        String text = "abc";
        String[] stringArr = {"ou", "abc", "ai"};

        //when
        
        //then
        assertThat(text).isEqualTo("abc");
        assertThat(stringArr).hasSize(3).contains("abc").doesNotContain("uuuu");
        
    }
    
}
