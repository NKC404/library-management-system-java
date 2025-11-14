package Staff.Liberian;

public class Librarian {
    // Private attributes
    private String librarianId;
    private String name;
    private String shift;
    
    // Constructor chaining
    public Librarian() {
        this("Unknown", "Unknown", "Unknown");
    }
    
    public Librarian(String librarianId, String name, String shift) {
        this.librarianId = librarianId;
        this.name = name;
        this.shift = shift;
    }
    
    // Getters and Setters
    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }
    
    public String getLibrarianId() {
        return this.librarianId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setShift(String shift) {
        this.shift = shift;
    }
    
    public String getShift() {
        return this.shift;
    }
    
    // Display method
    public void displayLibrarianInfo() {
        System.out.println("Librarian ID: " + this.librarianId + 
                         ", Name: " + this.name + 
                         ", Shift: " + this.shift);
    }
}