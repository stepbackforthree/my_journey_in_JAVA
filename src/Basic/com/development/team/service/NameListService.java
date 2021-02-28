package Basic.com.development.team.service;

import Basic.com.development.team.domain.*;

public class NameListService {
    private final Employee[] employees = new Employee[Data.EMPLOYEES.length];

    public NameListService() {
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            String[] employee = Data.EMPLOYEES[i];
            String[] equipment = Data.EQUIPMENTS[i];
            Equipment gear = null;
            if (equipment.length != 0) {
                switch (equipment[0]) {
                    case "21" -> gear = new PC(equipment[1], equipment[2]);
                    case "22" -> gear = new NoteBook(equipment[1], equipment[2]);
                    case "23" -> gear = new Printer(equipment[1], equipment[2]);
                }
            }
            switch (Integer.parseInt(employee[0])) {
                case Data.EMPLOYEE -> employees[i] = new Employee(Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]), Double.parseDouble(employee[4]));
                case Data.PROGRAMMER -> employees[i] = new Programmer(Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]), Double.parseDouble(employee[4]), gear);
                case Data.DESIGNER -> employees[i] = new Designer(Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]), Double.parseDouble(employee[4]), gear, Double.parseDouble(employee[5]));
                case Data.ARCHITECT -> employees[i] = new Architect(Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]), Double.parseDouble(employee[4]), gear, Double.parseDouble(employee[5]), Integer.parseInt(employee[6]));
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        if (id > employees.length) {
            throw new TeamException("Cannot find the specific employee");
        }
        return employees[id - 1];
    }
}
