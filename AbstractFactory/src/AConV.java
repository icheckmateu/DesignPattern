public class AConV implements AFruitAndVegetables {

    public Vegetables CreateV(){
        return new Cabbage();
    }

	@Override
	public Fruit CreateF() {
		// TODO Auto-generated method stub
		return null;
	}

}
