
public class Exercise10_01 {

	public static void main(String[] args) {
		Time t = new Time();
		System.out.println("h:m:s from current time is "+ t.getHour() +":"+ t.getMinute() +":"+ t.getSecond());
		
		Time t2 = new Time(555550000);
		System.out.println("h:m:s from the second constructor is "+t2.getHour() +":"+ t2.getMinute() +":"+ t2.getSecond());
		//System.out.print(t2.getHour() +":"+ t2.getMinute() +":"+ t2.getSecond() + " ");
		
		Time t3 = new Time(5, 23, 55);
		System.out.println("h:m:s from the third constructor is "+t3.getHour() +":"+ t3.getMinute() +":"+ t3.getSecond());
		//System.out.print(t3.getHour() +":"+ t3.getMinute() +":"+ t3.getSecond());

	}

}
