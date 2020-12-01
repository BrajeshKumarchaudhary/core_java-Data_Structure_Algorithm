package com.oo_principle;

public class OpenClosedPrinciple {

}


class BookInfo{
	private String price;
	private String author;
	private String text;
	//adding new feature that is book printer info.so by Solid Principles this is not open for modifications.
	//private String bookPrinterName;
}

class BookWithPrinterInfo extends BookInfo{
	private String bookPrinterName;
	private String bootPrinterPrice;
}
