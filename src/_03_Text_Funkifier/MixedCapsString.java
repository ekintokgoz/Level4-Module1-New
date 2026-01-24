package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	public String funkifyText() {
    	StringBuilder builder = new StringBuilder(unfunkifiedText);
		for(int i = 0; i < unfunkifiedText.length(); i++) {
				if(i % 2 == 0) {
					builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
				}else {
					builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
				}
			}
		unfunkifiedText = builder.toString();	
		return unfunkifiedText;
	}

}
