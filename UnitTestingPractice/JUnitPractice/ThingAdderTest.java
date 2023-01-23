package dev.cooley;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThingAdderTest {
    ThingAdder thingAdder;

    //Using the @before runs this piece of code before all of the test functions
    @Before
    public void setup(){
        thingAdder = new ThingAdder();
    }

    @Test
    public void testAddThings(){
        //ThingAdder thingAdder = new ThingAdder();
        int one = 1;
        int two = 2;
        int result = thingAdder.addThings(one,two);
        Assert.assertEquals(3,result);
    }

    @Test
    public void testAddThings_negative(){
        //ThingAdder thingAdder = new ThingAdder();
        int one = -1;
        int two = -2;

        int result = thingAdder.addThings(one, two);

        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddThings_overflow(){
        //ThingAdder thingAdder = new ThingAdder();
        int one = Integer.MAX_VALUE;
        int two = 1;

        int result = thingAdder.addThings(one, two);

        Assert.assertEquals(Integer.MIN_VALUE, result);
    }

}
