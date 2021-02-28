package Basic.com.development.team.domain;

public class Designer extends Programmer {
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getId() + "\t\t" + getName() + "\t\t" + getAge() + "\t\t"
                + getSalary() + "\t\t" + "Designer" + "\t\t" + getStatus().toString()
                + "\t\t" + bonus + "\t\t\t\t\t" + getEquipment().getDescription();
    }

    @Override
    public String teamToString() {
        return super.teamToString() + bonus + "\t\t";
    }
}
