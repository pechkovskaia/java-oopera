public class Theatre {

    public static void main(String[] args) {

        // актеры
        Actor actor1 = new Actor("Данила", "Козловский", Gender.MALE, 181);
        Actor actor2 = new Actor("Иван", "Янковский", Gender.MALE, 175);
        Actor actor3 = new Actor("Петр", "Сидоров", Gender.MALE, 182);

        // режиссёры
        Director director1 = new Director("Лев", "Додин", Gender.MALE);
        Director director2 = new Director("Федор", "Бондарчук", Gender.MALE);

        // спектакли
        Performance drama = new Performance(
                "Драматический спектакль",
                120,
                director1
        );

        Opera opera = new Opera(
                "Кармен",
                150,
                director2,
                "Жорж Бизе",
                "Текст либретто оперы Кармен",
                40
        );

        Ballet ballet = new Ballet(
                "Щелкунчик",
                140,
                director2,
                "Пётр Чайковский",
                "Текст либретто балета Щелкунчик",
                "Юрий Григорьевич"
        );

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актеры драматического спектакля:");
        drama.printActors();

        System.out.println("\nАктеры оперы:");
        opera.printActors();

        System.out.println("\nАктеры балета:");
        ballet.printActors();

        System.out.println("\nЗамена актера в драме:");
        drama.replaceActor(actor3, "Козловский");
        drama.printActors();

        System.out.println("\nПопытка заменить несуществующего актера:");
        opera.replaceActor(actor1, "Неизвестный");

        System.out.println("\nЛибретто оперы:");
        opera.printLibretto();

        System.out.println("\nЛибретто балета:");
        ballet.printLibretto();
    }
}