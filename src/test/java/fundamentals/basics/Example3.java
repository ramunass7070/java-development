package fundamentals.basics;

import org.junit.*;

public class Example3 {

// BeforeClass & AfterClass   must be static, must be void;
// Before & After must be void;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Running Example3 class tests");
    }

    @Before
    public void setUp() {
        System.out.println("Running before each test");
    }

    @After
    public void tearDown() {
        System.out.println("Run after method");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Example3 tests completed.");
    }

    @Test
    public void Test1() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void Test2() {
        Assert.assertNotEquals("12",12);
    }

    @Test
    public void Test3() {
        Assert.assertNotEquals(6,1);
    }
}
