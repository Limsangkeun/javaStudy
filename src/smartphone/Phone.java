package smartphone;

class APhone extends NormalPhone{
	
}
class BPhone extends SmartPhone{
	
}
public class Phone<E extends IPhone>{
	public void functionAll(E e) {
		if(e instanceof SmartPhone){
			System.out.println("1");
			SmartPhone p = (SmartPhone)e;
			p.callToSomebody();
			p.stopCalling();
			p.takePicture();
			p.playMusic();
			p.stopCalling();
			p.onInternetApp();
			p.offInternetApp();
		}else {
			System.out.println("2");
			NormalPhone np = (NormalPhone)e;
			np.callToSomebody();
			np.stopCalling();
			np.takePicture();
			np.playMusic();
			np.stopCalling();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone<IPhone> p = new Phone<>();
		p.functionAll(new APhone());
		Phone<IPhone> p2 = new Phone<>();
		p2.functionAll(new BPhone());
		
	}

}
