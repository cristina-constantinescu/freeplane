/*
 * Created on 09-Dec-2003
 */
package net.sf.jabref.labelPattern;


/*
 * Created on 09-Dec-2003
 */

/**
  * How this works:
  * The fields used to autogeneratr keys are stored in an ArrayList
  * with the first item of the list being a string representation of
  * the key pattern and the second item the spacer character.
  * The order of the fields in the autogenerated key will match the
  * order of the fields in the ArrayList.
  *
  * Each entry type will have its own corrosponding ArrayList, to handle
  * this, we will have a Hashtable where an entry type > ArrayList.
  * There will be a default KP, which will parent a userdefined KP.
  *
  * Upon generatring keys we will itentify the type of entry, fetch
  * the proper Array, store the spacer in a temp. String. By reading the
  * field in the Array, the proper value will be fetched and stored in a
  * StringBuffer, with the spacer between each field.
  *
  * Btw. we wont allow for keys like [auth][year]_[pages], is this a
  * problem?
  *
  *
 * @author Ulrik Stervbo (ulriks AT ruc.dk)
 */
//public class DefaultLabelPatterns extends ListResourceBundle{
public class DefaultLabelPatterns extends LabelPattern{

    public DefaultLabelPatterns(){

	/**
	 * There's no need to set all defaults; only those that should differ
	 * from the global default in LabelPatternUtil.DEFAULT_LABELPATTERN.
	 */

	/*addLabelPattern("book",	"[auth]_[year]");
	addLabelPattern("booklet", "[auth]_[year]");
	addLabelPattern("conference", "[auth]_[year]");
	addLabelPattern("inbook", "[auth]_[year]");
	addLabelPattern("incollection", "[auth]_[year]");
	addLabelPattern("inproceedings", "[auth]_[year]");
	addLabelPattern("manual", "[auth]_[year]");
	addLabelPattern("mastersthesis", "[auth]_[year]");
	addLabelPattern("misc",	"[auth]_[year]");
	addLabelPattern("phdthesis", "[auth]_[year]");
	addLabelPattern("proceedings","[auth]_[year]");
	addLabelPattern("techreport", "[auth]_[year]");
	addLabelPattern("unpublished", "[auth]_[year]");*/
    }
}