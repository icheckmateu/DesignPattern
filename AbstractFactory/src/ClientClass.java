
public class ClientClass {

	public static void main(String[] args) {
		AConF af=new AConF();
		BConV bv=new BConV();
		Fruit fruit = af.CreateF();
		Vegetables vegetables=bv.CreateV();
		fruit.eat();
		vegetables.eat();
	}
	
}
