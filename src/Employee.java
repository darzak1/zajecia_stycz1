public class Employee {

    String name;
    int age;
    int zarobki;

    public int getZarobki() {
        return zarobki;
    }

    public Employee(int zarobki) {
        this.zarobki = zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public Employee(String name, int age, int zarobki) {
        this.name = name;
        this.age = age;
        this.zarobki = zarobki;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Jestem pracownikiem o imieniu" + name + ", mam " + age + " lat/a" + ", zarabiam" + zarobki + "zł";
    }

    @Override
    public boolean equals(Object object) {

        Employee employee = (Employee) object;
        if (this.name.equals(employee.name) &&
                this.age == employee.age &&
                this.zarobki == employee.zarobki) {
            return true;
        }

        /*return this.name.equals(((Employee)object).name);*/
        return false;
    }

}

