package miu.mpp.lab5_library;

import java.util.Objects;

public class CD extends LendingItem {
    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CD cd = (CD) o;

        if (!Objects.equals(productId, cd.productId)) return false;
        if (!Objects.equals(title, cd.title)) return false;
        return Objects.equals(company, cd.company);
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }
}
