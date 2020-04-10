package solhe.model.pieces;

public class Pion  extends Piece {

    public Pion(String nom, String color, String imagePath, int[] position) {
        super(nom, color, imagePath, position);
    }

    @Override
    public int[] capacitesDeplacement() {
        // TODO avant +2 premier coup
        // avant +1

        //arriere + 1

        //TODO diagonale av gauche pour manger

        //TODO diagonale av droite pour manger

        //TODO diagonale arr gauche pour manger

        //TODO diagonale arr droite pour manger

        return position;
    }


}
