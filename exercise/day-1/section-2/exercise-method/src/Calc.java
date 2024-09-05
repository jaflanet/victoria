public class Calc {
    int a,b;

    public Calc(int a,int b){
        this.a=a;
        this.b=b;
    }

    public double add(){
        return this.a+this.b;
    }

    public double sub(){

        return this.a-this.b;
    }

    public double mul(){
        return this.a*this.b;
    }

    public double div(){
        if (this.b!=0) {
            return (double) this.a / this.b;
        }
        else
            return 0;
    }

}
