package Lesson9_DateManip;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.ValueRange;

public class dateManipEx {

	public static void LocalDateEx1() {
		
		LocalDate date = LocalDate.now();
		LocalDate yesterdayDate = date.minusDays(1);
		LocalDate tomorrowDate = date.plusDays(2);
		
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + date);
		System.out.println("Tomorrow date: " + date);
		
		
	}
	
	public static void LocalDateEx2() {
		
		LocalDate date = LocalDate.of(2017,1, 13);
		LocalDate date2 = LocalDate.of(2016, 9, 23);
		
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + date2);
		
		// Check for leap year
		System.out.println(date.isLeapYear());
		System.out.println(date2.isLeapYear());
		
	}
	
	public static void LocalDateEx3() {
		
		LocalDate date = LocalDate.of(2017, 1, 13);
		LocalDateTime datetime = date.atTime(1,50,9);
		System.out.println(datetime);
		
	}
	
	public static void LocalDateEx4() {
		 // Converting LocalDate to String  
        // Example 1  
        LocalDate d1 = LocalDate.now();  
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date1 in string :  " + d1Str);  
        // Example 2  
        LocalDate d2 = LocalDate.of(2002, 05, 01);  
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date2 in string :  " + d2Str);  
        // Example 3  
        LocalDate d3 = LocalDate.of(2016, 11, 01);  
        String d3Str = d3.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date3 in string :  " + d3Str);  
	}
	
	public static void LocalDateEx5() {
	     // Example 1  
        String dInStr = "2011-09-01";  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
        // Example 2  
        String dInStr2 = "2015-11-20";  
        LocalDate d2 = LocalDate.parse(dInStr2);  
        System.out.println("String to LocalDate : " + d2);    
	}
	
	public static void LocalTimeEx1() {
		 LocalTime time = LocalTime.now();  
		    System.out.println(time);  
		
		
	}
	
	public static void LocalTimeEx2() {
		
		LocalTime time = LocalTime.of(10,43,12);  
	    System.out.println(time);  
		
	}
	
	public static void LocalTimeEx3() {
		
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);  
		
	}
	
	public static void LocalTimeEx4() {
		
		LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1);  
	    LocalTime time2=time1.plusHours(4);  
	    LocalTime time3=time2.plusMinutes(18);  
	    System.out.println(time3);  
		
	}
	
	public static void LocalTimeEx5() {
		
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1);  
	    LocalTime time2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time2);  
	    long hours = ChronoUnit.HOURS.between(time1, time2);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time1, time2);  
	    System.out.println("Minutes between two time zone: "+minutes);  
		
	}
	
	public static void LocalDateTimeEx1() {
		 LocalDateTime now = LocalDateTime.now();  
	     System.out.println("Before Formatting: " + now);  
	     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	     String formatDateTime = now.format(format);  
	     System.out.println("After Formatting: " + formatDateTime);  
	}
	
	public static void LocalDateTimeEx2() {
		LocalDateTime datetime1 = LocalDateTime.now();  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatDateTime = datetime1.format(format);   
	    System.out.println(formatDateTime); 
	}
	
	public static void LocalDateTimeEx3() {
		 LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);    
		 System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
		 System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
		 System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
		 System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
		 System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
	}
	
	public static void LocalDateTimeEx4() {
		LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
		LocalDateTime datetime2 = datetime1.minusDays(100);  
		System.out.println("Before Formatting: " + datetime2);  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
		String formatDateTime = datetime2.format(format);   
		System.out.println("After Formatting: " + formatDateTime );  
	}
	
	public static void LocalDateTimeEx5() {
		LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
		  LocalDateTime datetime2 = datetime1.plusDays(120);  
		  System.out.println("Before Formatting: " + datetime2);  
		  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
		  String formatDateTime = datetime2.format(format);   
		  System.out.println("After Formatting: " + formatDateTime );  
	}
	

	
	public static void MonthDayEx1() {
		MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(1994);  
	    System.out.println(date);  
	}
	
	public static void MonthDayEx2() {
		MonthDay month = MonthDay.now();  
	    boolean b = month.isValidYear(2012);  
	    System.out.println(b);  
	}
	
	public static void MonthDayEx3() {
		MonthDay month = MonthDay.now();  
	    long n = month.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(n);  
	}
	
	public static void MonthDayEx4() {
		MonthDay month = MonthDay.now();  
	    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(r1);  
	    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
	    System.out.println(r2);  
	}
	

	
	public static void OffsetTime1() {
		OffsetTime offset = OffsetTime.now();  
	    int h = offset.get(ChronoField.HOUR_OF_DAY);  
	    System.out.println(h);  
	    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
	    System.out.println(m);  
	    int s = offset.get(ChronoField.SECOND_OF_DAY);  
	    System.out.println(s);  
	}
	
	public static void OffsetTime2() {
		OffsetTime offset = OffsetTime.now();  
	    int h = offset.getHour();  
	    System.out.println(h+ " hour");  
	}
	
	public static void OffsetTime3() {
		OffsetTime offset = OffsetTime.now();  
	    int m = offset.getMinute();  
	    System.out.println(m+ " minute");  
	}
	
	public static void OffsetTime4() {
		OffsetTime offset = OffsetTime.now();  
	    int s = offset.getSecond();  
	    System.out.println(s+ " second");  
	}
	

	public static void OffsetDateTime1() {
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());  
	}
	
	public static void OffsetDateTime2() {
		 OffsetDateTime offsetDT = OffsetDateTime.now();  
	        System.out.println(offsetDT.getDayOfYear());  
	}
	
	public static void OffsetDateTime3() {
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfWeek());  
	}
	
	public static void OffsetDateTime4() {
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.toLocalDate());  
	}
	
	public static void OffsetDateTime5() {
		OffsetDateTime offset = OffsetDateTime.now();  
	    OffsetDateTime value =  offset.minusDays(240);  
	    System.out.println(value);  
	}
	
	public static void OffsetDateTime6() {
		OffsetDateTime offset = OffsetDateTime.now();  
	    OffsetDateTime value =  offset.plusDays(240);  
	    System.out.println(value);   
	}
	
	public static void ClockEx1() {
		Clock c = Clock.systemDefaultZone();      
	    System.out.println(c.getZone());  
	}
	
	public static void ClockEx2() {
		 Clock c = Clock.systemUTC();  
		    System.out.println(c.instant());
	}
	
	public static void ClockEx3() {
		Clock c = Clock.systemUTC();  
	    System.out.println(c.instant());  
	}
	
	public static void ClockEx4() {
		Clock c = Clock.systemUTC();  
	    Duration d = Duration.ofHours(5);  
	    Clock clock = Clock.offset(c, d);    
	    System.out.println(clock.instant());  
	}
	

	
	public static void ZonedDateTimeEx1() {
		ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
	    System.out.println(zone);  
	}
	
	
	public static void ZonedDateTimeEx2() {
		 LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
		    ZoneId  india = ZoneId.of("Asia/Kolkata");   
		    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
		    System.out.println("In India Central Time Zone: " + zone1);  
		    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
		    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
		    System.out.println("In Tokyo Central Time Zone:"  + zone2);  
	}
	
	
	public static void ZonedDateTimeEx3() {
		 ZonedDateTime zone =ZonedDateTime.now();  
		    System.out.println(zone.getZone());  
	}
	
	
	public static void ZonedDateTimeEx4() {
		ZonedDateTime zone= ZonedDateTime.now();  
	    ZonedDateTime m = zone.minus(Period.ofDays(126));  
	    System.out.println(m); 
	    
	    ZonedDateTime zone2= ZonedDateTime.now();  
	    ZonedDateTime p = zone2.plus(Period.ofDays(126));  
	    System.out.println(p); 
	    
	    ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println(id1);  
	    System.out.println(id2);  
	    System.out.println(id1.isBefore(id2));    
	    
	    ZoneId zone3 = ZoneId.systemDefault();     
	    System.out.println(zone3);  
	}
	
	public static void ZoneOffsetEx1() {
		 ZoneOffset zone = ZoneOffset.UTC;  
		    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
		    System.out.println(temp);  
	}
	
	public static void ZoneOffsetEx2() {
		ZoneOffset zone = ZoneOffset.ofHours(5);  
	    System.out.println(zone);  
	}
	
	public static void ZoneOffsetEx3() {
		ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);  
	    System.out.println(zone);  
	}
	
	public static void ZoneOffsetEx4() {
		ZoneOffset zone = ZoneOffset.UTC;  
	    boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);  
	    System.out.println(b1);  
	    boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);  
	    System.out.println(b2);  
	}
	
	public static void YearEx1() {
	    Year y = Year.now();  
	    System.out.println(y);  
	}
	
	public static void YearEx2() {
	    Year y = Year.of(2017);  
	    LocalDate l = y.atDay(123);  
	    System.out.println(l); 
	}
	
	public static void YearEx3() {
		
	}
	
	public static void YearEx4() {
		
	}
	
	public static void YearEx5() {
		
	}
	
	public static void YearMonth() {
		
	}
	
	public static void PeriodEx() {
		
	}
	
	public static void DurationEx() {
		
	}
	
	public static void DateEx() {
		
	}
	
	public static void CalendarEx() {
		
	}
	
	public static void DateFormatEx() {
		
	}
	
	public static void SimpleDateFormatEx() {
		
	}
	
}
