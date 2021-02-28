package Basic.com.development.team.view;

import Basic.com.development.team.domain.Employee;
import Basic.com.development.team.domain.Programmer;
import Basic.com.development.team.service.NameListService;
import Basic.com.development.team.service.Status;
import Basic.com.development.team.service.TeamException;
import Basic.com.development.team.service.TeamService;

public class TeamView {
    private final NameListService listService = new NameListService();
    private final TeamService teamService = new TeamService();

    public void enterMainMenu() {
        System.out.println("------------------------------------Development Team Schedule Software------------------------------------\n");
        System.out.println("ID\t\tName\t\tAge\t\tSalary\t\tOccupation\t\tState\t\tBonus\t\tStock\t\tEquipment");
        listAllEmployee();
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
        System.out.print("1-Team List\t2-Add Team Member\t3-Delete Team Member\t4-Quit\tPlease select(1-4): ");
    }

    private void listAllEmployee() {
        for (Employee employee : listService.getAllEmployees()) {
            System.out.println(employee.toString());
        }
    }

    private void listAllTeamMember() throws TeamException {
        if (teamService.getTotal() == 0) {
            throw new TeamException("Team has no member yet\n");
        } else {
            System.out.println("--------------------------------Team Member List--------------------------------\n");
            System.out.println("TID/ID\t\tName\t\tAge\t\tSalary\t\tOccupation\t\tBonus\t\tStock");
            for (Programmer programmer : teamService.getTeam()) {
                if (programmer != null) {
                    System.out.println(programmer.teamToString());
                }
            }
            System.out.println("\n-------------------------------------------------------------------------------\n");
        }
    }

    private void addMember() {
        System.out.println("--------------------Add Member--------------------");
        System.out.print("Please input the member ID you want to add: ");
        int id = ReadKeyBoard.readInt();
        try {
            Employee employee = listService.getEmployee(id);
            if (!teamService.checkTeamState(employee)) {
                Programmer programmer = (Programmer) employee;
                programmer.setStatus(Status.BUSY);
                programmer.setMemberId(TeamService.getCounter());
                teamService.addMember(programmer);
                System.out.println("Added successfully");
            }
        } catch (TeamException e) {
            System.out.print("Add failed, reason: ");
            System.out.println(e.getMessage());
        } finally {
            ReadKeyBoard.readReturn();
        }
    }

    private void deleteMember() {
        System.out.println("--------------------Delete Member--------------------");
        if (teamService.getTotal() == 0) {
            System.out.println("Team has no member yet");
        } else {
            System.out.print("Please input the member ID(TID) you want to delete: ");
            int tID = ReadKeyBoard.readInt();
            System.out.print("Please make sure to delete(Y/N): ");
            if (ReadKeyBoard.readConfirmSelection() == 'Y') {
                try {
                    teamService.removeMember(tID);
                    System.out.println("Deleted successfully");
                } catch (TeamException e) {
                    System.out.println(e.getMessage());
                } finally {
                    ReadKeyBoard.readReturn();
                }
            }
        }
    }

    private void selection1(TeamView teamView) {
        try {
            teamView.listAllTeamMember();
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        boolean loopFlag = true;
        while (loopFlag) {
            teamView.enterMainMenu();
            switch (ReadKeyBoard.readMenuSelection()) {
                case '1' -> teamView.selection1(teamView);
                case '2' -> teamView.addMember();
                case '3' -> teamView.deleteMember();
                case '4' -> loopFlag = false;
            }
        }
        System.out.println("Thanks for using!\nGoodbye!");
    }
}
