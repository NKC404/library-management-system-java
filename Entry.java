import Library.Book.Book;
import Library.Book.ReferenceBook;
import Library.Member.Member;
import Staff.Liberian.Librarian;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Entry {

    public static void clearScreen() {
        try {
            // For Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
            // For Linux/Mac
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // If clearing fails, just print blank lines
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store objects
        Book[] books = new Book[50];
        ReferenceBook[] referenceBooks = new ReferenceBook[50];
        Member[] members = new Member[50];
        Librarian[] librarians = new Librarian[50];
        
        // Counters to track how many items have been added
        int bookCount = 0;
        int refBookCount = 0;
        int memberCount = 0;
        int librarianCount = 0;
        
        int choice = 0;
        boolean running = true;
        
        // Main menu loop
        while (running) {
            try {
                // Display menu
                System.out.println("\n========= LIBRARY MANAGEMENT SYSTEM =========");
                System.out.println("1) Add Book");
                System.out.println("2) Add Reference Book");
                System.out.println("3) Add Member");
                System.out.println("4) Add Librarian");
                System.out.println("5) Display Book Information");
                System.out.println("6) Display Reference Book Information");
                System.out.println("7) Display All Members");
                System.out.println("8) Display All Librarians");
                System.out.println("9) Exit");
                System.out.println("=============================================");
                System.out.print("Enter your choice: ");
                
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1: // Add Book
                        try {
                            System.out.print("Enter book title: ");
                            String title = scanner.nextLine();
                            
                            System.out.print("Enter author name: ");
                            String author = scanner.nextLine();
                            
                            System.out.print("Enter price: ");
                            double price = scanner.nextDouble();
                            
                            System.out.print("Is available? (true/false): ");
                            boolean isAvailable = scanner.nextBoolean();
                            
                            System.out.print("Enter number of copies: ");
                            int nos = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            
                            books[bookCount] = new Book(title, author, price, isAvailable, nos);
                            bookCount++;
                            System.out.println("✓ Book added successfully!");
                            
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error: Book storage is full!");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid input! Please enter correct data type.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;
                    
                    case 2: // Add Reference Book
                        try {
                            System.out.print("Enter book title: ");
                            String title = scanner.nextLine();
                            
                            System.out.print("Enter author name: ");
                            String author = scanner.nextLine();
                            
                            System.out.print("Enter price: ");
                            double price = scanner.nextDouble();
                            
                            System.out.print("Is available? (true/false): ");
                            boolean isAvailable = scanner.nextBoolean();
                            
                            System.out.print("Enter number of copies: ");
                            int nos = scanner.nextInt();
                            
                            System.out.print("Can be borrowed? (true/false): ");
                            boolean canBeBorrowed = scanner.nextBoolean();
                            scanner.nextLine(); // Consume newline
                            
                            referenceBooks[refBookCount] = new ReferenceBook(title, author, price, isAvailable, nos, canBeBorrowed);
                            refBookCount++;
                            System.out.println("✓ Reference Book added successfully!");
                            
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error: Reference Book storage is full!");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid input! Please enter correct data type.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;
                    
                    case 3: // Add Member
                        try {
                            System.out.print("Enter member ID: ");
                            String memberId = scanner.nextLine();
                            
                            System.out.print("Enter member name: ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Enter phone number: ");
                            String phone = scanner.nextLine();
                            
                            System.out.print("Enter email: ");
                            String email = scanner.nextLine();
                            
                            members[memberCount] = new Member(memberId, name, phone, email);
                            memberCount++;
                            System.out.println("✓ Member added successfully!");
                            
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error: Member storage is full!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    
                    case 4: // Add Librarian
                        try {
                            System.out.print("Enter librarian ID: ");
                            String librarianId = scanner.nextLine();
                            
                            System.out.print("Enter librarian name: ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Enter shift (Morning/Evening/Night): ");
                            String shift = scanner.nextLine();
                            
                            librarians[librarianCount] = new Librarian(librarianId, name, shift);
                            librarianCount++;
                            System.out.println("✓ Librarian added successfully!");
                            
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error: Librarian storage is full!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    
                    case 5: // Display Book Information
                        try {
                            if (bookCount == 0) {
                                System.out.println("No books available to display.");
                            } else {
                                clearScreen(); // Clear screen before displaying
                                System.out.println("\n--- BOOK INFORMATION ---");
                                for (int i = 0; i < bookCount; i++) {
                                    books[i].displayInfo();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error displaying books: " + e.getMessage());
                        }
                        break;

                    case 6: // Display Reference Book Information
                        try {
                            if (refBookCount == 0) {
                                System.out.println("No reference books available to display.");
                            } else {
                                clearScreen(); // Clear screen before displaying
                                System.out.println("\n--- REFERENCE BOOK INFORMATION ---");
                                for (int i = 0; i < refBookCount; i++) {
                                    referenceBooks[i].displayInfo();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error displaying reference books: " + e.getMessage());
                        }
                        break;

                    case 7: // Display All Members
                        try {
                            if (memberCount == 0) {
                                System.out.println("No members available to display.");
                            } else {
                                clearScreen(); // Clear screen before displaying
                                System.out.println("\n--- MEMBER INFORMATION ---");
                                for (int i = 0; i < memberCount; i++) {
                                    members[i].displayMemberInfo();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error displaying members: " + e.getMessage());
                        }
                        break;

                    case 8: // Display All Librarians
                        try {
                            if (librarianCount == 0) {
                                System.out.println("No librarians available to display.");
                            } else {
                                clearScreen(); // Clear screen before displaying
                                System.out.println("\n--- LIBRARIAN INFORMATION ---");
                                for (int i = 0; i < librarianCount; i++) {
                                    librarians[i].displayLibrarianInfo();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error displaying librarians: " + e.getMessage());
                        }
                        break;
                    
                    case 9: // Exit
                        System.out.println("Thank you for using Library Management System!");
                        running = false;
                        break;
                    
                    default:
                        System.out.println("Invalid choice! Please select between 1-9.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number for menu choice!");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}