package fpp.homeworks.lesson8.prob3;

import java.util.Objects;

public class Marketing {

    private String employeeName;
    private String prodcutName;
    private double salesAmount;

    public Marketing(String employeeName, String prodcutName, double salesAmount) {
        this.employeeName = employeeName;
        this.prodcutName = prodcutName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProdcutName() {
        return prodcutName;
    }

    public void setProdcutName(String prodcutName) {
        this.prodcutName = prodcutName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marketing marketing = (Marketing) o;

        if (salesAmount != marketing.salesAmount) return false;
        if (!Objects.equals(employeeName, marketing.employeeName))
            return false;
        return Objects.equals(prodcutName, marketing.prodcutName);
    }

    @Override
    public int hashCode() {
        int result = employeeName != null ? employeeName.hashCode() : 0;
        result = 31 * result + (prodcutName != null ? prodcutName.hashCode() : 0);
        result = (int) (31 * result + salesAmount);
        return result;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", prodcutName='" + prodcutName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }
}
