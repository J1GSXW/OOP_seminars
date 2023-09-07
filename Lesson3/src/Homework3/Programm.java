package Homework3;

import java.util.Arrays;
import java.util.Random;

public class Programm {
    private static Random random = new Random();

    public static Employer[] generateEmployer(int count){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        Employer[] employers = new Employer[count];
        for (int i = 0; i < employers.length; i++) {
            int salaryIndex = random.nextInt(200, 500);
            int housePrice = random.nextInt(50, 100);
            int age = random.nextInt(18, 65);
            int hoursWorked = random.nextInt(10, 100);
            Employer freelancer = new Freelancer(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], hoursWorked * housePrice, age, hoursWorked);
            Employer worker = new Worker(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
            boolean bool = random.nextBoolean();
            if(bool)
                employers[i] = freelancer;
            else employers[i] = worker;
        }
        return employers;
    }


    public static void main(String[] args) {

        Employer[] employers = generateEmployer(12);
        for (Employer employer: employers) {
            System.out.println(employer);
        }

//        Arrays.sort(employers/*, new SalaryComparator()*/);
        Arrays.sort(employers, new AgeComporator());
        System.out.println();

        for (Employer employer: employers) {
            System.out.println(employer);
        }
    }


}
