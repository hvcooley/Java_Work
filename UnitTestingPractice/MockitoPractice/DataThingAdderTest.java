package dev.cooley;

import org.junit.Test;
import org.mockito.Mockito;

public class DataThingAdderTest {
    @Test
    public void testAddThings(){
        DataConnection mockDataConnection = Mockito.mock(DataConnection.class);
        Mockito.when(mockDataConnection.getThingOne()).thenReturn(1);
        Mockito.when(mockDataConnection.getThingTwo()).thenReturn(2);
        DataThingAdder thingAdder = new DataThingAdder(mockDataConnection);

        thingAdder.addThings();
        Mockito.verify(mockDataConnection).setResult(3);
    }
}
