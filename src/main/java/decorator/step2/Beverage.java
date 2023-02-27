package decorator.step2;

public abstract class Beverage {
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public Beverage(){
        this.milk = false;
        this.soy = false;
        this.mocha = false;
        this.whip = false;
    }

    public abstract String getDescription();
    public abstract String getName();

    public Double getCost(){
        double condimentCost = 0;
        if(hasMilk()){
            condimentCost += 0.25;
        }
        if(hasSoy()){
            condimentCost += 0.1;
        }
        if(hasWhip()){
            condimentCost += 0.15;
        }
        if(hasMocha()){
            condimentCost += 0.05;
        }
        return condimentCost;
    }

    public boolean hasMocha(){return milk;}

    public boolean hasWhip(){return whip;}

    public boolean hasSoy(){return soy;}

    public boolean hasMilk(){return milk;}

    public void setMilk(boolean milk) {this.milk = milk;}

    public void setSoy(boolean soy) {this.soy = soy;}

    public void setMocha(boolean mocha) {this.mocha = mocha;}

    public void setWhip(boolean whip) {this.whip = whip;}

    public void 기타_메서드들(){}
}
