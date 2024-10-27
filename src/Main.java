import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        TextMethods textMethods = new TextMethods();

        List<Pets> petsList = new ArrayList<>();
        petsList.add(new Pets(0, "Шарик", "dog", new Date(2020, Calendar.FEBRUARY, 1), new ArrayList<>()));
        petsList.get(0).getCommands().add("Дай лапу!");
        petsList.add(new Pets(0, "Пушок", "cat", new Date(2022, Calendar.MARCH, 31), new ArrayList<>()));
        petsList.get(1).getCommands().add("Почесать пузико!");
        petsList.add(new Pets(0, "Сосиска", "hamster", new Date(2023, Calendar.JULY, 22), new ArrayList<>()));
        petsList.get(2).getCommands().add("Прикинутся мертвым");
        petsList.add(new Pets(0, "Рекс", "dog", new Date(2021, Calendar.SEPTEMBER, 6), new ArrayList<>()));
        petsList.get(3).getCommands().add("Голос!");
        petsList.add(new Pets(0, "Яша", "cat", new Date(2024, Calendar.DECEMBER, 3), new ArrayList<>()));
        petsList.get(4).getCommands().add("Давай мурчи!");

        List<PackAnimals> packAnimalsList = new ArrayList<>();
        packAnimalsList.add(new PackAnimals(0, "Мустанг", "horse", new Date(2015, Calendar.APRIL, 15), new ArrayList<>()));
        packAnimalsList.get(0).getCommands().add("Бежать голопом");
        packAnimalsList.add(new PackAnimals(0, "Федя", "camel", new Date(2019, Calendar.NOVEMBER, 1), new ArrayList<>()));
        packAnimalsList.get(1).getCommands().add("Плюнуть в прохожего");
        packAnimalsList.add(new PackAnimals(0, "Иа", "donkey", new Date(2020, Calendar.JANUARY, 10), new ArrayList<>()));
        packAnimalsList.get(2).getCommands().add("Входит и выходит!");
        packAnimalsList.add(new PackAnimals(0, "Джо", "camel", new Date(2017, Calendar.AUGUST, 27), new ArrayList<>()));
        packAnimalsList.get(3).getCommands().add("Улыбнуться");
        packAnimalsList.add(new PackAnimals(0, "Звёздочка", "horse", new Date(2020, Calendar.JUNE, 1), new ArrayList<>()));
        packAnimalsList.get(4).getCommands().add("Прррр!");


        System.out.println("===============================================" + "\n");
        System.out.println("=======Добро пожаловать в реестр животных======" + "\n");

        while (flag) {
            textMethods.mainMenu();
            if (sc.hasNextInt()) {
                int no = sc.nextInt();
                sc.nextLine();
                try {
                    switch (no) {
                        case 0:
                            System.out.println("Завершение работы программы");
                            flag = false;
                            break;
                        case 1:
                            for (Pets pets : petsList) {System.out.println(pets);}
                            for (PackAnimals packAnimals : packAnimalsList) {System.out.println(packAnimals);}
                            break;
                        case 2:
                            for (Pets pets : petsList) {System.out.println(pets);}
                            break;
                        case 3:
                            for (PackAnimals packAnimals : packAnimalsList) {System.out.println(packAnimals);}
                            break;
                        case 4:
                            System.out.println("Введите имя ");
                            String name = sc.next();
                            System.out.println("Введите тип животного ");
                            String type = sc.next();
                            System.out.println("Введите дату рождения животного ");
                            System.out.println("Введите год ");
                            int year = sc.nextInt();
                            System.out.println("Введите месяц ");
                            int month = sc.nextInt();
                            System.out.println("Введите день ");
                            int day = sc.nextInt();
                            System.out.println("1 - добавить к домашним животным");
                            System.out.println("2 - добавить к вьючным животным");
                            if (sc.hasNextInt()) {
                                int num = sc.nextInt();
                                sc.nextLine();
                                try {
                                    switch (num) {
                                        case 1:
                                            petsList.add(new Pets(0, name, type, new Date(year, month, day), new ArrayList<>()));
                                            break;
                                        case 2:
                                            packAnimalsList.add(new PackAnimals(0, name, type, new Date(year, month, day), new ArrayList<>()));
                                            break;
                                    }
                                }catch (Exception e) {System.out.println(e.getMessage());}
                            }
                            break;
                        case 5:
                            System.out.println("Для какого животного добавить");
                            System.out.println("1 - Добавить для домашнего животного");
                            System.out.println("2 - Добавить для вьючного животного");
                            if (sc.hasNextInt()) {
                                int num1 = sc.nextInt();
                                sc.nextLine();
                                try {
                                    switch (num1) {
                                        case 1:
                                            System.out.println("Введите название команды ");
                                            String commandPet = sc.next();
                                            for (Pets pets : petsList) {System.out.println(pets);}
                                            System.out.println("Введите ID животного, которому надо добавить команду");
                                            int tempIdPet = sc.nextInt() - 1;
                                            petsList.get(tempIdPet).getCommands().add(commandPet);
                                            break;
                                        case 2:
                                            System.out.println("Введите название команды ");
                                            String commandPack = sc.next();
                                            for (PackAnimals packAnimals : packAnimalsList) {System.out.println(packAnimals);}
                                            System.out.println("Введите ID животного, которому надо добавить команду");
                                            int tempIdPack = sc.nextInt() - 1;
                                            packAnimalsList.get(tempIdPack).getCommands().add(commandPack);
                                            break;
                                    }

                                }catch (Exception e) {System.out.println(e.getMessage());}
                            }
                            break;
                        default:
                            System.out.println("Укажите корректный пункт меню.");
                            break;
                    }
                } catch (Exception e) {System.out.println(e.getMessage());}
            }
            else {
                System.out.println("Укажите корректный пункт меню.");
                sc.nextLine();
            }
        }
    }
}
