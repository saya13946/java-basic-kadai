package text.kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//コンストラクタ(初期化処理)
	public Car_Chapter15(int gear) {
		this.gear = gear;
	}
	

	public void changeGear(int afterGear) {
		
		this.gear = afterGear;
		this.speed = switch(afterGear) {
			case 1 -> 10; 
			case 2 -> 20; 
			case 3 -> 30; 
			case 4 -> 40; 
			case 5 -> 50; 
			default -> 10;
		};
		
	}
	
	public void run() {
		System.out.println("ギア："+ this.gear);
		System.out.println("速度：時速" + this.speed + "km");
	}

}
