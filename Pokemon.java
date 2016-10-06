import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class pokemon
 * <p> 
 * Represents a pocket monster. If you don't know you don't want to know.
 * 
 * @author Bowers, Matthew
 * @version 0.1, updated 10/5/2016
 *
 */
public class Pokemon {
	
	/**
	 * The species name of the pokemon
	 */
	private String speciesName;
	
	/**
	 * Pokedex number - unique identifier for each pokemon species
	 * UNIMPLEMENTED
	 */
	//private int speciesID;
	
	/**
	 * ID unique identifier for this pokemon
	 * UNIMPLEMENTED
	 */
	//private String id;
	
	/**
	 * Pokemon Type - the type of the pokemon used for calculating 
	 * combat weaknesses and strength
	 */
	private String[] type;
	
	/**
	 * Pokemon category - flavor text describing the nature of the pokemon
	 */
	private String category;
	
	/**
	 * Abilities - the move set of this pokemon generally pokemon can know 
	 * only 4 moves at a time. This implementation will restrict to 2 moves.
	 */
	private String[] abilities;
	
	/**
	 * weaknesses - an array of the pokemon types that do 2x damage to this pokemon
	 * type. In future implementation this will be 2x weakness
	 */
	private String[] weakness;
	
	/**
	 * weaknesses4x - an array of the pokemon types that do 4x damage to this pokemon
	 * UNIMPLEMENTED
	 */
	//private String[] weakness4x;
	
	/**
	 * Hit points - the amount of damage a pokemon can take before being knocked out
	 */
	private int hp;
	
	/**
	 * Combat Power - a number which attempts to quantify the overall combat potential
	 * of this pokemon
	 */
	private int cp;
	
	/**
	 * weight - the weight of this pokemon
	 */
	private double weight;
	
	/**
	 * height - the length or height of the pokemon 
	 */
	private double height;
	
	/**
	 * SPECIES - an array containing all known pokemon species
	 */
	private final static ArrayList<String> SPECIES = new ArrayList<String>
			(Arrays.asList("Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon",
			"Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod",
			"Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot",
			"Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu",
			"Sandshrew","Sandslash","NidoranFemale","Nidorina","Nidoqueen","NidoranMale",
			"Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff",
			"Wigglytuff","Zubat","Golbat","Oddish","Gloom","Vileplume","Paras",
			"Parasect","Venonat","Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck",
			"Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag","Poliwhirl",
			"Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp",
			"Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude",
			"Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite",
			"Magneton","Farfetch\'d","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk",
			"Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee",
			"Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor",
			"Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn",
			"Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen",
			"Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz",
			"Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee",
			"Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops",
			"Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair",
			"Dragonite","Mewtwo","Mew"));	
	
	/**
	 * TYPES - an array of all possible pokemon types
	 */
	private static ArrayList<String> TYPES = new ArrayList<String>(Arrays.asList("Bug", "Dark", "Dragon",
				"Electric", "Fighting", "Flying", "Fire", "Ghost", "Grass", "Ground", "Ice", "Normal",
				"Poison", "Psychic", "Rock", "Steel", "Water", "Fairy"));
	
	/**
	  * default constructor
	  */
	public Pokemon(){
		
	}
	

	
	/**
	 * parameterized constructor
	 */
	public Pokemon(String speciesName, String[] type, String category, String[] abilities, String[] weakness, int hp,
			int cp, double weight, double height) {
		super();
		setSpeciesName(speciesName);
		setType(type);
		setCategory(category);
		setAbilities(abilities);
		setWeakness(weakness);
		setHp(hp);
		setCp(cp);
		setWeight(weight);
		setHeight(height);
	}

	/**
	 * @return the speciesName
	 */
	public String getSpeciesName() {
		return speciesName;
	}

	/**
	 * @param speciesName the speciesName to set
	 * @throws IllegalArgumentException if speciesName is not 
	 * listed in Pokemon.SPECIES
	 */
	public void setSpeciesName(String speciesName) throws IllegalArgumentException {
		if(SPECIES.contains(speciesName))
				this.speciesName = speciesName;
		else
			throw new IllegalArgumentException(speciesName + 
					" is not a known Pokemon species.");
	}

	/**
	 * @return the type
	 */
	public String[] getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 * @throws IllegalArgumentException if type is not listed in Pokemon.TYPES
	 */
	public void setType(String[] type) throws IllegalArgumentException {
		if(TYPES.contains(type))
				this.type = type;
		else
			throw new IllegalArgumentException(type + " is not a known pokemon type.");
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the abilities
	 */
	public String[] getAbilities() {
		return abilities;
	}

	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(String[] abilities) {
		this.abilities = abilities;
	}

	/**
	 * @return the weakness
	 */
	public String[] getWeakness() {
		return weakness;
	}

	/**
	 * @param weakness the weakness to set
	 */
	public void setWeakness(String[] weakness) {
		this.weakness = weakness;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	

	
}
