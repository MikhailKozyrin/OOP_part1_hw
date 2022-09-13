public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public void compareStudents(Griffindor studentFirst){
        int magicPowerOne = this.nobility + this.honor + this.bravery;
        int magicPowerTwo = studentFirst.nobility + studentFirst.honor + studentFirst.bravery;
        if (magicPowerOne > magicPowerTwo) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + studentFirst.getName() + " " + studentFirst.getSurname());
        } else if (magicPowerTwo > magicPowerOne) {
            System.out.println(studentFirst.getName() + " " + studentFirst.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " равный  по силам Гриффиндорцу " + studentFirst.getName() + " " + studentFirst.getSurname());
        }
    }

    public Griffindor(String name, String surname, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор. " +
                "Имя: " + name +
                "; Фамилия: " + surname +
                "; Сила магии: " + magicPower +
                "; Трансгрессия на расстояние: " + transgressionDistance +
                "; Благородство: " + nobility +
                "; Честь: " + honor +
                "; Храбрость: " + bravery +
                '.';
    }
}


