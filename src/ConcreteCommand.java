
/**
 * �����������
 * @author zhou_wenxuan
 *
 */
public class ConcreteCommand extends Command {
	//�����Լ���Ĭ�Ͻ�����
	public ConcreteCommand() {
		super(new ConcreteReceiver());
	}
	//�����µĽ�����
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}
	/**
	 * ÿ�������������ʵ��һ������
	 */
	@Override
	public void execute() {
		//�����ҵ���߼�
		super.receiver.dosomething();
	}

}
