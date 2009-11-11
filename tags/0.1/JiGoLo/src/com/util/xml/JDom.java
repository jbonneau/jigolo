/**
 * Créée le 14 août 08
 */
package com.util.xml;

import org.jdom.Element;

/**
 * @author LhaaG
 *
 */
public class JDom {

	public void configFileWrite () {
		Element racine = new Element("jigolo");
		Element version = new Element("version");
		racine.addContent(version);
	}
	
	

}// class JDom