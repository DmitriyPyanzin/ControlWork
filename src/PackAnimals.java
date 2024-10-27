import java.util.ArrayList;
import java.util.Date;

public class PackAnimals extends Animal{

    private static int counterPackAnimals = 0;

    public PackAnimals(int id, String name, String type, Date birthDate, ArrayList<String> commands) {
        super(id, name, type, birthDate, commands);
        setId(++counterPackAnimals);
    }
}
