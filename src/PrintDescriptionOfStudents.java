public class PrintDescriptionOfStudents {
    public void print(Griffindor[] griffindors) {
        System.out.println("Студенты факультета Гриффиндор:");
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя: " + griffindor.getName()
                    + "; Фамилия: " + griffindor.getSurname()
                    + "; Сила магии: " + griffindor.getMagicPower()
                    + "; Трансгрессия на расстояние: " + griffindor.getTransgressionDistance()
                    + "; Благородство: " + griffindor.getNobility()
                    + "; Честь: " + griffindor.getHonor()
                    + "; Храбрость: " + griffindor.getBravery()
                    + ".");
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Студенты факультета Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getName()
                    + "; Фамилия: " + hufflepuff.getSurname()
                    + "; Сила магии: " + hufflepuff.getMagicPower()
                    + "; Трансгрессия на расстояние: " + hufflepuff.getTransgressionDistance()
                    + "; Трудолюбие: " + hufflepuff.getHardworking()
                    + "; Верность: " + hufflepuff.getLoyalty()
                    + "; Честность: " + hufflepuff.getHonesty()
                    + ".");
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Студенты факультета Когтевран: ");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: " + ravenclaw.getName()
                    + "; Фамилия: " + ravenclaw.getSurname()
                    + "; Сила магии: " + ravenclaw.getMagicPower()
                    + "; Трансгрессия на расстояние: " + ravenclaw.getTransgressionDistance()
                    + "; Ум: " + ravenclaw.getBrainy()
                    + "; Мудрость: " + ravenclaw.getWisdom()
                    + "; Остроумие: " + ravenclaw.getWit()
                    + "; Творчество: " + ravenclaw.getCreativity()
                    + ".");
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Студенты факультета Слизерин:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName()
                    + "; Фамилия: " + slytherin.getSurname()
                    + "; Сила магии: " + slytherin.getMagicPower()
                    + "; Трансгрессия на расстояние: " + slytherin.getTransgressionDistance()
                    + "; Хитрость: " + slytherin.getCunning()
                    + "; Решительность: " + slytherin.getDetermination()
                    + "; Амбициозность: " + slytherin.getAmbition()
                    + "; Находчивость: " + slytherin.getResourcefulness()
                    + "; Жажда власти: " + slytherin.getLustForPower()
                    + ".");
        }

    }
}
