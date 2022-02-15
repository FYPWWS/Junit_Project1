package ie.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

public class TestPassenger {

    Passenger myPassenger;
    
    
    @Test
    void testConstructorValidTitle()
    {

    }
    //test negative response
    @Test
    void testConstructorInvalidTitle()
    {
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = Assertions.assertThrows(ApplicationException.class, () -> {"", "Bob", "123456", "086 199 5980", "33"});
        Assertions.assertEquals("Mr" || "Mrs" || "Ms");
    }

}
