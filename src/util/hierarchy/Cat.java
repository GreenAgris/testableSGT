package util.hierarchy;

public class Cat extends Animal{
    //created by Everita

    private boolean isDomesticated;
    private String breed;
    private String furColour;

    public Cat(boolean isDomesticated, String breed, String furColour) {
        this.isDomesticated = isDomesticated;
        this.breed = breed;
        this.furColour = furColour;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public String getBreed() {
        return breed;
    }

    public String getFurColour() {
        return furColour;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    @Override
    public String makeSound() {
        return "Meowww...";
    }

    @Override
    public String toString() {
        return "Cat {" +
                "isDomesticated=" + isDomesticated +
                ", breed: " + breed +
                ", furColour: " + furColour +
                '}';
    }
}
