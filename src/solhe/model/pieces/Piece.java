package solhe.model.pieces;

public abstract class Piece {
    protected String nom;
    protected String color;
    protected String imagePath;
    protected int[] position;
    protected boolean isAlive = true;
    protected int nbCoupsJoués = 0;

    public Piece(String nom, String color, String imagePath, int[] position) {
        this.nom = nom;
        this.color = color;
        this.imagePath = imagePath;
        this.position = position;
    }

    public abstract int[] capacitesDeplacement();

    public String getNom() {
        return nom;
    }

    public String getColor() {
        return color;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int[] getPosition() {
        return position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
