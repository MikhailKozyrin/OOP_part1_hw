public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void compareStudents(Slytherin studentFirst) {
        int magicPowerOne = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int magicPowerTwo = studentFirst.cunning + studentFirst.determination + studentFirst.ambition + studentFirst.resourcefulness + studentFirst.lustForPower;
        if (magicPowerOne > magicPowerTwo) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + studentFirst.getName() + " " + studentFirst.getSurname());
        } else if (magicPowerTwo > magicPowerOne) {
            System.out.println(studentFirst.getName() + " " + studentFirst.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " равный по силам Когтевранцу " + studentFirst.getName() + " " + studentFirst.getSurname());
        }
    }

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизерин. " +
                "Имя: " + name +
                "; Фамилия: " + surname +
                "; Сила магии: " + magicPower +
                "; Трансгрессия на расстояние: " + transgressionDistance +
                "; Хитрость: " + cunning +
                "; Решительность: " + determination +
                "; Амбициозность: " + ambition +
                "; Находчивость: " + resourcefulness +
                "; Жажда власти: " + lustForPower +
                '.';
    }
}
