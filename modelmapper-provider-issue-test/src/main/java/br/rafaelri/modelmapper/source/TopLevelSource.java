package br.rafaelri.modelmapper.source;

public class TopLevelSource {
	private long something;
	private SecondLevelSource secondLevel;

	public long getSomething() {
		return something;
	}

	public void setSomething(long something) {
		this.something = something;
	}

	public SecondLevelSource getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(SecondLevelSource secondLevelSource) {
		this.secondLevel = secondLevelSource;
	}

}
