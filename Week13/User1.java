package Week13;

public class User1 extends Bank_Account {
    public User1(String string, String string2, int i) {
        super(string, string2, i);
    }

    public static void main(String[] args) {
        User1 newUser = new User1("Your Name", "12345678", 1000000);
        newUser.confirmation();
    }
}
