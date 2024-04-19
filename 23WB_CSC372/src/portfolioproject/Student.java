package portfolioproject;

class Student {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.gpa = GPA;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }
}
