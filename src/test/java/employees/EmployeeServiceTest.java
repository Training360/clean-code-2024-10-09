package employees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;


class EmployeeServiceTest {

    @Test
    void list() {
        var employees = List.of(new Employee(1L, "John Doe", 1980),
                new Employee(2L, "Jane Doe", 1990));

        assertThat(employees)
                .extracting(Employee::getName, Employee::getYear)
                .containsExactly(
                        tuple("John Doe", 1980), tuple("Jane Doe", 1990));
    }

    public void assertEmployeeHasTwoItems() {
        // Hozzáad egyet
//        i = i + 2;
    }
}
