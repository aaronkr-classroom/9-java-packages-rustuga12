package com.section05;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		System.out.println("현재 날짜: " + today);
		
		String dateToStr = 
				DateFormat
				.getInstance()
				.format(today);
		
		// #1
		dateToStr = DateFormat
				.getDateInstance().format(today);
		
		System.out.println(
				"DateFormat.getInstance(): " + dateToStr);
		
		
		
		// #2
		dateToStr = DateFormat
				.getDateInstance().format(today);
		
		System.out.println(
				"DateFormat.getInstance(): " + dateToStr);
		
		
		// #3
		dateToStr = DateFormat
				.getDateInstance().format(today);
		
		System.out.println(
				"DateFormat.getInstance(): " + dateToStr);
		
		// #4 
		dateToStr = DateFormat
				.getDateTimeInstance().format(today);
		
		System.out.println(
				"DateFormat.getDateTimeInstance(): " + dateToStr);
		
		// #5
		dateToStr = DateFormat
				.getTimeInstance(DateFormat.MEDIUM)
				.format(today);
		
		System.out.println(
				"DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
		// #6
		dateToStr = DateFormat
				.getTimeInstance(DateFormat.MEDIUM)
				.format(today);
		
		System.out.println(
				"DateFormat.getInstance(): " + dateToStr);
		
		// SimpleDateFormat
		// #1
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = formatter.format(date);
		System.out.println("yyyy/MM/dd : "  + strDate);
		
		// #2 
		formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("yyyy-MM-dd hh:mm:ss : "  + strDate);
		
		// #3
		formatter = new SimpleDateFormat("dd MMMM yy");
		strDate = formatter.format(date);
		System.out.println("dd MMMM yy : "  + strDate);
		
		// #4
		formatter = new SimpleDateFormat("dd M yy zzzz");
		strDate = formatter.format(date);
		System.out.println("dd M yy zzzz : "  + strDate);
		
	}

}
