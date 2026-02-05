package _03_Text_Funkifier;

public class CustomString implements TextFunkifier {
	private String unfunkifiedText;

	public CustomString(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}

	@Override
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
		unfunkifiedText = builder.reverse().toString();
		return unfunkifiedText;
	} 
}
