package lesson16;

public class ExceptionDemo {
    public static void main(String[] args) {

        authenticate("login1", "password1", "password1");
        authenticate("lohtahgin1", "password1", "password1");
        authenticate("login1", "password1", "pahggssword1");
        authenticate("login1", "password1", "pahggssword1");
        authenticate("login1", "pashdjdword1", "ptgtjyxkxyuhggssword1");


    }


    public static boolean authenticate(String login, String password, String confPassword) {
        try {
            if (login.length() < 20) {
                throw new WrongLoginException("Login > 20");
            }

            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Password > 20 or password != confPassword");
            }
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.printf("Login %s, password %s, confPassword %s%n", login, password, confPassword);
        }
        return true;


    }
}
