public class Main {
    private String[] tabAli;
    private int[] tabIG;
    private int limiteIG;

    public String[] tabAli() {
        String[] tabAli = {"baguette de pain", "pain complet", "pain de mie", "pâtes", "riz", "pommes de terre", "lentilles", "haricots", "légumes"};
        return tabAli;
    }
    public int[] tabIG() {
        int[] tabIG = {80, 70, 60, 50, 40, 30, 20, 10, 0};
        return tabIG;
    }
    public void afficheAliIG(String[] tabAli, int[] tabIG) {
        for (int i = 0; i < tabAli.length; i++) {
            System.out.println("l’aliment " + tabAli[i] + " a un IG de " + tabIG[i]);
        }
    }


   // Pŕe-requis : tabAli contient des noms d’aliments et tabIG les IG de ces aliments
// Pour l’exemple ci-dessus, si limiteIG vaut 70, la fonction peut retourner
// "baguette de pain", "carottes cuites" ou "sucre de canne".
// Ŕesultat : retourne le nom d’un aliment de tabAli dont l’IG est supérieur ou égal a`limiteIG si un tel aliment existe, et le mot "aucun" sinon.
    public void attentionDiabete(String[] tabAli, int[] tabIG){
        int limitIG = 70;
        for (int i = 0; i < tabIG.length ; i++) {
            if (limitIG <= tabIG[i]) {
                System.out.println(tabAli[i]);
            }
            else System.out.println("aucun");
        }
    }

   // fonction copieTabEntier (tab : tableau d’entiers) retourne tableau d’entiers
// Pr ́e-requis : aucun
// Re ́sultat : retourne un tableau contenant les m^emes valeurs que tab dans le me^me ordre // et inde ́pendant de tab (la modification d’un des 2 tableaux ne modifie pas l’autre).
    public void copieTabEntier(int[] tab){
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
        }
    }

   // fonction indiceDuMin (tab : tableau d’entiers) retourne entier
// Pre ́-requis : tab.longueur > 0
// Re ́sultat : retourne l’indice de tab donnant la valeur minimum du tableau. // Exemple : si tab = [80, 55, 40, 50, 121, 85, 70], alors la fonction
// retourne 2 car la valeur minimum de tab est 40, d’indice 2.
    public int fonctionIndiceDuMin(int[] tab){
        int min = tab[0];
        int indice = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
                indice = i;
            }
        }
        return indice;
    }
   // fonction numAliEnOrdre (tabIG : tableau d’entiers) retourne tableau d’entiers
// Pr´e-requis : pour tout indice i de tabIG, tabIG[i] est l’IG de l’aliment num´ero i.
// R´esultat : retourne un tableau contenant les num´eros des aliments en ordre
// croissant d’IG (sans modifier le tableau tabIG).
// Pour l’exemple ci-dessus, la fonction retourne [4, 2, 3, 1, 6, 0, 5] car
// tabIG[4] <= tabIG[2] <= tabIG[3] <= tabIG[1] <= tabIG[6] <= tabIG[0] <= tabIG[5].
// Strat´egie : celle conseill´ee `a M. Dubitatif par l’´etudiant de l’IUT info.

    public int[] numAliEnOrdre(int[] tabIG){
        int[] tab = new int[tabIG.length];
        for (int i = 0; i < tabIG.length; i++) {
            tab[i] = fonctionIndiceDuMin(tabIG);
        }
        return tab;
    }

    // Pr´e-requis : tabAli contient des noms d’aliments, tabIG les IG de ces aliments,
// tabNum des num´eros d’aliments (indices de tabAli)
// et 0 <= k <= tabNum.longueur.
// Action : affiche les noms et IG des aliments de tabAli dont les num´eros
// sont les k derni`eres valeurs de tabNum.
// Pour l’exemple ci-dessus, si tabNum = [1, 3, 0, 5] et k = 2, la fonction affiche :
// l’aliment baguette de pain a un IG de 80
// l’aliment carottes cuites a un IG de 85

    public void afficheKAliIG(String[] tabAli, int[] tabIG, int k) {
        int[] tabNum = new int[tabAli.length];
        for (int i = 0; i < tabAli.length; i++) {
            tabNum[i] = fonctionIndiceDuMin(tabIG);
        }
        for (int i = 0; i < k; i++) {
            System.out.println("l’aliment " + tabAli[tabNum[i]] + " a un IG de " + tabIG[tabNum[i]]);
        }
    }

// Pr´e-requis : tabAli contient des noms d’aliments, tabIG les IG de ces aliments
// et 0 <= k <= tabAli.longueur.
// Action : affiche les noms et les IG de k aliments de tabAli avec le plus fort IG
// (sans modifier les tableaux tabAli et tabIG).
    public void attentionDiabete2(String[] tabAli, int[] tabIG, int k){

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.tabAli();
        main.tabIG();
        main.attentionDiabete(main.tabAli(), main.tabIG());
        main.copieTabEntier(main.tabIG());
        main.fonctionIndiceDuMin(main.tabIG());
        main.numAliEnOrdre(main.tabIG());
        main.afficheKAliIG(main.tabAli(), main.tabIG(), 2);
    }
}