package fr.diginamic.geometrie;

/** Liste les m�thodes obligatoires que doit poss�der un objet g�om�trique
* @author Etienne URBANO
*/
public interface ObjetGeometrique {
/** Retourne le p�rim�tre d�une forme g�om�trique
* @return double
*/
	
double perimetre(); // " public abstract " est implicite
/** Retourne le p�rim�tre de mon objet g�om�trique
* @return double
*/

double surface(); // " public abstract " est implicite
/** Retourne la surface de mon objet g�om�trique
* @return double
*/
}
