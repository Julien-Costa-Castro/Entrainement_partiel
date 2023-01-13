public class Arbre {

    private int age;

    // Action : construit un arbre au moment de sa plantation
    public Arbre(){
        this.age = 0;
    }

    public String toString() {
// R´esultat : une cha^ıne de caract`eres de la forme  (^age de this) an 
// si l’^age de this est 0 ou 1, et  (^age de this) ans  sinon.
        if (this.age == 0 || this.age == 1) {
            return this.age + "an";
        } else return this.age + "ans";
    }

    public void passeAnnee(){
        // Action : augmente l’^age de this d’une ann´ee.
        this.age++;
    }

    public boolean ageDepasse(int limite){
        // R´esultat : vrai ssi l’^age de this est sup´erieur ou ´egal `a limite.m
        if (this.age >= limite){
            return true;
        }
        else return false;
    }
}
