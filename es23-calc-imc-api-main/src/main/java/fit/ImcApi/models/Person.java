package fit.ImcApi.models;


import com.fasterxml.jackson.annotation.*;


@JsonIgnoreProperties(allowGetters= true)
public class Person {
    
    @JsonProperty("height")
    private double height;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("imc")
    private double imc;
    @JsonProperty("imcDescription")
    private String imcDescription;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getImcDescription() {
        return imcDescription;
    }

    public void setImcDescription(String imcDescription) {
        this.imcDescription = imcDescription;
    }

    public Person(double height, double weight, double imc, String imcDescription) {
        this.height = height;
        this.weight = weight;
        this.imc = imc;
        this.imcDescription = imcDescription;
    }
}
