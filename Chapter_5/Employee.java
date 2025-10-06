public class Employee {
    private int empId;
    private double rate;
    public static final double OVERTIME_RATE = 1.5;

    public Employee(int empId, double rate) {
        this.empId = empId;
        this.rate = rate;
    }

    public double getRegularPay(int hours) {
        int regHours = Math.min(40, hours);
        return regHours * rate;
    }

    public double getOvertimePay(int hours) {
        int otHours = Math.max(0, hours - 40);
        return otHours * (rate * OVERTIME_RATE);
    }
}
