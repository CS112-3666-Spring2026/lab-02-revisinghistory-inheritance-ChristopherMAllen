/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Christopher Brinson-Allen
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		String tonkinDescription = "North Vietnamese torpedo boats attacked the U.S. destroyer USS Maddox in international waters on two occasions. These were portrayed as unprovoked acts of aggression against a routine U.S. patrol. President Lyndon B. Johnson went on TV, called it “open aggression on the high seas,” and used it to push the Gulf of Tonkin Resolution through Congress (passed almost unanimously on August 7, 1964). That resolution gave him sweeping power to escalate U.S. involvement without a formal declaration of war, leading directly to massive bombing campaigns, ground troops, and full-scale war.";
		Date tonkinDay = new Date(8, 2, 1964);
		HistoricalEvent tonkin = new HistoricalEvent(tonkinDescription, tonkinDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tonkin);
		
		
		String tonkinRevised = "The Johnson administration and the National Security Agency (NSA) knew (or strongly suspected) the second “attack” was imaginary but pushed the narrative anyway. In 2005, the NSA declassified its own internal study (the Hanyok Report), which concluded that analysts deliberately skewed intelligence—ignoring about 90% of the signals that contradicted an attack and only passing along the bits that supported escalation. Defense Secretary Robert McNamara later admitted in interviews and the documentary The Fog of War that no second attack occurred.",
			tonkinCitation = "https://www.history.com/articles/the-gulf-of-tonkin-vietnam-war-johnson";
		RevisedHistoricalEvent gulfTonkin = new RevisedHistoricalEvent(tonkinDescription, tonkinDay,
			tonkinRevised, tonkinCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		gulfTonkin.teach();
	}
}