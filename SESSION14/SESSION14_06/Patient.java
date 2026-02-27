package SESSION14.SESSION14_06;

class Patient {
    private String name;
    private int age;
    private String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Patient(" + name + ")";
    }
}
