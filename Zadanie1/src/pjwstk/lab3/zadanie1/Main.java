/*
    Zadanie 1: Stworzenie klasy Employee z podanymi parametrami i metodami.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie1;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(0, "Marian", "Nowakowski", 1000);
        employee.raiseSalary(60);

        System.out.println(employee);
    }
}
