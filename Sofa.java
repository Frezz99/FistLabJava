package ua.lviv.iot;

public class Sofa {
	private static final int DEFAULT_WIDTH_IN_CENTIMETERS = 150;
	private static final int DEFAULT_LENGTH_IN_CENTIMETERS = 220;
	private static final int DEFAULT_HEIGHT_IN_CENTIMETERS = 90;
	private static final String DEFAULT_COLOR = "black";
	private static final String DEFAULT_BRAND = "abibbas";
	private static final String DEFAULT_MATERIAL_OF_COATING = "leather";
	private static final String DEFAULT_COUNTRY_OF_MANUFACTURE = "ukraine";
	private static final String DEFAULT_MATERIAL_OF_CARCASS = "wood";

	public static int priceInEuro = 99;

	private int widthIn�entimeters;
	private int lengthIn�entimeters;
	private int heightInCentimeters;
	private String color;
	private String brand;
	private String materialOf�oating;

	protected String countryOfManufacture;
	protected String materialOf�arcass;

	public int getWidthIn�entimeters() {
		return widthIn�entimeters;
	}

	public void setWidthIn�entimeters(int widthIn�entimeters) {
		this.widthIn�entimeters = widthIn�entimeters;
	}

	public int getLengthIn�entimeters() {
		return lengthIn�entimeters;
	}

	public void setLengthIn�entimeters(int lengthIn�entimeters) {
		this.lengthIn�entimeters = lengthIn�entimeters;
	}

	public int getHeightInCentimeters() {
		return heightInCentimeters;
	}

	public void setHeightInCentimeters(int heightInCentimeters) {
		this.heightInCentimeters = heightInCentimeters;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterialOf�oating() {
		return materialOf�oating;
	}

	public void setMaterialOf�oating(String materialOf�oating) {
		this.materialOf�oating = materialOf�oating;
	}

	public Sofa(int widthIn�entimeters, int lengthIn�entimeters, int heightInCentimeters, String color, String brand,
			String materialOf�oating, String countryOfManufacture, String materialOf�arcass) {
		this.widthIn�entimeters = widthIn�entimeters;
		this.lengthIn�entimeters = lengthIn�entimeters;
		this.heightInCentimeters = heightInCentimeters;
		this.color = color;
		this.brand = brand;
		this.materialOf�oating = materialOf�oating;
		this.countryOfManufacture = countryOfManufacture;
		this.materialOf�arcass = materialOf�arcass;

	}

	public Sofa(int widthIn�entimeters, int lengthIn�entimeters, int heightInCentimeters, String color) {

		this(widthIn�entimeters, lengthIn�entimeters, heightInCentimeters, color, DEFAULT_BRAND,
				DEFAULT_MATERIAL_OF_COATING, DEFAULT_COUNTRY_OF_MANUFACTURE, DEFAULT_MATERIAL_OF_CARCASS);
	}

	public Sofa() {
		this(DEFAULT_WIDTH_IN_CENTIMETERS, DEFAULT_LENGTH_IN_CENTIMETERS, DEFAULT_HEIGHT_IN_CENTIMETERS, DEFAULT_COLOR,
				DEFAULT_BRAND, DEFAULT_MATERIAL_OF_COATING, DEFAULT_COUNTRY_OF_MANUFACTURE,
				DEFAULT_MATERIAL_OF_CARCASS);
	}

	@Override
	public String toString() {
		return "Sofa [widthIn�entimeters=" + widthIn�entimeters + ", lengthIn�entimeters=" + lengthIn�entimeters
				+ ", heightInCentimeters=" + heightInCentimeters + ", color=" + color + ", brand=" + brand
				+ ", materialOf�oating=" + materialOf�oating + ", countryOfManufacture=" + countryOfManufacture
				+ ", materialOf�arcass=" + materialOf�arcass + "]";
	}

	public static void printStaticPriceInEuro() {
		System.out.println("Price in euro = " + priceInEuro);
	}

	public void resetValues(int widthIn�entimeters, int lengthIn�entimeters, int heightInCentimeters, String color,
			String brand, String materialOf�oating, String countryOfManufacture, String materialOf�arcass) {
		this.widthIn�entimeters = widthIn�entimeters;
		this.lengthIn�entimeters = lengthIn�entimeters;
		this.heightInCentimeters = heightInCentimeters;
		this.color = color;
		this.brand = brand;
		this.materialOf�oating = materialOf�oating;
		this.countryOfManufacture = countryOfManufacture;
		this.materialOf�arcass = materialOf�arcass;
	}

}
