package com.book;
import com.book.exception.*;
import java.util.*;

//class MyException extends Exception {
//	MyException(String s){
//		super(s);
//		System.out.println(s);
//	}
//}
public class Book {
	
	private String bookID;
	
	private String title;
	private String author;
	private String category;
	private int price;
	
		
	
	//String bookArray[];
	//String[] bookArray =new bookArray[100];
	ArrayList<String> bookArray = new ArrayList<>();
	ArrayList<String> book_author = new ArrayList<>();
	ArrayList<String> book_title = new ArrayList<>();
	ArrayList<String> book_category = new ArrayList<>();
	ArrayList<Integer> book_price = new ArrayList<Integer>();
	public String getBookID() {
		return bookID;
	}
    public void setBookID(String bookID) {
    	try {
    		if((bookID.charAt(0)!='B') || (bookID.length()<4)) {
    		//String s111="invalid";
    			throw new MyException("invalid ");
    		}
    	
    	}
    	catch(MyException e) {
    		System.out.println();
    	}
    	this.bookID=bookID;
	}
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		
		this.title=title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		try {
			if(category!="Science" || category!="Technology" || category!="Fiction" || category!="Others")
			{ 
				String str="InvalidBookException";
				throw new MyException(str);
			}
		}
		catch(MyException str) {
			System.out.println(str);
		}
		this.category=category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		try {
			
		
			if(price<0) {
				throw new MyException("InvalidBookException");
			}
		}
		catch(MyException e) {
			
		}
		this.price=price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
		
	}
	void method() {
		class BookStore{
			void addBook() {
			//bookID=b.bookID;
				Scanner sc1=new Scanner(System.in);
				System.out.println("add bookID: ");
				String title1=sc1.nextLine();
				bookArray.add(title1);
				
				System.out.println("add book title: ");
				String title2=sc1.nextLine();
				book_title.add(title2);
				
				System.out.println("add book author: ");
				String title3=sc1.nextLine();
				book_author.add(title3);
				
				System.out.println("add bookcategory: ");
				String title4=sc1.nextLine();
				book_category.add(title4);
				
				System.out.println("add price: ");
				int title5=sc1.nextInt();
				book_price.add(title5);
				System.out.println();
				
			}
			void searchByTitle() {
				Scanner ss12=new Scanner(System.in);
				System.out.println("enter the title to search:  ");
				String text4=ss12.nextLine();
				int x=book_title.size();
				System.out.println(x);
				System.out.println(book_title.get(0));
				
				for(String c:book_title) {
					if(c.equals(text4)) {
						//int inde=book_price.indexOf("title");
						System.out.println("anyushj");
						int i4=book_title.indexOf(text4);
						System.out.println("bookID= "+bookArray.get(i4)+"\t title= "+book_title.get(i4)+"\t author"+book_author.get(i4)+"\t category= "+book_category.get(i4)+"\t price= "+book_price.get(i4));
					}
				}
				
			}
		
			void searchByAuthor() {
				Scanner s5=new Scanner(System.in);
				System.out.println("enter the author name: ");
				String t=s5.nextLine();
				int y=book_title.size();
				
				for(String f:book_author) 
				{
					if(f.equals(t)) {
					//int inde=book_price.indexOf("title");
						int m=book_author.indexOf(t);
						System.out.println("bookID= "+bookArray.get(m)+"\t title= "+book_title.get(m)+"\t author"+book_author.get(m)+"\t category= "+book_category.get(m)+"\t price= "+book_price.get(m));
					}
				}	
			
			}
		
			void modify() {
				
				Scanner ssc=new Scanner(System.in); 
				System.out.println("enter  book title name to modify: ");
				String s1=ssc.nextLine();
				int i1=book_title.indexOf(s1);
				
				System.out.println("modify book title: ");
				String s7=ssc.nextLine();
				System.out.println(i1);
				book_title.set(i1,s7);
				
				System.out.println("modify book author: ");
				String s2=ssc.nextLine();
				book_author.set(i1,s2);
				System.out.println("modify book category: ");
				String s3=ssc.nextLine();
				book_category.set(i1,s3);
				System.out.println("modify price: ");
				int s4=ssc.nextInt();
				book_price.set(i1,s4);
				System.out.println("bookID= "+bookArray.get(i1)+"\t title= "+book_title.get(i1)+"\t author"+book_author.get(i1)+"\t category= "+book_category.get(i1)+"\t price= "+book_price.get(i1));
				ssc.close();
			}
			void dell() {
				System.out.println("enter the delete book title: ");
				//String text2=sssc.nextLine();
				Scanner sc4=new Scanner(System.in);
				String ss=sc4.nextLine();
				int i2=book_title.indexOf(ss);
				System.out.println(i2);
				System.out.println(bookArray.get(i2));
				bookArray.remove(i2);
				book_title.remove(i2);
				book_author.remove(i2);
				book_category.remove(i2);
				book_price.remove(i2);
				int h1=book_title.size();
				for (int g1=0;g1<h1;g1++) {
					System.out.println("bookID= "+bookArray.get(g1)+"\t title= "+book_title.get(g1)+"\t author"+book_author.get(g1)+"\t category= "+book_category.get(g1)+"\t price= "+book_price.get(g1));
				}
				System.out.println(bookArray);
			}
			void disp_sin() {
				System.out.println("enter the display single book by title: ");
				Scanner s22=new Scanner(System.in);
				String sss=s22.nextLine();
				int i3=book_title.indexOf(sss);
				System.out.println(i3);
				System.out.println("bookID= "+bookArray.get(i3)+"\t title= "+book_title.get(i3)+"\t author"+book_author.get(i3)+"\t category= "+book_category.get(i3)+"\t price= "+book_price.get(i3));
			}
			void all_disp() {
				int h=book_title.size();
				for (int g=0;g<h;g++) {
					System.out.println("bookID= "+bookArray.get(g)+"\t title= "+book_title.get(g)+"\t author"+book_author.get(g)+"\t category= "+book_category.get(g)+"\t price= "+book_price.get(g));
				}
			}
				
		}
		BookStore n=new BookStore();
		//n.addBook();
		Scanner sssc=new Scanner(System.in);
		System.out.println("enter 1.Adding \t 2.modify \t 3.delete \t 4.display all \t 5.display specific \t 6.search book by title \t 7.search book by author ");
		int kkk=sssc.nextInt();
		switch(kkk) {
		
		case 1:
			n.addBook();
			break;
		case 2:
			
			n.modify();
			break;
		case 3:
			//System.out.println("enter the delete book title: ");
			//String text2=sssc.nextLine();
			n.dell();
			break;
		case 4:
			n.all_disp();
			break;
		case 5:
			
			//String text3=sssc.nextLine();
			n.disp_sin();
			break;
		case 6:
			
			n.searchByTitle();
			break;
		case 7:
			
			
			n.searchByAuthor();
			break;
		}
		//n.searchByTitle("uma");
		//n.searchByAuthor("amm");
		//n.modify("uma");
		//n.dell("uma");
		//n.disp_sin("uma");
		//n.all_disp();
		
		
	}
	public  void main() {
		
		Book b2=new Book();
		for (int i=0;i<2;i++) {
			//Book b=new Book();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter book Id: ");
			b2.bookID=sc.nextLine();
			b2.setBookID(b2.bookID);
			b2.bookArray.add(b2.bookID);
				//System.out.println(bookArray);
			System.out.println("enter book title: ");
			b2.title=sc.nextLine();
			b2.setTitle(b2.title);
			b2.book_title.add(b2.title);
				
			System.out.println("enter book author: ");
			b2.author=sc.nextLine();
			b2.setAuthor(b2.author);
			b2.book_author.add(b2.author);
				
			System.out.println("enter book category: ");
			b2.category=sc.nextLine();
			b2.setCategory(b2.category);
			b2.book_category.add(b2.category);
				
			System.out.println("enter book price: ");
			b2.price=sc.nextInt();
			b2.setPrice(b2.price);
			b2.book_price.add(b2.price);
			//sc.close();
		}
		b2.method();
		
		//System.out.println(b2.book_price);
		//System.out.println(b2.book_author);
		
	}
}
