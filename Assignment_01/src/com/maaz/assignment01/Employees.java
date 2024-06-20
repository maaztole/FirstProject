package com.maaz.assignment01;


/**
 * Base class for all employees.
 */
public class Employees {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employees(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

   public class Manager extends Employees {
        private String department;

        // Constructor
        public Manager(String name, int employeeId, double salary, String department) {
            super(name, employeeId, salary);
            this.department = department;
        }

        // Getter and setter methods for Manager-specific attribute
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
   }
   /**
    * Represents a developer, extending the Employees class.
    */
   public class Developer extends Employees {
       private String programmingLanguage;

       // Constructor
       public Developer(String name, int employeeId, double salary, String programmingLanguage) {
           super(name, employeeId, salary);
           this.programmingLanguage = programmingLanguage;
       }

       // Getter and setter methods for Developer-specific attribute
       public String getProgrammingLanguage() {
           return programmingLanguage;
       }

       public void setProgrammingLanguage(String programmingLanguage) {
           this.programmingLanguage = programmingLanguage;
       }
   }
   }











