//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model ="Toyota";
        myCar.year =2020;
        myCar.drive();

        Motor myMotor1= new Motor("honda",2020);
        Motor myMotor2= new Motor("yamaha",2021);
        System.out.println(myMotor1.model+" "+myMotor1.year);
        System.out.println(myMotor2.model+" "+myMotor2.year);

        Bike myBike1 = new Bike();
        Bike myBike2 = new Bike();
        System.out.println(myBike1.model+" "+myBike1.year);
        System.out.println(myBike2.model+" "+myBike2.year);

    }
}

