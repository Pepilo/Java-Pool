public class Duet<T extends Comparable <T>>{

    public static <T extends Comparable <T>> T min(T par1, T par2){
        if (par1.compareTo(par2) < 0) {
            return par1;
        }
        else {
            return par2;
        }
    }

    public static <T extends Comparable <T>> T max(T par1, T par2){
        if (par1.compareTo(par2) < 0) {
            return par2;
        }
        else {
            return par1;
        }
    }
}

