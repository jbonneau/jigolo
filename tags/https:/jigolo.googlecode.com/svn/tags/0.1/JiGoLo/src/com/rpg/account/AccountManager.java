/**
 * Créée le 05 septembre 08
 */
package com.rpg.account;

import java.util.Date;
import java.util.List;

import javax.swing.ListModel;

import org.hibernate.Session;

import com.jgoodies.binding.list.ArrayListModel;
import com.util.hibernate.HibernateUtil;

/**
 * @author LhaaG
 *
 */
public final class AccountManager {

	private ArrayListModel<Account> managedAccounts;
	
	/**
	 * @param managedAccounts
	 */
	public AccountManager() {
		this.getAllAccounts();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountManager mgr = new AccountManager();

		if (args[0].equals("create")) {
			mgr.createAccount("Toto", "tata", "Le compte à toto");
		}
		else if (args[0].equals("list")) {
			List<Account> accounts = mgr.getAllAccounts();
			for (Account acc: accounts) {
				System.out.println("Pseudo: "+acc.getPseudo());
				System.out.println("Pwd: "+acc.getPassword());
				System.out.println("Créé le: "+acc.getInitDate());
			}
		}
		HibernateUtil.getSessionFactory().close();
	}


	public void createAccount(String pseudo, String password, String desc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Account newOne = new Account();
		newOne.setPseudo(pseudo);
		newOne.setPassword(password);
		newOne.setDescription(desc);
		newOne.setInitDate(new Date());

		session.save(newOne);
		session.getTransaction().commit();
	}

	private void createAccount(Account account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(account);
		session.getTransaction().commit();
	}

	private void updateAccount(Account account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(account);
		session.getTransaction().commit();
	}

	private void deleteAccount(Account account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(account);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Account> getAllAccounts() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		managedAccounts = new ArrayListModel<Account>(session.createQuery("from Account").list());
		session.getTransaction().commit();

		return managedAccounts;
	}

	public Account createItem() {
		return new Account();
	}

	public void addAccount(Account accountToAdd) {
		this.createAccount(accountToAdd);
		this.managedAccounts.add(accountToAdd);
	}

	public void editAccount(Account accountToEdit) {
		this.updateAccount(accountToEdit);
	}

	public void removeAccount(Account accountToRemove) {
		this.deleteAccount(accountToRemove);
		this.managedAccounts.remove(accountToRemove);
	}

	/**
	 * @return the managedAccounts
	 */
	public ListModel getManagedAccounts() {
		return managedAccounts;
	}

}// class AccountManager