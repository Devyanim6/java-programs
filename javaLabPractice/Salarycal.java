class Salarycal { 

    String name;
    double basicPay;
    double specialAllowance;
    double conveyanceAllowance;
    double gross;
    double pf;
    double netSalary;
    double annualSalary;

    void giveValues(String employeeName, double basicPayAmount, double conveyanceAllowanceAmount) {
        name = employeeName;
        basicPay = basicPayAmount;
        conveyanceAllowance = conveyanceAllowanceAmount;
    }

    void Salarycal() {
        specialAllowance = 0.25 * basicPay;         
        gross = basicPay + specialAllowance + conveyanceAllowance;
        pf = 0.0833 * basicPay;
        netSalary = gross - pf;
        annualSalary = netSalary * 12;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Special Allowance: " + specialAllowance);
        System.out.println("Conveyance Allowance: " + conveyanceAllowance);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Annual Salary: " + annualSalary);
    }

    public static void main(String[] args) {
        Salarycal employee = new Salarycal();
        
        employee.giveValues("John Doe", 50000, 5000);
        
        employee.Salarycal();
        
        
        employee.display();
    }
}
