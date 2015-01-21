/**
 * 具体的接收者类
 * @author zhou_wenxuan
 *
 */
public class ConcreteReceiver extends Receiver {
	/**
	 * 每个接收者都必须实现具体的业务逻辑 
	 */
	@Override
	public void dosomething() {
		System.out.println("ConcreteReceiver do something");
	}

}
