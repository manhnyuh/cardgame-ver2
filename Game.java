import static java.lang.Math.random;

public class Game {
    public static void main(String[]args){

        int humanA;
        int humanB;
        int humanC;

        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();

        h1.setCard(1,6);
        h2.setCard(1,6);
        h3.setCard(1,6);

        humanA = h1.getCard();
        humanB = h2.getCard();
        humanC = h3.getCard();

        if (humanA>humanB && humanA > humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanA with "+humanA+" points is winner!");
        }else if (humanA>=humanB && humanA < humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanC with "+humanC+" points is winner!");
        }else if (humanA>=humanC && humanA < humanB){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanB with "+humanB+" points is winner!");
        }else if (humanA<=humanB && humanB < humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanC with "+humanC+" points is winner!");
        }else if (humanA<=humanB && humanB > humanC){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanB with "+humanB+" points is winner!");
        }else if (humanB==humanC && humanB < humanA){
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("humanA with "+humanA+" points is winner!");
        }else{
            System.out.println("humanA got " + humanA + "points," + " humanB got " + humanB + "points," + " humanC got " + humanC + "points");
            System.out.println("No winner.");
        }
    }
}
