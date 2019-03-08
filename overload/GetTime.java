package overload;

public class GetTime {

	public static void main(String[] args) {
		SetTime setTimeWith0 = new SetTime();
		SetTime setTimeWithOnlyHour = new SetTime(5);
		SetTime setTimeWithHourMinute = new SetTime(8, 34);
		SetTime setTimeWithHourMinuteSeconde = new SetTime(15, 10, 30);	
		
		System.out.printf("%s\n", setTimeWith0.toMilitaryTime());
		System.out.printf("%s\n", setTimeWithOnlyHour.toMilitaryTime());
		System.out.printf("%s\n", setTimeWithHourMinute.toMilitaryTime());
		System.out.printf("%s\n", setTimeWithHourMinuteSeconde.toRegularTime());
	}
}
