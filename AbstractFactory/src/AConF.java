public class AConF implements AFruitAndVegetables {

    public Fruit CreateF(){
        return new Apple();
    }

	@Override
	public Vegetables CreateV() {
		// TODO Auto-generated method stub
		return null;
	}

}
