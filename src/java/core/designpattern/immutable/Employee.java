package java.core.designpattern.immutable;

public final class Employee {
    public final String empID;
    private final String empName;
    private final Age age;

    public Employee(String empID, String empName, Age age) {
        this.empID = empID;
        this.empName = empName;

        Age clone = new Age();
        clone.setDay(age.getDay());
        clone.setMonth(age.getMonth());
        clone.setYear(age.getYear());
        this.age = clone;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Age getAge() {
        Age clone = new Age();
        clone.setDay(this.age.getDay());
        clone.setMonth(this.age.getMonth());
        clone.setYear(this.age.getYear());
        return clone;
    }
}
