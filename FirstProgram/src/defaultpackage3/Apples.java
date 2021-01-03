package defaultpackage3;
//polymorphic array
public class Apples  {
public static void main(String[] args) {
	Food bucky[] = new Food[2];
	bucky[0] = new Potpie();
	bucky[1] = new Tuna();
	for(int x=0;x<2;++x) {
		bucky[x].eat();
	}
	
	//instead of 
//	Food  tuna = new Tuna();
//	tuna.eat();
//	Food potPie =  new Potpie();
//	potPie.eat();
	
}
}
