package employees;

/**
 * Egy alkalmazottat reprezentál.
 *
 * 2024-10-10 John Doe felvette a name mezőt.
 */
public class Employee {

    /**
     * Az alkalmazott id-ja.
     */
    private long id;

    private String name;

    private int year;

    public Employee(long id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    /**
     * Visszaadja az alkalmazott id-ját
     * @return
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * This method increment salary.
     */
    public void incrementSalary() {

    }
}
