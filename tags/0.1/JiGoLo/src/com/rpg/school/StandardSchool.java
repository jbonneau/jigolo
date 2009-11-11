/**
 * Créée le 11 août 08
 */
package com.rpg.school;

import java.util.Map;

import com.rpg.skill.GenericSkill;

/**
 * @author LhaaG
 *
 */
public class StandardSchool implements GenericSchool {

	int id;
	String name;
	String slogan;

	int skillTotal;
	Map<Integer,GenericSkill> skills;

}// class StandardSchool