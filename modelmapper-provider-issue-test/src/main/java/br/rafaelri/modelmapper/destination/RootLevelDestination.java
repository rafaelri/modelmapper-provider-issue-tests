package br.rafaelri.modelmapper.destination;

public class RootLevelDestination {
	private String message;
	private TopLevelDestination topLevel;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TopLevelDestination getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(TopLevelDestination topLevelDestination) {
		this.topLevel= topLevelDestination;
	}
	
}
