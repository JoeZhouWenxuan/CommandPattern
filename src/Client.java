/**
 * 场景类
 * @author zhou_wenxuan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//声明一个调用者
		Invoker invoker = new Invoker();
		//声明一个命令
		Command command = new ConcreteCommand();
		//设置命令
		invoker.setCommand(command);
		//执行命令
		invoker.action();
	}
}
