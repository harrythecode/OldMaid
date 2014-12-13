package BabaNuki;

public class OrdinaryCard implements Card{
	private String mark;
	private int value;
	
	public OrdinaryCard(String mark, int value){
		this.mark = mark;
		this.value = value;
	}
	
	public String getMark(){
		return mark;
	}
	
	public int getValue(){
		return value;
	}
	
}
