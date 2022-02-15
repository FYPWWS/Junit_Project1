package ie.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPassenger {

    //test negative response
    @Test
    void testConstructorInvalidTitle()
    {
        final String invalid = "Invalid title provided: Mr, Mrs or Ms.";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, () -> new Passenger("", "Bob", "123456", "086 199 5980", "33"));
        Assertions.assertEquals(invalid, exceptionThrown.getMessage());
    }

//    @Test
//    void testConstructorValidTitle()
//    {
//        final String invalid = "Valid title provided.";
//        Exception exceptionThrown = Assertions.assertThrows(ApplicationException.class, () -> new Passenger("Mr", "Bob", "123456", "086 199 5980", "33"));
//        Assertions.assertEquals(invalid, exceptionThrown.getMessage());
//    }


}
