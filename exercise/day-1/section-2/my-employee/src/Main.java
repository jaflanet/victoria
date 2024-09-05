//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee myEmployee1 = new Employee();
        myEmployee1.name = "Jona ";
        myEmployee1.npk = 68762;
        myEmployee1.salary = 8000000;
        myEmployee1.address = "rumah saya";
        myEmployee1.age = 23;
        myEmployee1.sayHello();
        System.out.println(myEmployee1.name+myEmployee1.npk+" "+myEmployee1.salary+" "+myEmployee1.address+myEmployee1.age);

        Employee myEmployee2 = new Employee();
        myEmployee2.name = "Jona jr";
        myEmployee2.npk = 68762;
        myEmployee2.salary = 8000000;
        myEmployee2.address = "rumah saya";
        myEmployee2.age = 23;
        myEmployee2.sayHello();
        System.out.println(myEmployee2.name+myEmployee2.npk+myEmployee2.salary+myEmployee2.address+myEmployee2.age);

        Employee myEmployee3 = new Employee();
        myEmployee3.name = "Jona sr";
        myEmployee3.npk = 68762;
        myEmployee3.salary = 8000000;
        myEmployee3.address = "rumah saya";
        myEmployee3.age = 23;
        myEmployee3.sayHello();
        System.out.println(myEmployee2.name+myEmployee2.npk+myEmployee2.salary+myEmployee2.address+myEmployee2.age);

        Employee myEmployee4 = new Employee();
        myEmployee4.name = "Jona .com";
        myEmployee4.npk = 68762;
        myEmployee4.salary = 8000000;
        myEmployee4.address = "rumah saya";
        myEmployee4.age = 23;
        myEmployee4.sayHello();


        Employee myEmployee5 = new Employee();
        myEmployee5.name = "Jona .net";
        myEmployee5.npk = 68762;
        myEmployee5.salary = 8000000;
        myEmployee5.address = "rumah saya";
        myEmployee5.age = 23;
        myEmployee5.sayHello();

    }
}