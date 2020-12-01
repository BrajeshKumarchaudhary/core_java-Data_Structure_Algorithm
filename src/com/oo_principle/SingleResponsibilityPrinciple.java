package com.oo_principle;

/**
 * @author brajesh
 *
 *According to single responsbility principle only one reason to change the functionality of any class.
 *It means that a class should have one task to do.
 */
public class SingleResponsibilityPrinciple {

}
class Book{
	private String bookName;
	private String bookAuthorName;
	private String bookPrice;
	private String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthorName() {
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public String replaceWordInText(String word) {
		return this.text.replaceAll(word, text);
	}
	
	public boolean isWordAvailable(String word) {
		return this.text.contains(word);
	}
	
	
	/**
	 *This Functionality in wrong place this class is responsible only for book related operations.
	 *for This Create Another Class BookPriniter which is contain all the printer related info. 
	 */
	public void printTextToConsole() {
		
	}
}