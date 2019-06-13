package event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UserDefinedEventPublisher implements ApplicationEventPublisherAware{
ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("UserDefinedEventPublisher : setApplicationEventPublisher");
		this.publisher = applicationEventPublisher;
	}
	public void publish () {
		System.out.println("UserDefinedEventPublisher : publish ");

		UserDefinedEvent definedEvent = new UserDefinedEvent(publisher);
		publisher.publishEvent(definedEvent);
	}

}
