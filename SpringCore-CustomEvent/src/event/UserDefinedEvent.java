package event;

import org.springframework.context.ApplicationEvent;

public class UserDefinedEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -542091376812660544L;
	/**
	 * 
	 */

	public UserDefinedEvent(Object source) {
		super(source);
		System.out.println(source);
	}
	@Override
	public String toString() {
		return "user defined event";
	}

}
