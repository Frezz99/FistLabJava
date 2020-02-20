package ua.lviv.iot;

public class SofaCreator {

	public static void main(String[] args) {
	
		Sofa firstSofa = new Sofa();
		Sofa secondSofa = new Sofa(100,200,50,"white");
		Sofa thirdSofa = new Sofa(101,202,53,"brown","ioan", "cardboard", "turkey", "metal");
		System.out.println(firstSofa);
		System.out.println(secondSofa);
		System.out.println(thirdSofa);
		
		firstSofa.printStaticPriceInEuro();
		Sofa[] sofaArray = new Sofa[4];
		int sofaIndex = 0;
		
		while (sofaIndex <4) {
			sofaArray[sofaIndex] = new Sofa();
			sofaIndex++;
		}
		
		for (Sofa index : sofaArray) {
			System.out.println(index);
	}

}
}
