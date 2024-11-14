public class Main {
    public static void main(String[] args) {
        //Задание 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        //Задание 2
        System.out.println();
        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println(" ");
        for (start = 10; start > 0; start--) {
            System.out.print(start + " ");
        }
        //Задача 3
        int Y = 12000000;
        int life = 17;
        int death = 8;
        int yearNow = 2024;
        for (int year = yearNow; year < yearNow + 10; year++) {
            Y += Y * life / 1000 - Y * death / 1000;
            System.out.println();
            System.out.printf("Год %d, численность населения составляет %d", year, Y);
            System.out.println();
        }
        //Задача 4
        int salary2 = 15000;
        int total2 = 0;
        int month = 0;
        int percent = salary2 * 7 / 100;
        while (total2 < 12000000) {
            month++;
            total2 += salary2 + percent;
            System.out.println("Месяц " + month + " Итого " + total2);
        }
        System.out.println("Заняло месяцев " + month + " Итоговая сумма " + total2);

        //Задача 5
        salary2 = 15000;
        total2 = 0;
        month = 0;
        percent = salary2 * 7 / 100;
        while (total2 < 12000000) {
            month++;
            total2 += salary2 + percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + total2);
            }
        }
        //Задача 6
        salary2 = 15000;
        int total3 = 0;
        percent = salary2 * 7 / 100;
        for (int month2 = 0; month2 < 9 * 12; month2++) {
            total3 += salary2 + percent;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " Итого " + total3);
            }
        }
        //Задача 7
        int days = 31;
        int first = 1; //Первое ноября 2024, пятница 1 число
        for (int friday = first; friday < days; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет");
        }
        //Задача 8
        int yearNow2 = 2024;
        for (int years = 0; years < yearNow + 100; years += 79) {
            if (years > yearNow - 200) {
                System.out.println("Комета пролетит в " + years + " году");
            }
        }
    }
}