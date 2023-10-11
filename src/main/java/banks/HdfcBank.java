package banks;

public class HdfcBank implements Bank{

    private int availableBalance;

    @Override
    public String getBankName() {
        return "The test is running for HDFC Bank..!";
    }

    public Integer getAvailableBalance() {
        return availableBalance;
    }


    public void depositAmount(Integer amount) {
        availableBalance = availableBalance + amount;
        System.out.println("Successfully deposited " + amount + " in your Hdfc A/c.");
    }

    public void withdrawAmount(Integer amount) {
        availableBalance = availableBalance - amount;
        System.out.println("Successfully withdrawn " + amount + " from your Hdfc A/c.");
    }
}
