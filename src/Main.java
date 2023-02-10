public class Main {
    public static void main(String[] args) {
        System.out.println("\n\tЗадание 1:");
        task1();
        System.out.println("\n\tЗадание 2:");
        task2();
        System.out.println("\n\tЗадание 3:");
        task3();
        System.out.println("\n\tЗадание 4:");
        task4();
        System.out.println("\n\tЗадание 5:");
        task5();
        System.out.println("\n\tЗадание 6:");
        task6();
        System.out.println("\n\tЗадание 7:");
        task7();
        System.out.println("\n\tЗадание 8:");
        task8();
    }

    public static void task1(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);
    }

    public static void task3(){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3;
        cat = cat - 3;
        paper = paper - 3;

        System.out.println("dog - 3 = " + dog);
        System.out.println("cat - 3 = " + cat);
        System.out.println("paper - 3 = " + paper);
    }

    public static void task4(){
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend * 2;
        System.out.println("friend * 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
    }

    public static void task5(){
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }

    public static void task6(){
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifference = weightBoxer2-weightBoxer1;

        System.out.println("Разница между весами бойцов составляет " + weightDifference + "кг.");

    }

    public static void task7(){
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        var weightDifference = weightBoxer2-weightBoxer1; //Использовали операцию вычитания.

        System.out.println("Разница между весами бойцов составляет " + weightDifference + "кг (Операция вычитания).");

        weightDifference = weightBoxer2%weightBoxer1; //Использовали операцию остаток от деления.

        System.out.println("Разница между весами бойцов составляет " + weightDifference + "кг (Операция остаток от деления).");
    }

    public static void task8(){
        var workHours = 640;
        var eachEmployeeHours = 8;
        var totalEmployees = workHours/eachEmployeeHours; // сколько всего работников в компании?

        System.out.println("Задание 8.1:\n" +
                "Всего в компании " + totalEmployees + " сотрудников.");

        var updatedTotalEmployees = totalEmployees + 94;
        var updatedWorkHours = updatedTotalEmployees * eachEmployeeHours; // часы работы, если в компании работает на 94 человека больше
        System.out.println("Задание 8.2:\n" +
                "Если в компании теперь работает " + updatedTotalEmployees +
                " человек, то всего " + updatedWorkHours +
                " часов работы может быть поделено между сотрудниками");
    }

}