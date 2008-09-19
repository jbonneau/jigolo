/**
 * Créée le 11 août 08
 */
package com.rpg.account;

import java.util.ArrayList;
import java.util.Date;

import com.jgoodies.binding.beans.Model;
import com.rpg.player.GenericPlayer;


/**
 * @author LhaaG
 *
 */
@SuppressWarnings("serial")
public class Account extends Model {

	private long id;
	private String pseudo;
	private String password;
	private String description;
	private Date initDate;

	ArrayList<GenericPlayer> players;

	/**
	 * Constructeur pour Hibernate
	 */
	public Account() {}

	/**
	 * Créer un compte utilisateur
	 * @param password
	 * @param pseudo
	 * @param description
	 */
	public Account(String pseudo, String password, String description) {
		this.pseudo = pseudo;
		this.password = password;
		this.description = description;
		this.initDate = new Date();
	}// constructor


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
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Le pseudo doit être unique
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Mot de passe en clair ?
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the initDate
	 */
	public Date getInitDate() {
		return initDate;
	}

	/**
	 * @param initDate the initDate to set
	 */
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

}// class Account