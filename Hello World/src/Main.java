//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    static final float phi = 3.14f ;
//    static float r,l1,l2;
//
//    static float luas( float r) {
//        float l =r*r*phi;
//        return l;
//    }
//    static String b,c;
//
//    static void checkNum(int a){
//        String b,c;
//
//        if (a%2== 0) {
//            b = "bilangan genap";
//        }
//        else {
//            b = "bilangan ganjil";
//        }
//        if (a>50){
//            c= "lebih besar dari 50";
//        }
//        else{
//            c= "lebih kecil dari 50";
//        }
//        System.out.print(a);
//        System.out.print(" ");
//        System.out.print(b);
//        System.out.print(" ");
//        System.out.print(c);
//
//    }

    static void checkDay(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.print(day);
        System.out.print(" is ");
        System.out.println(dayName);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            checkDay(arr[i]);
        }
    }
}


//        r=10f;
//        l1=luas(r);
//        r= 15f;
//        l2=luas(r);
//
//        System.out.println(l1);
//        System.out.println(l2);
//        int num1;
//        long num2;
//        float num3;
//        double num4;
//        char car1;
//        boolean is1;
//
//        num1= 1;
//        num2= 2;
//        num3= 3.4F ;
//        num4= 3.5;
//        car1 = 'a';
//        is1 = true;
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(car1);
//        System.out.println(is1);







