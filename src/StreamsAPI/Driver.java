package StreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(
                "Shahriar",
                "Ahmed",
                5000.00,
                List.of("Project-1", "project-2")
        ));

        employees.add(new Employee(
                "Laden",
                "Osama",
                6000.00,
                List.of("Project-3", "project-4")
        ));

        employees.add(new Employee(
                "Shimul",
                "Mahmud",
                5000.00,
                List.of("Project-5", "project-6")
        ));

        employees.add(new Employee(
                "Afif",
                "Al-Reza",
                5000.00,
                List.of("Project-7", "project-8")
        ));


        employees.stream(); //Changing the collection into stream it is not collection now but a stream object


        employees.stream().forEach(
                employee -> System.out.println(employee)
        );

        // Increments salary by 10%
        List<Employee> increasedSalary = employees.stream().map(employee -> new Employee(
                 employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary()*1.10,
                employee.getProjects()
        ))
                .collect(Collectors.toList());


        List<Employee> particularEmployees = increasedSalary
                .stream()
                .filter(employee -> employee
                        .getSalary() > 5000.00)
                .map(employee -> new Employee(
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getSalary(),
                    employee.getProjects()
        ))
                .collect(Collectors.toList());

        particularEmployees.stream().forEach(particularEmployee->
                        System.out.println(particularEmployee)
                );

        //Flatening
        // Converting every employees list of projects into a single string variable
        String projects = employees
                            .stream()
                            .map(employee -> employee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));

        System.out.println(projects);
        System.out.println("---------------------------------------------------------------------------------");
        //Short circuit
        // Skip the first one, takes next two and skip rests
       List<Employee> shortCircuited = employees.stream().skip(1).limit(2).collect(Collectors.toList());

       shortCircuited
               .stream()
               .forEach(shortCircuitedEmployees->
                       System.out.println(shortCircuitedEmployees)
               );

       // Sorting
        List<Employee> sorted = employees.stream().sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName())).collect(Collectors.toList());
        System.out.println(sorted);

        //Get maximum
        Optional<Employee> maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalary.get());

        Double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);

        // .mapToDouble() converts the stream into a stream of Double
        // Employee::getSalary indicates the getSalary method of Employee class like (Integer::doubleValue)
        // doubleValue method of Integer class


        Stream<Integer> numbers = Stream.of(5, 3, 8, 2, 7);
        int max = numbers.reduce(Integer.MIN_VALUE, (acc, x) -> Integer.max(acc, x));
        System.out.println("Maximum value: " + max);


    }
}
