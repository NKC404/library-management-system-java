package Library.Member;

public class Member {
    // Private attributes
    private String memberId;
    private String name;
    private String phone;
    private String email;
    
    // Constructor chaining (no-arg constructor calls parametrized constructor)
    public Member() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }
    
    public Member(String memberId, String name, String phone, String email) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    // Getters and Setters
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    
    public String getMemberId() {
        return this.memberId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    // Display method
    public void displayMemberInfo() {
        System.out.println("Member ID: " + this.memberId + 
                         ", Name: " + this.name + 
                         ", Phone: " + this.phone + 
                         ", Email: " + this.email);
    }
}