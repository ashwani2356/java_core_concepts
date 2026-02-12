package oops;

public class Account {

    String username;
    String password;
    boolean loginStatus;

    Account(String username, String password){
        this.username = username;
        this.password = password;
        this.loginStatus = false;   // default logged out
    }

    void login(String inputPassword){

        if(password.equals(inputPassword)){
            loginStatus = true;
            System.out.println("Login successful");
        }
        else{
            System.out.println("Password doesn't match");
        }
    }

    void logout(){
        if(loginStatus){
            loginStatus = false;
            System.out.println("Logged out successfully");
        }
        else{
            System.out.println("Already logged out");
        }
    }

    void displayStatus(){
        if(loginStatus){
            System.out.println("User is logged in");
        }
        else{
            System.out.println("User is not logged in");
        }
    }

    public static void main(String[] args) {

        Account ac = new Account("ashwani","1234");

        ac.displayStatus();      // not logged in
        ac.login("123");         // wrong password
        ac.login("1234");        // correct password
        ac.displayStatus();      // logged in
        ac.logout();
        ac.displayStatus();
    }
}
