
/**
 * 具体的命令类
 * @author zhou_wenxuan
 *
 */
public class ConcreteCommand extends Command {
	//声明自己的默认接收者
	public ConcreteCommand() {
		super(new ConcreteReceiver());
	}
	//设置新的接收者
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}
	/**
	 * 每个具体命令都必须实现一个命令
	 */
	@Override
	public void execute() {
		//具体的业务逻辑
		super.receiver.dosomething();
	}

}
