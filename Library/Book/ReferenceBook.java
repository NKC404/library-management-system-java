package Library.Book;

public class ReferenceBook extends Book{
    // Additonal attributes than Book
    private boolean canBeBorrowed;


    // Constrcutor
    public ReferenceBook(String title, String author, double price, boolean isAvailable, int nos, boolean canBeBorrowed)
    {
        //Chain constructor : calling parents class constructor
        super(title, author, price, isAvailable, nos);
        this.canBeBorrowed = canBeBorrowed;
    }

    // Overriding the parents class method
    @Override
    public void displayInfo()
    {
        // Here, you are calling super class displayInfo() for reusability
        super.displayInfo();
        System.out.println("canBeBorrowed : "+ this.canBeBorrowed);
    }

    
    
}
