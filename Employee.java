public class Employee {
    private int age;
    private String name;
    private String departament;
    boolean isPaidPerHour;

    public Employee (String departament, int age, String name, boolean isPaidPerHour){
        this.age = age;
        this.name = name;
        this.departament = departament;
        this.isPaidPerHour = isPaidPerHour;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public boolean isPaidPerHour() {
        return isPaidPerHour;
    }

    public void setPaidPerHour(boolean paidPerHour) {
        isPaidPerHour = paidPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", isPaidPerHour=" + isPaidPerHour +
                '}';
    }
}
