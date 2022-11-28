package com.axis.app
import com.axis.exception.InvalidBookException
import com.axis.modal.BookModal
import java.util.Scanner
import com.axis.service.BookService

fun main(){
    val scanner=Scanner(System.`in`)
    val myException= InvalidBookException("Invalid Book Exception")
    println("=======================welcome to BookStore======================")


    println("1.Adding book\t2.insert book\t3.Modify Book by Author\t4.Delete book by author\t5.Delete book by title\n6.Delete book by category\t6." +
            "7.Display all books\t8.Search book by title\t9.search book by author\t 10.exit")

    val bookService=BookService()
    while(true){
        println("enter choice: ")
        val choice=scanner.nextInt()
        when(choice){
            1->{
                println("======================Adding 3 Books========================")
                for(i:Int in 0..3 ){
                    println("enter book id: ")
                    val bookID=scanner.next()
                    if(bookID[0]!='B' && bookID.length==4){
                        throw myException
                    }
                    println("enter title: ")
                    val title=scanner.next()
                    println("enter author: ")
                    val author=scanner.next()
                    println("enter category: ")
                    val category=scanner.next()
                    if(category!="Science" || category!="Fiction" || category!="Technology" || category!="Others"){
                        throw myException
                    }
                    println("enter price: ")
                    val price=scanner.nextInt()
                    if(price<0){
                        throw myException
                    }
                    println("enter itemsCount: ")
                    val itemsCount=scanner.nextInt()
                    val book=BookModal(bookID,title, author, category, price, itemsCount)



                    bookService.addingBooks(book)

                }
            }
            2->{
                println("=========================insertion========================")
                println("enter book id: ")
                val bookID=scanner.next()
                if(bookID[0]!='B' && bookID.length==4){
                    throw myException
                }
                println("enter title: ")
                val title=scanner.next()
                println("enter author: ")
                val author=scanner.next()
                println("enter category: ")
                val category=scanner.next()
                if(category!="Science" || category!="Fiction" || category!="Technology" || category!="Others"){
                    throw myException
                }
                println("enter price: ")
                val price=scanner.nextInt()
                if(price<0){
                    throw myException
                }
                println("enter itemsCount: ")
                val itemsCount=scanner.nextInt()
                val book=BookModal(bookID,title, author, category, price, itemsCount)
                bookService.insertion(book)

            }
            3->{
                println("================Modify Book By Author==============")
                println("enter author name: ")
                val author=scanner.next()
                bookService.updateBookByAuthor(author)

            }
            4->{
                println("=====================Delete book by author===================")
                println("enter author name: ")
                val author=scanner.next()
                bookService.deletionByAuthor(author)

            }
            5->{
                println("====================Delete book by title===================")
                println("enter title: ")
                val title=scanner.next()
                bookService.deletionByTitle(title)
            }
            6->{
                println("====================Delete book by category==================")
                println("enter category: ")
                val category=scanner.next()
                if(category!="Science" || category!="Fiction" || category!="Technology" || category!="Others"){
                    throw myException
                }
                bookService.deletionByCategory(category)
            }
            7->{
                println("===========================Display all books=================")
                bookService.displayAllBooks()
            }
            8->{
                println("======================Search book by title===================")
                println("enter title: ")
                val title=scanner.next()
                bookService.searchBookBytitle(title)
            }
            9->{
                println("===================search book by author====================")
                println("enter title: ")
                val author=scanner.next()
                bookService.searchBookByAuthor(author)
            }
            10->{
                println("Program ends")
                System.exit(0)
            }
        }
    }
}