public class Employee extends Person {
    private int id;
    private double hourlyPay;

    // Constructor
    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName); // Call the constructor of the base class (Person)
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    // Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // getRaise method to increase the hourly pay
    public double getRaise() {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    // Method to calculate the hourly pay
    public double payDay(int hoursWorked) {
        double totalPay;
        if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        } else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "They are " + (int)(getHeight() / 12) + "’" + (int)(getHeight() % 12) + "”\n" +
                "They make $" + hourlyPay + "\n" +
                "They have the employee ID " + id + "\n";
    }
}
