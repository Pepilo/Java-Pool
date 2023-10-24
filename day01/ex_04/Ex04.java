public class Ex04 {
    public static void printMovieFromNbr(int nbr) {
        switch(nbr) {
            case(3):
                System.out.println("The Three Brothers\n");
                break;
            case(6):
                System.out.println("The Sixth Sense\n");
                break;
            case(23):
                System.out.println("The Number 23\n");
                break;
            case(28):
                System.out.println("28 Days Later\n");
                break;
            default:
                System.out.println("I don't know.\n");
                break;
        }
    }
}

