public class Expenses {
    enum Category {
        FOOD,
        TRANSPORT,
        ENTERTAINMENT,
        UTILITIES,
        OTHER
    }
    Integer id;
    Double amount;
    Category category;
    Long timesstamp;
}
