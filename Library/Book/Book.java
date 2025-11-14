package Library.Book;

public class Book{
    // Book Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    private int nos;

    //Constrcutor
    public Book()
    {
        //Chain Constructor: This calls/invokes parametrize constructor of this class itself
        this("Unknown","Unknown",0.0,false,0);
    }
    public Book(String title, String author, double price, boolean isAvailable, int nos)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
        this.nos = nos;
    }

    // Encapsulation: use the setter and getter

    public void setterTitle(String title)
    {
        this.title = title;
    }
    public String getterTitle()
    {
        return this.title;
    }

    public void setterAuthor(String author)
    {
        this.author = author;
    }
    public String getterAuthor()
    {
        return this.author;
    }
    public void setterPrice(double price)
    {
        this.price = price;
    }
    public double getterPrice()
    {
        return this.price;
    }

    public void setterIsAvaliable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    public boolean getterIsAvailable()
    {
        return this.isAvailable;
    }

    public void displayInfo()
    {
        System.out.println("Title : "+ this.title + ", Author : "+ this.author + 
        ", Price : "+ this.price +", isAvailable : "+this.isAvailable +", Nos : "+this.nos  );
        
    }


}

