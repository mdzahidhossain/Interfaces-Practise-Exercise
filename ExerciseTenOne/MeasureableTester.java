package ExerciseTenOne;

public class MeasureableTester {
    public static void main(String[] args)
    {
        ExerciseTenOne.Measureable[] accounts = new ExerciseTenOne.Measureable[3];
        accounts[0] = new ExerciseTenOne.BankAccount(4000);
        accounts[1] = new ExerciseTenOne.BankAccount(17525);
        accounts[2] = new ExerciseTenOne.BankAccount(19200);

        double averageBalance = ExerciseTenOne.Data.average(accounts);
        System.out.println("Average balance: " + averageBalance);
        System.out.println("Expected: 13575");

        double largestBalance = ExerciseTenOne.Data.max(accounts);
        System.out.println("Largest Balance: " + largestBalance);
        System.out.println("Expected: 19200");
    }
}