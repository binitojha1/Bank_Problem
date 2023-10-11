package banks;

public interface Bank {
    String getBankName();
    Integer getAvailableBalance();
    void depositAmount(Integer amount);
    void withdrawAmount(Integer amount);

}
