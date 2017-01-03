package task5;

public class EmployeeHourly extends Employee
{
    private double hourlyRate;

    public EmployeeHourly(String name, int id)
    {
        super(name, id);
    }

    public double getAvSalary() {return calculateAvSalary();}

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAvSalary()
    {
        return 20.8 * 8 * hourlyRate;
    }

}
