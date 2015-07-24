package br.rafaelri.modelmapper.destination;


public class TopLevelDestination {
	private long something;
	private SecondLevelDestination secondLevel;

	public TopLevelDestination() {
		super();
	}

	public long getSomething() {
		return something;
	}

	public void setSomething(long something) {
		this.something = something;
	}

	public SecondLevelDestination getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(SecondLevelDestination secondLevelDestination) {
		this.secondLevel= secondLevelDestination;
	}
}
