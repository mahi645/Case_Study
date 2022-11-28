package com.axis.util

import com.axis.dbConnection.DbConnection
import com.axis.modal.BookModal

class BookUtil {
    //var bookModal=BookModal()
    //insertion
    val dbConnection=DbConnection()
    val connection=dbConnection.connect()


    fun storingBooks(book:BookModal){
        //var statement=connection.prepareStatement("insert into book values('B123','You can win','Shiv khera','Science',500f,5);")
        //statement.executeUpdate()
        var statement=connection.prepareStatement("insert into book values(?,?,?,?,?,?);")
        var bookID=statement.setString(1,book.bookID)
        var title=statement.setString(2,book.title)
        var author=statement.setString(3,book.author)
        var category=statement.setString(4,book.category)
        var price=statement.setInt(5,book.price)
        var itemsCount=statement.setInt(6,book.itemsCount)
        val res=statement.executeUpdate()
    }
    fun insertingBook(book:BookModal){
        var statement=connection.prepareStatement("insert into book values(?,?,?,?,?,?);")
        var bookID=statement.setString(1,book.bookID)
        var title=statement.setString(2,book.title)
        var author=statement.setString(3,book.author)
        var category=statement.setString(4,book.category)
        var price=statement.setInt(5,book.price)
        var itemsCount=statement.setInt(6,book.itemsCount)
        val res=statement.executeUpdate()
        if(res>0){
            println("book inserted successfully")
        }
        else{
            println("book insertion failed")
        }

    }
    fun deleteByAuthor(author:String){
        val statement=connection.prepareStatement("delete from book where author=author")
        val res=statement.executeUpdate()
        if(res>0){
            println("$res books deleted")
        }
        else{
            println("book not found to delete")
        }
    }
    fun deleteByTitile(title:String){
        val statement=connection.prepareStatement("delete from book where title=title")
        val res=statement.executeUpdate()
        if(res>0){
            println("$res books deleted")
        }
        else{
            println("book not found to delete")
        }
    }
    fun deleteByCategory(category:String){
        val statement=connection.prepareStatement("delete from book where category=category")
        val res=statement.executeUpdate()
        if(res>0){
            println("$res books deleted")
        }
        else{
            println("book not found to delete")
        }
    }
    fun Display(){
        val statement=connection.prepareStatement("select *from book ")
        val res=statement.executeQuery()
        val book= mutableListOf<BookModal>()
        while (res.next()){
            val bookID=res.getString("bookID")
            val title=res.getString("title")
            val author=res.getString("author")
            val category=res.getString("category")
            val price=res.getInt("price")
            val itemsCount=res.getInt("itemsCount")
            book.add(BookModal(bookID,title,author,category,price,itemsCount))
        }
        for (book1 in book){
            println(book1)
        }
    }

    fun updateByAuthor(author:String){
        val statement=connection.prepareStatement("update book where author=author")
        val res=statement.executeUpdate()
        if(res>0){
            println("$res rows updated")
        }
        else{
            println("data not found to update")
        }
    }
    fun searchByAuthor(author:String){
        val statement=connection.prepareStatement("select *from book where author=author")
        val res=statement.executeQuery()

    }
    fun searchByTitle(title:String) {
        val statement=connection.prepareStatement("select *from book where title=title")
        val res=statement.executeQuery()
    }
}