package br.rafaelri.modelmapper.destination;

import org.modelmapper.Provider;

public class ProviderTopLevel implements Provider<TopLevelDestination> {

	public TopLevelDestination get(
			ProvisionRequest<TopLevelDestination> request) {
		System.out.println("aaaa");
		//nothing really fancy here although real system loads from JPA
		return new TopLevelDestination();
	}

}
