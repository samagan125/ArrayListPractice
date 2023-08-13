
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User(6, "Samagan",15);
        userDao.addUser(user);
        User user1 = new User(3, "Baikal",10);
        userDao.addUser(user1);
        User foundUser = userDao.getUserById(3);
        if (foundUser != null) {
            System.out.println("табылды: " + foundUser.getName());
        } else {
            System.out.println("мындай индекс жок.");
        }
    }
}
