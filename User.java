import java.util.ArrayList;

/*
 * This is User class that has three public methods for getting user
 * first name, last name or child name 
 *
 *
 * @author 56130
 */
public class User {

    private final int id ;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String profession;
    private ArrayList<User> children;

    public User(int id, String firstName, String lastName, int age, String profession) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    public String getChildName(User child) {
        if (this.children.contains(child)) {
					  String name = null;
            if (child.getUserFirstName() != null) {
                name = child.getUserFirstName();
            }
            if (name == "Harry") {
                name = name.replace('r', 'p');
            }
            if (name != null && name.length() > 0) {
                name = name.concat(child.getUserLastName());
            }
        } else {
        		new Exception("Invalid argument!");
        }
        return name;
    }

    public String getUserFirstName() {
        return this.firstName;
    }

    public String getUserLastName() {
        return this.lastName;
    }
}
