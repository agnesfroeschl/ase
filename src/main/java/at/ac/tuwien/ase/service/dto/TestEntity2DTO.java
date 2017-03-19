package at.ac.tuwien.ase.service.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the TestEntity2 entity.
 */
public class TestEntity2DTO implements Serializable {

    private Long id;

    private String testName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TestEntity2DTO testEntity2DTO = (TestEntity2DTO) o;

        if ( ! Objects.equals(id, testEntity2DTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TestEntity2DTO{" +
            "id=" + id +
            ", testName='" + testName + "'" +
            '}';
    }
}
