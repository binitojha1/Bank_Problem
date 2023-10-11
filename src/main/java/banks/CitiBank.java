package banks;

public class CitiBank implements Bank{

    private int availableBalance;

    @Override
    public String getBankName() {
        return "The test is running for Citi Bank..!";
    }

    public Integer getAvailableBalance() {
        return availableBalance;
    }

    public void depositAmount(Integer amount) {
        availableBalance = availableBalance + amount;
        System.out.println("Successfully deposited " + amount + " in your Citi A/c.");
    }

    public void withdrawAmount(Integer amount) {
        availableBalance = availableBalance - amount;
        System.out.println("Successfully withdrawn " + amount + " from your Citi A/c.");
    }
}
