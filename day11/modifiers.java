public class modifiers {
    public static void main(String[] args) {
        

        BankAccount myAcc= new BankAccount();
        myAcc.username= "kunalsingh";
        myAcc.setPassword("hgvjb");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
