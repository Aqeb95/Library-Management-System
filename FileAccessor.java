
// Last updated 16/04/2015
import java.util.Scanner;
import java.io.*;

public class FileAccessor {
   
   private static String userInformation = "Users.txt";
   private static String requestFile = "Requests.txt";
   private static String signOutFile = "Books_Out.txt";
   private static String books = "Books.txt";   
   
   public static String books() throws IOException{
	   	  File file = new File(books);
	      Scanner inputFile = new Scanner(file);
	      String books = "";
	      if (!file.exists()){
	         inputFile.close();
	         return "No books available";
	      }
	      else{
	         while(inputFile.hasNextLine()){
	               books += "{"+inputFile.nextLine()+"}\n";
	            }
	         }
	         inputFile.close();
	            return books;
	      }
   
   public static void newUser(String id, String pass) throws IOException{ // Adds the new user to the users file
      File user = new File(userInformation);
      PrintWriter out;
      if (!user.exists()){
         out = new PrintWriter(user);
      }
      else {
         FileWriter fwriter = new FileWriter(user, true);
         out = new PrintWriter(fwriter);
      }
      out.println(id+"\t"+pass);
      out.close();
   }
   public static void returnBook(String id, String book) throws IOException{
	   File file = new File(signOutFile);
	   Scanner inputFile = new Scanner(file);
	   try{
		   if (file.exists() && inputFile.hasNextLine()){
			   String temp, input = "";
			   boolean countedBook = false;
			   while(inputFile.hasNextLine()){
				   	temp = inputFile.nextLine();
				   	if (temp.equals(id)&& countedBook == false){
				   		countedBook = true;
				   		temp = inputFile.nextLine();
				   	}
				   	else
				   		input += temp+"\t";
			   	}
			   PrintWriter out = new PrintWriter(signOutFile);
			   out.println(input);
			   out.close();
	   }
	   }
	   catch(Exception e){ 
	   }
	   addBook(book);
	   inputFile.close();
	   
   }
   public static boolean alreadyUser(String id) throws IOException{ // Returns false if user is not in the Users file
      File user = new File(userInformation);
      Scanner inputFile = new Scanner(user);
      String compaire;
      if (!user.exists()){
         inputFile.close();
         return false;
      }
      else{
         while(inputFile.hasNext()){
            compaire = inputFile.next();
            if (compaire.equals(id)){
               inputFile.close();
               return true;
            }
         }
         inputFile.close();
         return false;
      }
   }
   
   public static void requestBook(String id, String bookInfo) throws IOException{ // Writes to requests.txt for book requests
      File requests = new File (requestFile);
      PrintWriter out;
      FileWriter fwriter = new FileWriter(requests, true);
      out = new PrintWriter(fwriter);
      out.println(id);
      out.println(bookInfo);
      out.close();
   }
   public static void signOutBook(String id, String bookInfo) throws IOException{ // Writes to file to signout book
      File signOut = new File (signOutFile);
      File file = new File(books);
      Scanner inputFile = new Scanner(file);
      boolean countedBook = false;
      PrintWriter out;
      String input ="", temp;
      bookInfo = bookInfo.toLowerCase();
      if (!signOut.exists()){
         out = new PrintWriter(signOut);
      }
      else {
         FileWriter fwriter = new FileWriter(signOut, true);
         out = new PrintWriter(fwriter);
      }
      out.println(id);
      out.println(bookInfo);
      out.close();
      while(inputFile.hasNextLine()){
         temp = inputFile.nextLine().toLowerCase();
         if (temp.length()>= 2){
        	 if (temp.equals(bookInfo)&& countedBook == false)
        		 countedBook = true;
        	 else
        		 input += temp+"\n";
      
         }
      }
      out = new PrintWriter(file);
      out.println(input);
      out.close();
   }
   public static boolean correctPassword(String id, String password) throws IOException{ // Used to check if id and password are correct
      File user = new File(userInformation);
      Scanner inputFile = new Scanner(user);
      String compaire;
      if (!user.exists()){
         inputFile.close();
         return false;
      }
      else{
         while(inputFile.hasNext()){
            compaire = inputFile.next();
            if (compaire.equals(id)){
               compaire = inputFile.next();
               if (compaire.equals(password)){
                  inputFile.close();
                  return true;
               }
            }
         }
         inputFile.close();
         return false;
      }      
   }
   public static int available(String book) throws IOException{ // returns number of books available
      File file = new File(books);
      Scanner inputFile = new Scanner(file);
      int counter = 0;
      String input;
      book = book.toLowerCase();
      while (inputFile.hasNextLine()){
    	  	 input = inputFile.nextLine().toLowerCase();
         if (input.equals(book)){
            counter ++;
         }
      }
      inputFile.close();
      return counter;
   }
   public static void addBook(String book) throws IOException{ //  adds books to the book file
      File file = new File(books);
      PrintWriter out;
      if (!file.exists()){
         out = new PrintWriter(file);
      }
      else {
         FileWriter fwriter = new FileWriter(file, true);
         out = new PrintWriter(fwriter);
      }
      out.println(book);
      out.close();
      
   }
   public static String getBooks(String id) throws IOException{ // Returns each book out on different line
      File file = new File(signOutFile);
      Scanner inputFile = new Scanner(file);
      String compaire = "";
      String books = "";
      if (!file.exists()){
         inputFile.close();
         return "No books signed out";
      }
      else{
         while(inputFile.hasNextLine()){
            compaire = inputFile.nextLine();
            if (compaire.equals(id)){
               compaire = inputFile.nextLine();
               books += compaire+"\n";
            }
         }
         inputFile.close();
         if (books.length() >= 1)
        	 return books;
         else
        	 return id+" has no books signed out";
   }

   }
   public static String getBookRequests() throws IOException{  // returns id then request per line
      File file = new File(requestFile);
      Scanner inputFile = new Scanner(file);
      String books = "";
      if (!file.exists()){
         inputFile.close();
         return "No books are currently requested";
      }
      else{
         while (inputFile.hasNextLine()){
            books += inputFile.nextLine();
            books += " requested:"+inputFile.nextLine()+"\n";
         }
      }
      inputFile.close();
      return books;
   }
   
   
}