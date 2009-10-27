package org.springframework.web.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.core.NestedExceptionUtils;

public class NestedServletExceptionTests {

	@Test
	public void testNestedServletExceptionString() {
		NestedServletException exception = new NestedServletException("foo");
		assertEquals("foo", exception.getMessage());
	}

	@Test
	public void testNestedServletExceptionStringThrowable() {
		Throwable cause = new RuntimeException();
		NestedServletException exception = new NestedServletException("foo", cause);
		assertEquals(NestedExceptionUtils.buildMessage("foo", cause), exception.getMessage());
		assertEquals(cause, exception.getCause());
	}

}
