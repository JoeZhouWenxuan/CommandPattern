/**
 * ������
 * @author zhou_wenxuan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ��������
		Invoker invoker = new Invoker();
		//����һ������
		Command command = new ConcreteCommand();
		//��������
		invoker.setCommand(command);
		//ִ������
		invoker.action();
	}
}
