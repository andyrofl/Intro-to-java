/**
 * Author: andy pacher
 * Date: Feb 15th, 2011
 * Assignment: GuidedTour.java
 * GitHub Note: the assignment was to print (& format) my class schedule
 */

public class GuidedTour {
	public static void main(String[] args) {
		System.out.format("%4s %-13s %-10s %4s", "SET", "COURSE", "TEACHER", "ROOM");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "1", "Study Skills", "Tai", "42");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "2", "Phys Ed", "Clark", "GYM");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "3", "Transport Sys", "Lucania", "119");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "4A", "Study Hall", "Billings", "129");
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "4B", "Lunch", "Lunch Lady", "Cafe");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "5", "US History", "Corrivoo", "67");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "6", "Trig Func", "Mahoney", "209");
		System.out.println();
		System.out.println();
		System.out.format("%4s %-13s %-10s %4s", "7", "Java", "Miller", "56");
		System.out.println();
		/**SET COURSE        TEACHER    ROOM
          *
          *1 Study Skills  Tai          42
          *
          *2 Phys Ed       Clark       GYM
          *
          *3 Transport Sys Lucania     119
          *
          *4A Study Hall   Billings    129
          *4B Lunch        Lunch Lady Cafe
          *
          *5 US History    Corrivoo     67
          *
          *6 Trig Func     Mahoney     209
          *
          *7 Java          Miller       56 
		 */
	}
}
