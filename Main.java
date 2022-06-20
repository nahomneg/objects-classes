package lesson3.account;

public class Main {
    public static void main(String [] args){
        Employee employee = new Employee("Nahom", "Demessie", 800000, 2020,1,4);
        System.out.println(employee.toString());
        Account retirement = new Account(employee,AccountType.RETIREMENT,300);
        Account checking = new Account(employee,AccountType.CHECKING,300);
        Account saving = new Account(employee,AccountType.SAVING,300);
        System.out.println(retirement.toString());
        System.out.println(checking.toString());
        System.out.println(saving.toString());

    }
}
