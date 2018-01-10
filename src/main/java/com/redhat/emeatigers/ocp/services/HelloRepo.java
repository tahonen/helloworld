package com.redhat.emeatigers.ocp.services;

public class HelloRepo {
	private static final String[] HELLOS = new String[] { "BONJOUR", "HOLA", "GUTEN TAG", "CIAO", "OLÀ", "NAMASTE",
			"SALAAM", "ZDRAS-TVUY-TE", "KONNICHIWA", "AHN-YOUNG-HA-SE-YO", "MERHABA", "SAIN BAINUU", "SALEMETSIZ BE",
			"SZIA", "MARHABA", "SALAMA ALEIKUM", "JAMBO", "NI HAU", "NAY HOH", "HALO" };

	public String[] list() {
		return HELLOS;
	}
}
