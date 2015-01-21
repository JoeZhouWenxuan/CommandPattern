/**
 * 调用者类
 * @author zhou_wenxuan
 *
 */
public class Invoker {
	private Command command;
	/**
	 * 接收命令
	 * @param command
	 */
	public void setCommand(Command command){
		this.command = command;
	}
	/**
	 * 执行命令
	 */
	public void action(){
		this.command.execute();
	}
}
