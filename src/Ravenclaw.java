public class Ravenclaw extends Hogwarts {
    private int brainy;
    private int wisdom;
    private int wit;
    private int creativity;

    public void compareStudents(Ravenclaw studentFirst) {
        int magicPowerOne = this.brainy + this.wisdom + this.wit + this.creativity;
        int magicPowerTwo = studentFirst.brainy + studentFirst.wisdom + studentFirst.wit + studentFirst.creativity;
        if (magicPowerOne > magicPowerTwo) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + studentFirst.getName() + " " + studentFirst.getSurname());
        } else if (magicPowerTwo > magicPowerOne) {
            System.out.println(studentFirst.getName() + " " + studentFirst.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " равный по силам Когтевранцу " + studentFirst.getName() + " " + studentFirst.getSurname());
        }
    }

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int brainy, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.brainy = brainy;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getBrainy() {
        return brainy;
    }

    public void setBrainy(int brainy) {
        this.brainy = brainy;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент факультета Когтевран. " +
                "Имя: " + name +
                "; Фамилия: " + surname +
                "; Сила магии: " + magicPower +
                "; Трансгрессия на расстояние: " + transgressionDistance +
                "; Ум: " + brainy +
                "; Мудрость: " + wisdom +
                "; Остроумие: " + wit +
                "; Творчество: " + creativity +
                '.';
    }
}
