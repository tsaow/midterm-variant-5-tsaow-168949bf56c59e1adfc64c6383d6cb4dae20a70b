package edu.usc.csci310.exams.midterm.subjects;
import edu.usc.csci310.exams.midterm.ProhibitedResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

public class Class_5Test {
    Class_5 class_5if;
    Class_5 class_5else;
    Class_5 class_5catch;

    @BeforeEach
    public void setUp() throws Exception{
        ProhibitedResource mockProhibitedResource = Mockito.mock(ProhibitedResource.class);
        Mockito.when(mockProhibitedResource.getResponse()).thenReturn("Mocked response");
        Mockito.when(mockProhibitedResource.copy()).thenReturn(mockProhibitedResource);

        ProhibitedResource exceptionMock = Mockito.mock(ProhibitedResource.class);
        Mockito.when(exceptionMock.getResponse()).thenThrow(new RuntimeException("exception"));

        class_5if = new Class_5(mockProhibitedResource,1000); //epsilon = 74
        assertEquals(74,class_5if.getEpsilon9());
        assertFalse(class_5if.isPsi2());

        class_5else = new Class_5(mockProhibitedResource,0); //epsilon = 692-890
        assertEquals(-198,class_5else.getEpsilon9());
        assertFalse(class_5else.isPsi2());

        class_5catch = new Class_5(exceptionMock,0); //epsilon = 692+78
        assertEquals(770,class_5catch.getEpsilon9());
        assertFalse(class_5catch.isPsi2());
    }

    @Test
    public void testkqjgzg() throws Exception {

        assertEquals(6016,class_5if.kqjqzq());

        ProhibitedResource mockProhibitedResource = Mockito.mock(ProhibitedResource.class);
        Mockito.when(mockProhibitedResource.getResponse()).thenReturn("Mocked response");
        Mockito.when(mockProhibitedResource.copy()).thenThrow(new RuntimeException("exception"));
        class_5if.setMu6(mockProhibitedResource);

        Exception exception = assertThrows(Exception.class, () -> {
            class_5if.kqjqzq();
        });

        assertEquals("I don't have good news for you my friend!", exception.getMessage());
    }
    @Test
    public void testrte() throws Exception {
        assertEquals(311868,class_5if.rte());

        ProhibitedResource mockProhibitedResource = Mockito.mock(ProhibitedResource.class);
        Mockito.when(mockProhibitedResource.getCount()).thenThrow(new RuntimeException("exception"));
        class_5if.setMu6(mockProhibitedResource);
        Exception exception = assertThrows(Exception.class, () -> {
            class_5if.rte();
        });
        assertEquals("Pfff. 310 is so hard...", exception.getMessage());
    }

    @Test
    public void testibw() throws Exception {
        assertEquals(6808,class_5if.ibw(0,"Input here"));
        assertEquals(0,class_5if.ibw(0,"wrong"));
    }

    @Test
    public void testgetEpsilon9() {
    }

    @Test
    public void testsetEpsilon9() {
    }

    @Test
    public void testgetMu6() {

    }
    @Test
    public void testsetMu6() {

    }
    @Test

    public void testisPsi2() {

    }
    @Test
    public void testsetPsi2() {
        class_5if.setPsi2(true);
        assertTrue(class_5if.isPsi2());
    }
}
