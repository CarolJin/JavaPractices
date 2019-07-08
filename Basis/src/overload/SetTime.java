package overload;

public class SetTime {
	private int hour;
	private int minute;
	private int second;
	
	public SetTime(){
		this(0,0,0);
	}
	public SetTime(int h){
		this(h,0,0);
	}
	public SetTime(int h, int m){
		this(h,m,0);
	}
	public SetTime(int h, int m, int s){
		SetTimeByInputs(h,m,s);
	}
	private void SetTimeByInputs(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	private void setSecond(int s) {
		second = (s>0 && s<60) ? s : 0;
	}
	private void setMinute(int m) {
		minute = (m>0 && m<60) ? m : 0;	
	}
	private void setHour(int h) {
		hour = (h>0 && h<24) ? h : 0;
	}	
	
	private int getSecond() {
		return second;
	}
	private int  getMinute() {
		return minute;	
	}
	private int getHour() {
		return hour;
	}
	
	public String toMilitaryTime(){
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	
	public String toRegularTime(){
		getHour();
		getMinute();
		getSecond();
		return String.format("%d:%02d:%02d %s", (hour==0||hour==12)?12:(hour%12), minute, second, (hour<12)? "AM":"PM");
	}
}
