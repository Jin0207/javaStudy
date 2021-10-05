class DistanceTest02 
{
	public static void main(String[] args) 
	{
		MyPoint mp = new MyPoint(1, 1);
		double result = mp.getDistance(2, 2);
		System.out.println(result);
	}
	
}
class MyPoint
{
	int x;
	int y;

	MyPoint(){}; //기본생성자

	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1){
		double result = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		return result;
	}

}

