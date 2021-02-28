package Basic.com.development.team.domain;

import Basic.com.development.team.service.Status;

public class Programmer extends Employee {
    private int memberId = 0;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + this.getClass().getSimpleName() + "\t\t" + status.toString() + "\t\t\t\t\t\t\t\t" + equipment.getDescription();
    }

    public String teamToString() {
        if (getId() > 9) {
            return memberId + "/" + getId() + "\t\t" + getName() + "\t\t" + getAge() + "\t\t" + getSalary() + "\t\t" + this.getClass().getSimpleName() + "\t\t";
        } else {
            return memberId + "/" + getId() + "\t\t\t" + getName() + "\t\t" + getAge() + "\t\t" + getSalary() + "\t\t" + this.getClass().getSimpleName() + "\t\t";
        }
    }
}
