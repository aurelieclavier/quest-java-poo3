
public interface Fly {
	
	public abstract void takeOff();
	
	int ascend(int meters);
	
	int descend(int meters);
	
	public abstract void land();
	
	default void glide() {
		System.out.println("It glides into the air.	");
	}

	}
