package br.rafaelri.modelmapper.destination;

import org.modelmapper.PropertyMap;

import br.rafaelri.modelmapper.source.TopLevelSource;

public class TopLevelPropertyMap extends PropertyMap<TopLevelSource, TopLevelDestination>{

	protected void configure() {
		//nothing here but on the real project there are some converters configured here
		//none of them related to the properties that use the providers
	}
	
}
