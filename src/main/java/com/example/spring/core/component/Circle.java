package com.example.spring.core.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle {
	@Autowired
	private Point centre;
	@Autowired
	private MessageSource messageSource;

	/**
	 * @param messageSource
	 *            the messageSource to set
	 */
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * @param center
	 *            the center to set
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Greeting", null));
	}

}
