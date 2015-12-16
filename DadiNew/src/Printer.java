
public class Printer {
public static void main(String[] args){
	MultiRoller O = new MultiRoller();
	final int rolls = 50;
	final double malus = 0;
	final int bonus = 0;
	final int faces = 20;
	Roll[] rolled = O.multiRoller(rolls, bonus, malus, faces);
	
	for(int i=0; i<rolls;i++ ){
		System.out.println(rolled[i].getTotal()+"     "+rolled[i].getPure());
	}
	
	
}
}
