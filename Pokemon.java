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
	private String abilities;
	
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
	  * default constructor
	  */
	public Pokemon(){
		
	}
	

	/**
	 * parameterized constructor
	 */
	public Pokemon(String speciesName, String[] type, String category, String abilities, String[] weakness, int hp,
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
	 */
	public void setSpeciesName(String speciesName){
		this.speciesName = speciesName;

	}

	/**
	 * @return the type
	 */
	public String[] getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String[] type){
		this.type = type;
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
	public String getAbilities() {
		return abilities;
	}

	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(String abilities){
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
	 * @throws IllegalArgumentException - will throw and exception if hp < 0
	 */
	public void setHp(int hp) {
		if(hp>=0)
			this.hp = hp;
		else
			throw new IllegalArgumentException("hp must be >= 0.");
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 * @throws IllegalArgumentException - if cp < 10.
	 */
	public void setCp(int cp) {
		if(cp > 10)
			this.cp = cp;
		else
			throw new IllegalArgumentException("cp must be >= 10.");
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 * @throws IllegalArgumentException - if weight <= 0.
	 */
	public void setWeight(double weight) {
		if(weight > 0)
			this.weight = weight;
		else
			throw new IllegalArgumentException("weight must be >= 0.")
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 * @throws IllegalArgumentException - height must be >= 0.
	 */
	public void setHeight(double height) {
		if(height < 0)
			this.height = height;
		else
			throw new IllegalArgumentException("height must be >= 0.")
	}
	
	

	
}