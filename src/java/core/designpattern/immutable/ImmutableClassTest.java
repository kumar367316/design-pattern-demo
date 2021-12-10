package java.core.designpattern.immutable;

public class ImmutableClassTest {

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        Employee employee = new Employee("EMP001", "Alex", age);

        System.out.println("Alex age year before modification = " + employee.getAge().getYear());
        employee.getAge().setYear(1993);
        System.out.println("Alex age year after modification = " + employee.getAge().getYear());
    }
}
