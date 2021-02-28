package Basic.com.development.team.service;

import Basic.com.development.team.domain.Architect;
import Basic.com.development.team.domain.Designer;
import Basic.com.development.team.domain.Employee;
import Basic.com.development.team.domain.Programmer;

import java.util.Arrays;

public class TeamService {
    private static int counter = 1;
    private static final int MAX_MEMBER = 6;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;
    private int programmer = 0;
    private int designer = 0;
    private int architect = 0;

    public Programmer[] getTeam() {
        return team;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        TeamService.counter = counter;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean checkTeamState(Employee employee) throws TeamException {
        if (total == MAX_MEMBER) {
            throw new TeamException("Team member is full, add failed");
        } else if (Integer.parseInt(Data.EMPLOYEES[employee.getId() - 1][0]) == Data.EMPLOYEE) {
            throw new TeamException("This employee is not a developer, add failed");
        } else if (Arrays.asList(team).contains(employee)) {
            throw new TeamException("This employee has already enrolled in this team");
        } else if (((Programmer) employee).getStatus() == Status.BUSY) {
            throw new TeamException("This employee has already enrolled in another team");
        } else if (((Programmer) employee).getStatus() == Status.VOCATION) {
            throw new TeamException("This employee is on vacation, add failed");
        } else if (architect == 1 && employee.getClass().getSimpleName().equals("Architect")) {
            throw new TeamException("This team can only have one Architect, which is full");
        } else if (designer == 2 && employee.getClass().getSimpleName().equals("Designer")) {
            throw new TeamException("This team can only have two designers, which is full");
        } else if (programmer == 3 && employee.getClass().getSimpleName().equals("Programmer")) {
            throw new TeamException("This team can only have three programmers, which is full");
        }
        return false;
    }

    public void addMember(Employee employee) throws TeamException {
        team[total] = (Programmer) employee;
        if (team[total] instanceof Architect) {
            this.architect++;
        } else if (team[total] instanceof Designer) {
            this.designer++;
        } else {
            this.programmer++;
        }
        counter++;
        total++;
    }

    public void removeMember(int memberId) throws TeamException {
        boolean find = false;
        for (Programmer employee : team) {
            if (employee != null) {
                if (memberId == employee.getMemberId()) {
                    find = true;
                    break;
                }
            }
        }
        if (find) {
            Programmer[] newTeam = new Programmer[MAX_MEMBER];
            int mark = 0;
            for (int i = 0; i < total; i++) {
                if (memberId == team[i].getMemberId()) {
                    mark = i;
                }
            }
            Programmer programmer = team[mark];
            programmer.setStatus(Status.FREE);
            programmer.setMemberId(0);
            for (int i = 0; i < total - 1; i++) {
                if (i < mark) {
                    newTeam[i] = team[i];
                } else {
                    newTeam[i] = team[i + 1];
                }
            }
            team = newTeam;
            total--;
            if (programmer.getClass().getSimpleName().equals("Architect")) {
                this.architect--;
            } else if (programmer.getClass().getSimpleName().equals("Designer")) {
                this.designer--;
            } else {
                this.programmer--;
            }
        } else {
            throw new TeamException("Cannot find the specific employee, delete failed");
        }
    }
}
