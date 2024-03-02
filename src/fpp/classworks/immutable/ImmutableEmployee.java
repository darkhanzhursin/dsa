package fpp.classworks.immutable;

/*
   - Declare the class as final so it can't be extended.
   - Make all fields private so that direct access is not allowed.
   - Don't provide setter methods for variables
   - Make all mutable fields final so that it's value can be assigned only once.
   - Initialize all the fields via a constructor performing deep copy.
 */
final public class ImmutableEmployee {
    private final String name;
    private final double salary;

    public ImmutableEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}
