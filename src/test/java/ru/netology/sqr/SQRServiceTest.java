
package ru.netology.sqr;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SQRServiceTest {
    @Test
    public void testSquare() {

        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();
        int expected = 6;
        int actual = service.checkSquare(10, 99);
        assertEquals(expected, actual);
    }


}
