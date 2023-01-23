package dev.cooley;

public class DataThingAdder {
    private DataConnection dataConnect;

    public DataThingAdder(DataConnection dataConnect){
        this.dataConnect = dataConnect;
    }
    public void addThings(){
        int one = dataConnect.getThingOne();
        int two = dataConnect.getThingTwo();
        int result = one + two;
        dataConnect.setResult(result);
    }
}
