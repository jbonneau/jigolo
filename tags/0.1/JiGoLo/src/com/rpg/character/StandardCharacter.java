/**
 * Créée le 11 août 08
 */
package com.rpg.character;

import java.util.Date;

import com.rpg.inventory.Inventory;
import com.rpg.stat.PlayerStat;

/**
 * @author LhaaG
 *
 */
public class StandardCharacter implements GenericCharacter {

	private long id;
	private long masterId;
	private String name;
	private Date birthday;
	private String bloodType;
	private Date creationDate;

	private int gold;

	private int level;
	private long xpTotal;
	private int skillPoints;
	private int skillPointsTotal;

	private int statFocus;
	private int statReading;
	private int statFeeling;
	private int statMemory;
	private int statDetermination;
	private int statCreativity;
	private int statKnowledge;
	private int statCharming;
	private int statPointsTotal;

	private int specialSkillPoints;
	private int specialSkillPointsTotal;

	private PlayerStat stat;
	private Inventory bag;

	/**
	 * Constructeur pour Hibernate
	 */
	public StandardCharacter() {}

	/**
	 * Crée un nouveau personnage de jeu vierge
	 * @param masterId
	 * @param name
	 * @param birthday
	 * @param bloodType
	 * @param raceId
	 */
	public StandardCharacter(long masterId, String name, Date birthday, String bloodType, int raceId) {
		this.masterId = masterId;
		this.name = name;
		this.birthday = birthday;
		this.bloodType = bloodType;
		this.creationDate = new Date();

		this.gold = GOLD_INIT;
		this.level = LEVEL_INIT;

		this.skillPoints = SKILL_POINTS_INIT;
		this.skillPointsTotal = SKILL_POINTS_INIT;

		this.statFocus = 0;
		this.statReading = 0;
		this.statFeeling = 0;
		this.statMemory = 0;
		this.statDetermination = 0;
		this.statCreativity = 0;
		this.statKnowledge = 0;
		this.statCharming = 0;
		this.statPointsTotal = STAT_POINTS_TOTAL_INIT;

		this.specialSkillPoints = SPECIAL_SKILL_POINTS_INIT;
		this.specialSkillPointsTotal = SPECIAL_SKILL_POINTS_INIT;

		this.xpTotal = 0;
		this.stat = new PlayerStat(this.id);
		this.bag = new Inventory();
	}// constructor


	public void displayBasicInfo() {
		System.out.println("\n*** " + this.name + " ***");
		System.out.println("* Niveau:\t" + this.level + "D\t*");
		System.out.println("* Bourse:\t" + this.gold + "G\t*");
		System.out.println("* XP:\t" + this.xpTotal + "\t*\n");
	}

	public void displayInventory() {
		System.out.println("\n*** Inventaire ***");
		System.out.println("* Goban:\t" + this.level + "D\t*");
		System.out.println("* Bourse:\t" + this.gold + "G\t*");
		System.out.println("* XP:\t" + this.xpTotal + "\t*\n");
	}


	/**
	 * @return the masterId
	 */
	public long getMasterId() {
		return masterId;
	}

	/**
	 * @param masterId the masterId to set
	 */
	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the bloodType
	 */
	public String getBloodType() {
		return bloodType;
	}

	/**
	 * @param bloodType the bloodType to set
	 */
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * @param gold the gold to set
	 */
	public void setGold(int gold) {
		this.gold = gold;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the xpTotal
	 */
	public long getXpTotal() {
		return xpTotal;
	}

	/**
	 * @param xpTotal the xpTotal to set
	 */
	public void setXpTotal(long xpTotal) {
		this.xpTotal = xpTotal;
	}

	/**
	 * @return the skillPoints
	 */
	public int getSkillPoints() {
		return skillPoints;
	}

	/**
	 * @param skillPoints the skillPoints to set
	 */
	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}

	/**
	 * @return the skillPointsTotal
	 */
	public int getSkillPointsTotal() {
		return skillPointsTotal;
	}

	/**
	 * @param skillPointsTotal the skillPointsTotal to set
	 */
	public void setSkillPointsTotal(int skillPointsTotal) {
		this.skillPointsTotal = skillPointsTotal;
	}

	/**
	 * Retourne le niveau de concentration
	 * @return the statFocus
	 */
	public int getStatFocus() {
		return statFocus;
	}

	/**
	 * @param statFocus the statFocus to set
	 */
	public void setStatFocus(int statFocus) {
		this.statFocus = statFocus;
	}

	/**
	 * Retourne le niveau de lecture du jeu
	 * @return the statReading
	 */
	public int getStatReading() {
		return statReading;
	}

	/**
	 * @param statReading the statReading to set
	 */
	public void setStatReading(int statReading) {
		this.statReading = statReading;
	}

	/**
	 * Retourne le niveau d'intuition
	 * @return the statFeeling
	 */
	public int getStatFeeling() {
		return statFeeling;
	}

	/**
	 * @param statFeeling the statFeeling to set
	 */
	public void setStatFeeling(int statFeeling) {
		this.statFeeling = statFeeling;
	}

	/**
	 * Retourne le niveau de m�morisation
	 * @return the statMemory
	 */
	public int getStatMemory() {
		return statMemory;
	}

	/**
	 * @param statMemory the statMemory to set
	 */
	public void setStatMemory(int statMemory) {
		this.statMemory = statMemory;
	}

	/**
	 * Retourne le niveau de d�termination
	 * @return the statDetermination
	 */
	public int getStatDetermination() {
		return statDetermination;
	}

	/**
	 * @param statDetermination the statDetermination to set
	 */
	public void setStatDetermination(int statDetermination) {
		this.statDetermination = statDetermination;
	}

	/**
	 * Retourne le niveau de cr�ativit�
	 * @return the statCreativity
	 */
	public int getStatCreativity() {
		return statCreativity;
	}

	/**
	 * @param statCreativity the statCreativity to set
	 */
	public void setStatCreativity(int statCreativity) {
		this.statCreativity = statCreativity;
	}

	/**
	 * Retourne le niveau de connaissances
	 * @return the statKnowledge
	 */
	public int getStatKnowledge() {
		return statKnowledge;
	}

	/**
	 * @param statKnowledge the statKnowledge to set
	 */
	public void setStatKnowledge(int statKnowledge) {
		this.statKnowledge = statKnowledge;
	}

	/**
	 * Retourne le niveau de charisme
	 * @return the statCharming
	 */
	public int getStatCharming() {
		return statCharming;
	}

	/**
	 * @param statCharming the statCharming to set
	 */
	public void setStatCharming(int statCharming) {
		this.statCharming = statCharming;
	}

}// class StandardCharacter