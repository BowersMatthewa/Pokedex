import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Pokedex {
	/**
	 * speciesFile - the file containing the current list of known species
	 */
	private static File speciesFile = new File("./pokemon.csv");
	
	/**
	 * moveFile - the file containing the current list of known moves
	 */
	private static File moveFile = new File("./Pokemon_Moves.csv");
	
	/**
	 * abilityFile - the file containing the current list of known abilities
	 */
	private static File abilityFile = new File("./Pokemon_Abilities.csv");
	
	/**
	 * pokedex - an ArrayList containing the Pokemon
	 */
	private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>(10);
	
	/**
	 * SPECIES - an ArrayList containing all known pokemon species
	 */
	public static ArrayList<String> SPECIES = new ArrayList<String>(151);
	
	/**
	 * ABILITIES - an ArrayList of all known abilities
	 */
	private static ArrayList<String> ABILITIES = new ArrayList<String>(200);
	
	/**
	 * MOVES - an ArrayList of all known moves
	 */
	private static HashMap<String, String> MOVES = new HashMap<String, String>(600);
	
	/**
	 * TYPES - an array of all possible pokemon types
	 */
	private static ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList("Bug", "Dark", "Dragon",
				"Electric", "Fighting", "Flying", "Fire", "Ghost", "Grass", "Ground", "Ice", "Normal",
				"Poison", "Psychic", "Rock", "Steel", "Water", "Fairy"));
	
	/**
	 * Constructor
	 */
	public Pokedex(){
		getSpecies();
		getMoves();
		getAbilities();
	}
	
	/**
	 * listToString - takes any array of simple objects and returns 
	 * them as a comma delineated string. This will behave poorly if 
	 * Object.toString() is not overridden by the members of T[].
	 * @param <T> 
	 * @return the array as a list
	 */
	private static <T> String listToString(T[] array) {
		String asString = "";
		for(T t : array){
			if(t != null)
				asString += t + ", ";
		}
		asString = asString.substring(0, asString.length()-1);
		return asString;
	}
	
	/**
	 * getSpecies - reads in the current valid pokemon species list from speciesFile
	 */
	public static void getSpecies(){
		String str;
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(speciesFile), "UNICODE"));
				while((str = in.readLine()) != null){
					SPECIES.add(str.replaceAll("\\d+;",""));
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * getMoves - reads in the current valid pokemon move list from moveFile
	 * The data is stored as a HashMap KEY = move name, DATA = move type
	 */
	public static void getMoves(){
		String str;
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(moveFile), "UTF8"));
				in.readLine(); //skip the first line of the file
				while((str = in.readLine()) != null){
					Scanner scanner = new Scanner(str).useDelimiter(";");
					scanner.next(); //skip the first token which is the move #
					String temp = scanner.next();
					MOVES.put(temp, scanner.next());
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * getAbilities - reads in the current valid pokemon abilities from the abilityFile
	 */
	public static void getAbilities(){
		String str;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(abilityFile), "UTF8"));
			while((str = in.readLine()) != null){
				Scanner scan = new Scanner(str).useDelimiter(",");
				ABILITIES.add(scan.next());
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args){
		Pokedex test = new Pokedex();
		
		test.getAbilities();
		
		System.out.print(ABILITIES);
	}
}
