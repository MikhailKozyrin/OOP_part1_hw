public abstract class Hogwarts {
    public String name;
    public String surname;
    public int magicPower;
    public int transgressionDistance;

    public void compareStudents(Hogwarts studentFirst) {
        int magicPowerOne = this.magicPower + this.transgressionDistance;
        int magicPowerTwo = studentFirst.magicPower + studentFirst.transgressionDistance;
        if (magicPowerOne > magicPowerTwo) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший студент Хогвартса, чем " + studentFirst.getName() + " " + studentFirst.getSurname());
        } else if (magicPowerTwo > magicPowerOne) {
            System.out.println(studentFirst.getName() + " " + studentFirst.getSurname() + " лучший студент Хогвартса, чем " + this.getName() + " " + this.getSurname());
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + " равный по силам студенту Хогвартса " + studentFirst.getName() + " " + studentFirst.getSurname());
        }
    }

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
