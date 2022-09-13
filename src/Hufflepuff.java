public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public void compareStudents(Hufflepuff studentFirst) {
        int magicPowerOne = this.hardworking + this.loyalty + this.honesty;
        int magicPowerTwo = studentFirst.hardworking + studentFirst.loyalty + studentFirst.honesty;
        if (magicPowerOne > magicPowerTwo) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + studentFirst.getName() + " " + studentFirst.getSurname());
        } else if (magicPowerTwo > magicPowerOne) {
            System.out.println(studentFirst.getName() + " " + studentFirst.getSurname() + " лучший Пуффендуец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " равный по силам Пуффендуйцу " + studentFirst.getName() + " " + studentFirst.getSurname());
        }
    }

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй. " +
                "Имя: " + name +
                "; Фамилия: " + surname +
                "; Сила магии: " + magicPower +
                "; Трансгрессия на расстояние: " + transgressionDistance +
                "; Трудолюбие: " + hardworking +
                "; Верность: " + loyalty +
                "; Честность: " + honesty +
                '.';
    }
}
