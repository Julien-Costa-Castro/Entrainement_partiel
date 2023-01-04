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



    public static void main(String[] args) {
        Main main = new Main();
        main.tabAli();
        main.tabIG();
        main.attentionDiabete(main.tabAli(), main.tabIG());
        main.copieTabEntier(main.tabIG());
        main.fonctionIndiceDuMin(main.tabIG());
    }
}