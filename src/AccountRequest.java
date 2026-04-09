public class AccountRequest {
    String accountNumber;
    String username;
    double initialDeposit;

    AccountRequest(String accountNumber, String username, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.initialDeposit = initialDeposit;
    }
}