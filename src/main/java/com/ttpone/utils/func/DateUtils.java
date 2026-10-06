package com.ttpone.utils.func;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import lombok.experimental.UtilityClass;

@UtilityClass
public  class DateUtils {

	public static final String ISO_DATE = "yyyy-MM-dd";
	public static final String ISO_DATE_TIME = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String ISO_COMPACT = "yyyyMMdd";
	public static final String VN_DATE = "dd/MM/yyyy";
	public static final String VN_DATE_TIME = "dd/MM/yyyy HH:mm:ss";
	public static final String VN_COMPACT = "ddMMyyyy";
	
	
	private DateTimeFormatter getFormatter(String pattern) {
		try {
			return DateTimeFormatter.ofPattern(pattern);
		} catch (Exception e) {
			throw new IllegalArgumentException("Date Time pattern is invalid");
		}
	}
	
	public static String formatToString(LocalDateTime ldt, Optional<String> pattern) {
		return ldt.format(getFormatter(pattern.isPresent() ? pattern.get() : ISO_COMPACT));
	}
	
	public static String formatToString(LocalDate ld, Optional<String> pattern) {
		return ld.format(getFormatter(pattern.isPresent() ? pattern.get() : ISO_COMPACT));
	}
	
	public static String getNow(boolean isOnlyDate) {
		return isOnlyDate ?
				  formatToString(LocalDate.now(), Optional.of(ISO_DATE_TIME))
				: formatToString(LocalDateTime.now(), Optional.of(ISO_DATE_TIME));
	}
	
}
