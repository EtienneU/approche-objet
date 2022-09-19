package fr.diginamic.genericite;

public class GenericDuo<T1, T2> {

    //Variables d'instance de type T1 ou T2
    private T1 valueT1;
    private T2 valueT2;

    // Constructeur par defaut
    public GenericDuo() {
        this.valueT1 = null;
        this.valueT2 = null;
    }

    // Constructeur avec 2 parametres
    public GenericDuo(T1 value1, T2 value2) {
        this.valueT1 = value1;
        this.valueT2 = value2;
    }

    public T1 getValueT1() {
        return valueT1;
    }

    public T2 getValueT2() {
        return valueT2;
    }
}
