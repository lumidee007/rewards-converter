public class RewardValue{

    public int cashValue;
    public double milesValue;

    public RewardValue(int cashValue){
        this.cashValue=cashValue;
    }

    public RewardValue(double milesValue){
        this.milesValue=milesValue;
    }

    public int getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return this.milesValue*0.0035;
    }
}