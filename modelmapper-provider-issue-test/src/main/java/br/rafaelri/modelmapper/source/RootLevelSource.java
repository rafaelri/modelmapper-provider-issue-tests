package br.rafaelri.modelmapper.source;


public class RootLevelSource {
	private String message;
	private TopLevelSource topLevel;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TopLevelSource getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(TopLevelSource topLevelSource) {
		this.topLevel = topLevelSource;
	}

}
