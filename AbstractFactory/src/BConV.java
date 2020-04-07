public class BConV implements BFruitAndVegetables {

    public Vegetables CreateV(){
        return new Tomato();
    }

	@Override
	public Fruit CreateF() {
		// TODO Auto-generated method stub
		return null;
	}

}
