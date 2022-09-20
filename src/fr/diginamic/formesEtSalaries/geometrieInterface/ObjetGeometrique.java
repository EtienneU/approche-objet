package fr.diginamic.formesEtSalaries.geometrieInterface;

/** Liste les méthodes obligatoires que doit posséder un objet géométrique
* @author Etienne URBANO
*/
public interface ObjetGeometrique {
/** Retourne le périmètre d'une forme géométrique
* @return double
*/
	
double perimetre(); // " public abstract " est implicite
/** Retourne le périmètre de mon objet géométrique
* @return double
*/

double surface(); // " public abstract " est implicite
/** Retourne la surface de mon objet géométrique
* @return double
*/
}
