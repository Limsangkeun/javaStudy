package smartphone;

public abstract class NormalPhone implements Call, Camera, Mp3, IPhone{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" Mp3 Playing...");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" Stop Playing...");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" Taking a picture");
	}

	@Override
	public void callToSomebody() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+ " Ring RIng RIng.....");
	}

	@Override
	public void stopCalling() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" DuDuDu....");
	}
}
