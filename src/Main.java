public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри", "Поттер", 83, 85, 90, 92, 100);
        Griffindor germionaGrainger = new Griffindor("Гермиона", "Грейнджер", 92, 70, 90, 96, 88);
        Griffindor ronWisley = new Griffindor("Рон", "Уизли", 74, 70, 92, 85, 98);

        Hufflepuff zakhariaSmith = new Hufflepuff("Захария", "Смит", 80, 62, 59, 82, 70);
        Hufflepuff sedrickDighory = new Hufflepuff("Седрик", "Диггори", 90, 73, 82, 94, 76);
        Hufflepuff justinFinchFletchly = new Hufflepuff("Джастин", "Финч-Флетчли", 65, 58, 63, 76, 56);

        Ravenclaw chouZhang = new Ravenclaw("Чжоу", "Чанг", 72, 55, 75, 42, 35, 66);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 70, 40, 74, 65, 46, 69);
        Ravenclaw marcusBielby = new Ravenclaw("Маркус", "Белби", 65, 50, 73, 89, 56, 75);

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 81, 81, 94, 60, 99, 74, 100);
        Slytherin grahamMontegy = new Slytherin("Грэхэм", "Монтегю", 52, 22, 80, 62, 25, 45, 56);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 62, 52, 76, 69, 70, 35, 65);

        System.out.println(harryPotter);
        System.out.println(germionaGrainger);
        System.out.println(ronWisley);
        System.out.println();
        System.out.println(zakhariaSmith);
        System.out.println(sedrickDighory);
        System.out.println(justinFinchFletchly);
        System.out.println();
        System.out.println(chouZhang);
        System.out.println(padmaPatil);
        System.out.println(marcusBielby);
        System.out.println();
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontegy);
        System.out.println(gregoryGoyle);
        System.out.println();
        harryPotter.compareStudents (ronWisley);
        sedrickDighory.compareStudents(zakhariaSmith);
        chouZhang.compareStudents(padmaPatil);
        dracoMalfoy.compareStudents(gregoryGoyle);
        System.out.println();
        harryPotter.compareStudents(dracoMalfoy);



    }
}