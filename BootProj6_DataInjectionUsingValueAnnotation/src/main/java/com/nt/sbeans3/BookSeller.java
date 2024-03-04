package com.nt.sbeans3;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("seller")
public class BookSeller {
	@Value("${seller.name}")
	private String name;

	@Value("#{T(java.time.LocalDate).now()}")
	private LocalDate localDate;
	@Value("${seller.books}")
	private String[] books;
	@Value("#{book.javaPrice+book.springBootPrice+book.microService}")
	private Double booksPrice;

	@Override
	public String toString() {
		return "BookSeller [name=" + name + ", date=" + localDate + ", books=" + Arrays.toString(books) + ", booksPrice="
				+ booksPrice + "]";
	}
}
