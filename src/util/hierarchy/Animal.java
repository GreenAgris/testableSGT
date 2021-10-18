package util.hierarchy;

// created by Agris
public abstract class Animal {

    int age;
    double weightInKG;
    String eyeColor;
    protected int numberOfLegs;

    Animal() {
        age = 0;
    }

    Animal(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public abstract String makeSound();

}
