package br.rafaelri.modelmapper;

import java.util.UUID;

import org.junit.Test;
import org.mockito.Mockito;
import org.modelmapper.Provider.ProvisionRequest;

import br.rafaelri.modelmapper.destination.ProviderSecondLevel;
import br.rafaelri.modelmapper.destination.ProviderTopLevel;
import br.rafaelri.modelmapper.destination.RootLevelDestination;
import br.rafaelri.modelmapper.source.RootLevelSource;
import br.rafaelri.modelmapper.source.SecondLevelSource;
import br.rafaelri.modelmapper.source.TopLevelSource;

/**
 * 
 * @author rafael
 *
 */
public class AppTest {
	@Test
	public void testThatAllProvidersAreRunOnRootLevelConversion() {
		App app = new App();
		app.providerTopLevel = Mockito.spy(new ProviderTopLevel());
		app.providerSecondLevel = Mockito.spy(new ProviderSecondLevel());
		app.init();
		RootLevelSource source = new RootLevelSource();
		source.setMessage(UUID.randomUUID().toString());
		source.setTopLevel(new TopLevelSource());
		source.getTopLevel().setSecondLevel(new SecondLevelSource());
		RootLevelDestination destination = app.convert(source);
		Mockito.verify(app.providerSecondLevel).get(Mockito.any(ProvisionRequest.class));
		Mockito.verify(app.providerTopLevel).get(Mockito.any(ProvisionRequest.class));
	}

}
