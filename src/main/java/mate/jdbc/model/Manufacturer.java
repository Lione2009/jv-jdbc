package mate.jdbc.model;

import java.util.Objects;

public class Manufacturer {
    private Long id;
    private String name;
    private String country;

    public Manufacturer(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name)
                && Objects.equals(country, that.country);
    }
}
