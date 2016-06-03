package at.fhv.ecss2016.restest.util;

public enum StringConstants {
	
	CONFIG_RESPONSE("CONFIG_RESPONSE");
	
	
	private final String _constant;
	
	StringConstants(String constant) {
		_constant = constant;
	}
	
	public String getConstant() {
		return _constant;
	}
}
