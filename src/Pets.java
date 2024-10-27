import java.util.ArrayList;
import java.util.Date;

public class Pets extends Animal{

    private static int counterPets = 0;

    public Pets(int id, String name, String type, Date birthDate, ArrayList<String> commands) {
        super(id, name, type, birthDate, commands);
        setId(++counterPets);
    }
}
