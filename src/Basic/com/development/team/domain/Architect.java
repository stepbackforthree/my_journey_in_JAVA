package Basic.com.development.team.domain;

public class Architect extends Designer {
    private int stock;

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getId() + "\t\t" + getName() + "\t\t" + getAge() + "\t\t"
                + getSalary() + "\t\t" + "Architect" + "\t\t"
                + getStatus().toString() + "\t\t" + getBonus() + "\t\t"
                + stock + "\t\t" + getEquipment().getDescription();
    }

    @Override
    public String teamToString() {
        return super.teamToString() + stock;
    }
}
