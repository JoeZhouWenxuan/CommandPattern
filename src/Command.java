/**
 * ������
 * @author zhou_wenxuan
 *
 */
public abstract class Command {
	//����һ�����๲���ȫ�ֱ���
	protected final Receiver receiver;
	//ʵ������붨��һ��������
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	//ÿ�������඼������һ��ִ������ķ���
	public abstract void execute();
}
