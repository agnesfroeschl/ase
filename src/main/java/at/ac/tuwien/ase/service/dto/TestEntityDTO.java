package at.ac.tuwien.ase.service.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TestEntity entity.
 */
public class TestEntityDTO implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TestEntityDTO testEntityDTO = (TestEntityDTO) o;

        if ( ! Objects.equals(id, testEntityDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TestEntityDTO{" +
            "id=" + id +
            '}';
    }
}
