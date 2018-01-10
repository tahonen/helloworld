package com.redhat.emeatigers.ocp.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloRepoTest {
	@InjectMocks
	private HelloRepo helloRepo;

	@Test
	// TODO: comment out to make the test run

	public void list() {
		String[] hellos = helloRepo.list();
		assertEquals(20, hellos.length);

	}
}
