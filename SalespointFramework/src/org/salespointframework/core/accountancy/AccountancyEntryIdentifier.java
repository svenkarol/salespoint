package org.salespointframework.core.accountancy;

import javax.persistence.Embeddable;

import org.salespointframework.util.SalespointIdentifier;

/**
 * <code>AccountancyEntryIdentifier</code> serves as an identifier type for
 * <code>AccountancyEntry</code> objects. The main reason for its existence is
 * type safety for identifier across the Salespoint Framework. <br>
 * <code>AccoutancyEntryIdentifier</code> instances serve as primary key
 * attribute in <code>PersistentAccountancyEntry</code>, but can also be used as
 * a key for non-persistent, <code>Map</code>-based implementations.
 * 
 * @author hannesweisbach
 * 
 */
@SuppressWarnings("serial")
@Embeddable
public final class AccountancyEntryIdentifier extends SalespointIdentifier {

	/*
	 * if you define one ctor, we have to define this one as well, because it is
	 * no longer generated by java. but we need a no-arg ctor, because we are
	 * 
	 * @Embeddable.
	 */
	public AccountancyEntryIdentifier() {
	}

	/*
	 * Only needed for property editor, shouldn't be used otherwise, therefore
	 * @Deprecated.
	 */
	@Deprecated
	public AccountancyEntryIdentifier(String id) {
		super(id);
	}
}