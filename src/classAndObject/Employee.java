package classAndObject;

public class Employee {
    private String EmployeeName;
    private int EmployeeId;

    Employee(String EmployeeName, int EmployeeId){
        this.EmployeeName=EmployeeName;
        this.EmployeeId=EmployeeId;
    }

    public void setEmployeeName(String EmployeeName){
        this.EmployeeName=EmployeeName;
    }
    public void setEmployeeId(int EmployeeId){
        this.EmployeeId=EmployeeId;
    }
    public String getEmployeeName(){
        return this.EmployeeName;
    }
    public int getEmployeeId(){
        return this.EmployeeId;
    }
}


