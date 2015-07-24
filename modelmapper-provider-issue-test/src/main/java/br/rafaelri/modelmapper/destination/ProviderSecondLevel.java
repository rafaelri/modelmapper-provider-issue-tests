package br.rafaelri.modelmapper.destination;

import org.modelmapper.Provider;

public class ProviderSecondLevel implements Provider<SecondLevelDestination> {

	public SecondLevelDestination get(
			ProvisionRequest<SecondLevelDestination> request) {
		//nothing really fancy here although real system loads from JPA
		return new SecondLevelDestination();
	}

}
