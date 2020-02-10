package galamsey.observatory;

public class Galamsey {
		
	private String vegetationColor;
	private int colourValue;
	private String  position;
	private String year;
	
	public Galamsey() {
		
	}
	public Galamsey(String vegColor,int colValue,String position,String year) {
		this.vegetationColor = vegColor;
		this.colourValue = colValue;
		this.position = position;
		this.year = year;
	}
	public String getVegetationColor() {
		return vegetationColor;
	}
	public void setVegetationColor(String vegetationColor) {
		this.vegetationColor = vegetationColor;
	}
	public int getColourValue() {
		return colourValue;
	}
	public void setColourValue(int colourValue) {
		this.colourValue = colourValue;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String toString() {
		return "Galamsey\n"+this.getVegetationColor()+"\n"+this.getPosition()
				+"\n"+this.getColourValue()+"\n"+this.getYear();
	}
	
	public String huse() {
		return "Hussein";
	}
	
	public static void main(String[] args) {
		Galamsey kumasi = new Galamsey();
		kumasi.setColourValue(1);
		kumasi.setPosition("7.2254558887,9.23000");
		kumasi.setVegetationColor("Green");
		kumasi.setYear("2019");
		System.out.println(kumasi.toString());
//		System.out.println(kumasi.spilt());
		
	}
}