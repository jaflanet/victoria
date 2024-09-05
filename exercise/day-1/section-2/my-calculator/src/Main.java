//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    public static void main(String[] args) {

        int a=9;
        int b=2;
        Calc myCalc = new Calc(a,b);
        System.out.println(myCalc.add());
        System.out.println(myCalc.sub());
        System.out.println(myCalc.mul());
        System.out.println(myCalc.div());

    }
}