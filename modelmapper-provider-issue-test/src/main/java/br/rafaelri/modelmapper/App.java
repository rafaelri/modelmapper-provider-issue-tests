package br.rafaelri.modelmapper;

import static org.modelmapper.convention.MatchingStrategies.STRICT;

import org.modelmapper.ModelMapper;

import br.rafaelri.modelmapper.destination.ProviderSecondLevel;
import br.rafaelri.modelmapper.destination.ProviderTopLevel;
import br.rafaelri.modelmapper.destination.RootLevelDestination;
import br.rafaelri.modelmapper.destination.SecondLevelDestination;
import br.rafaelri.modelmapper.destination.SecondLevelPropertyMap;
import br.rafaelri.modelmapper.destination.TopLevelDestination;
import br.rafaelri.modelmapper.destination.TopLevelPropertyMap;
import br.rafaelri.modelmapper.source.RootLevelSource;
import br.rafaelri.modelmapper.source.SecondLevelSource;
import br.rafaelri.modelmapper.source.TopLevelSource;

/**
 * 
 * @author rafaelri
 *
 */
public class App {
	ModelMapper modelMapper;
	ProviderTopLevel providerTopLevel;
	ProviderSecondLevel providerSecondLevel;
	TopLevelPropertyMap topLevelPropertyMap;
	SecondLevelPropertyMap secondLevelPropertyMap;
	
	public App() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(STRICT);
		providerTopLevel = new ProviderTopLevel();
		providerSecondLevel = new ProviderSecondLevel();
		topLevelPropertyMap = new TopLevelPropertyMap();
		secondLevelPropertyMap = new SecondLevelPropertyMap();
	}
	
	public void init() {
		modelMapper.addMappings(new SecondLevelPropertyMap()).setProvider(providerSecondLevel);
		modelMapper.addMappings(new TopLevelPropertyMap()).setProvider(providerTopLevel);
	}
	
	public RootLevelDestination convert(RootLevelSource source) {
		return modelMapper.map(source, RootLevelDestination.class);
	}
}
