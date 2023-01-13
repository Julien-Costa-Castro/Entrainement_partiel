public class Foret {

    private int nbArbres;
    // nbArbres >= 0
    // Nb d’arbres existants, c’est-`a-dire d´ej`a plant´es et pas encore coup´es, de la for^et.
    private Arbre[] tabArbre;
// Tableau contenant les arbres existants de la for^et dans les cases d’indice 0 `a
// nbArbres - 1, rang´es en ordre chronologique de plantation, et donc en ordre
// d’^age d´ecroissant.


    public Foret(int nbMax){
        // Action : construit une for^et sans arbre pouvant contenir au maximum nbMax arbres.
        this.nbArbres = 0;
        this.tabArbre = new Arbre[nbMax];
    }

    public String toString(){
        /** R´esultat : cha^ıne de caract`eres qui donne `a l’affichage l’´etat courant de la for^et
         sous la forme :
         arbre 0 : ... an (ou ans)
         arbre 1 : ... an (ou ans)
         arbre 2 : ... an (ou ans)
         etc.
         (on rappelle que le caract`ere de retour `a la ligne est \n)
         */
        String s = "";
        for (int i = 0; i < this.tabArbre.length; i++) {
            s += "arbre " + i + " : " + this.tabArbre[i].toString() + "\n";
        }
        return s;
    }

    public void passeUneAnnee(){
        // Action : simule le passage d’une ann´ee de cette for^et.
        for (int i = 0; i < this.tabArbre.length ; i++) {
            this.tabArbre[i].passeAnnee();
        }
    }

    public void planteUnArbre() {
        // Pr´e-requis : this.nbArbres < this.tabArbre.length
// Action : simule la plantation d’un arbre dans this.
// Remarque : on rappelle que les arbres de la for^et apparaissent dans
// le tableau tabArbre dans l’ordre de leur plantation ;
// un nouvel arbre plant´e devra donc appara^ıtre `a droite de
// tous les arbres d´ej`a pr´esents.
        this.tabArbre[this.nbArbres] = new Arbre();
        this.nbArbres++;
    }

    public void plante(int nb){
        // Pr´e-requis : 0 <= nb <= this.tabArbre.length - this.nbArbres
        // Action : simule la plantation de nb arbres dans this
        for (int i = 0; i < nb; i++) {
            this.planteUnArbre();
        }
        System.out.println("Il y a maintenant " + this.nbArbres + " arbres dans la for^et.");
    }

    public void coupeVieuxArbres( int nb){
        // Pr´e-requis : 0 <= nb <= this.nbArbres.
// Action : simule la coupe des nb plus vieux arbres de this.
// Remarque : le tableau tabArbre contient nb arbres de moins apr`es la coupe.
// On rappelle que les arbres existants de la for^et doivent
// toujours figurer dans les cases d’indice 0 `a nbArbres - 1
// de tabArbre.
    for (int i = 0; i < nb; i++) {
            this.tabArbre[i] = null;
        }
        this.nbArbres = this.nbArbres - nb;
        System.out.println("Il y a maintenant " + this.nbArbres + " arbres dans la for^et.");
    }

    private int nbArbresLimite(int limite){
        // Pr´e-requis : aucun.
// R´esultat : retourne le nombre d’arbres de this dont l’^age est sup´erieur
// ou ´egal `a limite.

    }

    public int coupeArbresLimite (int limite){
        // Pr´e-requis : aucun.
        // Action/r´esultat : simule la coupe des arbres de this dont l’^age est sup´erieur ou
// ´egal `a limite, et renvoie le nombre d’arbres coup´es.

    }

    public static void main(String[] args) {
        /** Action : simule la cr´eation d’une for^et sans arbre, puis, dans cette for^et,
         * la plantation de 5 arbres par an de l’ann´ee 2020 `a l’ann´ee 2080 (incluses),
         * puis la coupe en 2081 de tous les arbres ayant au moins 50 ans,
         * et la replantation en 2082 du m^eme nombre d’arbres que celui des arbres coup´es
         * en 2081, et finalement affiche l’´etat de la for^et juste apr`es cette replantation.
         * Rappel : l’affichage en java se fera en utilisant "System.out.println(...)".
         */

        Foret f = new Foret(50);
        f.plante(10);
        f.coupeVieuxArbres(3);
    }
}
