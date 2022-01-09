package OOP.enumExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //        these are enum constant
//        default it was
//        public static final
//        type is week
        Week() {
            System.out.println("Constructer has been called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello! How are you?");
        }
//        this is not public or protected, only private or default
//        why? because we don't want to create objects
//        internally: public static final week Monday =new Week();
        }


    public static void main(String[] args) {
        Week week;
        week = Week.Tuesday;
        week.hello();
//        System.out.println(week);
//        System.out.println(week.ordinal());

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
    }
}
