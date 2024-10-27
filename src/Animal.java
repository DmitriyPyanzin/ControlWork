import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {

    //region Constructors

    public Animal(int id, String name, String type, Date birthDate, ArrayList<String> commands) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = commands;
    }

    public int getId() {return id;}

    protected void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public List<String> getCommands() {return commands;}

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Type: " + type + " BirthDate: " + birthDate + " Commands: " + commands;
    }

    //endregion

    //region Private Fields

    private int id;

    private final String name;

    private final String type;

    private final Date birthDate;

    private final List<String> commands;

    //endregion
}