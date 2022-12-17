package BusResev;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the Passenger ");
		passengerName = sc.nextLine();
		System.out.println("Enter BusNo : ");
		busNo = sc.nextInt();
		System.out.println("Enter the date in dd-mm-yyy formate");
		String dateInput = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateInput);
		
		try {
		date = dateFormat.parse(dateInput);
		}catch (ParseException e){
			e.printStackTrace();
		}
		}
		
		public boolean isAvailable() throws SQLException {
			
			BusDAO busdao = new BusDAO();
			BookingDAO bookingdao = new BookingDAO();
			int capacity = busdao.getCapacity(busNo);
			
			int booked = bookingdao.getBookedCount(busNo, date);
			
			
			
			return booked < capacity ? true : false;
		}
	}

