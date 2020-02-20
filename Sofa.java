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

	private int widthInÑentimeters;
	private int lengthInÑentimeters;
	private int heightInCentimeters;
	private String color;
	private String brand;
	private String materialOfÑoating;

	protected String countryOfManufacture;
	protected String materialOfÑarcass;

	public int getWidthInÑentimeters() {
		return widthInÑentimeters;
	}

	public void setWidthInÑentimeters(int widthInÑentimeters) {
		this.widthInÑentimeters = widthInÑentimeters;
	}

	public int getLengthInÑentimeters() {
		return lengthInÑentimeters;
	}

	public void setLengthInÑentimeters(int lengthInÑentimeters) {
		this.lengthInÑentimeters = lengthInÑentimeters;
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

	public String getMaterialOfÑoating() {
		return materialOfÑoating;
	}

	public void setMaterialOfÑoating(String materialOfÑoating) {
		this.materialOfÑoating = materialOfÑoating;
	}

	public Sofa(int widthInÑentimeters, int lengthInÑentimeters, int heightInCentimeters, String color, String brand,
			String materialOfÑoating, String countryOfManufacture, String materialOfÑarcass) {
		this.widthInÑentimeters = widthInÑentimeters;
		this.lengthInÑentimeters = lengthInÑentimeters;
		this.heightInCentimeters = heightInCentimeters;
		this.color = color;
		this.brand = brand;
		this.materialOfÑoating = materialOfÑoating;
		this.countryOfManufacture = countryOfManufacture;
		this.materialOfÑarcass = materialOfÑarcass;

	}

	public Sofa(int widthInÑentimeters, int lengthInÑentimeters, int heightInCentimeters, String color) {

		this(widthInÑentimeters, lengthInÑentimeters, heightInCentimeters, color, DEFAULT_BRAND,
				DEFAULT_MATERIAL_OF_COATING, DEFAULT_COUNTRY_OF_MANUFACTURE, DEFAULT_MATERIAL_OF_CARCASS);
	}

	public Sofa() {
		this(DEFAULT_WIDTH_IN_CENTIMETERS, DEFAULT_LENGTH_IN_CENTIMETERS, DEFAULT_HEIGHT_IN_CENTIMETERS, DEFAULT_COLOR,
				DEFAULT_BRAND, DEFAULT_MATERIAL_OF_COATING, DEFAULT_COUNTRY_OF_MANUFACTURE,
				DEFAULT_MATERIAL_OF_CARCASS);
	}

	@Override
	public String toString() {
		return "Sofa [widthInÑentimeters=" + widthInÑentimeters + ", lengthInÑentimeters=" + lengthInÑentimeters
				+ ", heightInCentimeters=" + heightInCentimeters + ", color=" + color + ", brand=" + brand
				+ ", materialOfÑoating=" + materialOfÑoating + ", countryOfManufacture=" + countryOfManufacture
				+ ", materialOfÑarcass=" + materialOfÑarcass + "]";
	}

	public static void printStaticPriceInEuro() {
		System.out.println("Price in euro = " + priceInEuro);
	}

	public void resetValues(int widthInÑentimeters, int lengthInÑentimeters, int heightInCentimeters, String color,
			String brand, String materialOfÑoating, String countryOfManufacture, String materialOfÑarcass) {
		this.widthInÑentimeters = widthInÑentimeters;
		this.lengthInÑentimeters = lengthInÑentimeters;
		this.heightInCentimeters = heightInCentimeters;
		this.color = color;
		this.brand = brand;
		this.materialOfÑoating = materialOfÑoating;
		this.countryOfManufacture = countryOfManufacture;
		this.materialOfÑarcass = materialOfÑarcass;
	}

}
