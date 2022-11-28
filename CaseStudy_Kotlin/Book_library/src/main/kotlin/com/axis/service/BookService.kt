package com.axis.service

import com.axis.modal.BookModal
import com.axis.util.BookUtil
import java.util.Scanner
class BookService {
    val bookUtil=BookUtil()
    val scanner=Scanner(System.`in`)
    fun addingBooks(book:BookModal){
        bookUtil.storingBooks(book)
    }
    fun insertion(book:BookModal){
        bookUtil.insertingBook(book)
    }
    fun deletionByTitle(title:String){
        bookUtil.deleteByTitile(title)
    }
    fun deletionByAuthor(author:String){
        bookUtil.deleteByAuthor(author)
    }
    fun deletionByCategory(category:String){
        bookUtil.deleteByCategory(category)
    }
    fun displayAllBooks(){
        bookUtil.Display()
    }
    fun updateBookByAuthor(author:String){
        bookUtil.updateByAuthor(author)
    }
    fun searchBookBytitle(title:String){
        bookUtil.searchByTitle(title)
    }
    fun searchBookByAuthor(author:String){
        bookUtil.searchByAuthor(author)
    }

}