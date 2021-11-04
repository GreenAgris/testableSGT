package util.hierarchy;

public class Beaver extends Animal{
/*
CREATE TABLE Beaver (
	lengthForTeeth INTEGER NOT NULL,
	colourOfFur TEXT DEFAULT Brown,
	hasADam NUMERIC DEFAULT 0 NOT NULL,
	id INTEGER PRIMARY KEY AUTOINCREMENT
);

 */
    boolean hasADam;
    String colourOfFur;
    int lengthOfTeeth;

    public Beaver(boolean hasADam, String colourOfFur, int lengthOfTeeth) {
        this.hasADam = hasADam;
        this.colourOfFur = colourOfFur;
        this.lengthOfTeeth = lengthOfTeeth;
    }

    public Beaver(int age, boolean hasADam, String colourOfFur, int lengthOfTeeth) {
        super(age);
        this.hasADam = hasADam;
        this.colourOfFur = colourOfFur;
        this.lengthOfTeeth = lengthOfTeeth;
    }

    @Override
    public String makeSound() {
        return "splash splash";
    }

    public boolean isHasADam() {
        return hasADam;
    }

    public void setHasADam(boolean hasADam) {
        this.hasADam = hasADam;
    }

    public String getColourOfFur() {
        return colourOfFur;
    }

    public void setColourOfFur(String colourOfFur) {
        this.colourOfFur = colourOfFur;
    }

    public int getLengthOfTeeth() {
        return lengthOfTeeth;
    }

    public void setLengthOfTeeth(int lengthOfTeeth) {
        this.lengthOfTeeth = lengthOfTeeth;
    }
}
