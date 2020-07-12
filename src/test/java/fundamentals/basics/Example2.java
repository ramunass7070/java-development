package fundamentals.basics;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Example2 {

    @Test
    public void testAssertTrueFalse() {
        Assert.assertTrue(3 == 3);
        Assert.assertFalse(3 == 4);
    }

    @Test
    public void testAssertNull() {
        String text = null;
        Assert.assertNull(text);
    }

    @Test
    public void testAssertSame() {
        String text1 = "abc";
        String text2 = "abc";
        Assert.assertSame(text1, text2);
    }

    @Test
    public void testAssertNotEquals() {
        Assert.assertEquals("aaa", "aaa");
        Assert.assertNotEquals("abc", "cba");
    }

    @Ignore
    @Test
    public void testAssertEqualsArrays() {
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {4, 5, 6};
        Assert.assertArrayEquals(firstArr, secondArr);
    }


}
