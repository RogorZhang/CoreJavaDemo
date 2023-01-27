package org.example.day6;

public class Department {
    private String name;
    private String location;
    private String managerName;
    private Integer id;

    public Department(String name, String location, String managerName, Integer id) {
        this.name = name;
        this.location = location;
        this.managerName = managerName;
        this.id = id;
    }

    public static DepartmentBuilder builder() {
        return new DepartmentBuilder();
    }



    public static class DepartmentBuilder {
        private String name;
        private String location;
        private String managerName;
        private Integer id;

        public DepartmentBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public DepartmentBuilder setLocation(String location) {
            this.location = location;
            return this;
        }
        public DepartmentBuilder setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }
        public DepartmentBuilder setId(Integer id) {
            this.id = id;
            return this;
        }
        public Department build(){
            Department d = new Department(name, location, managerName, id);
            return d;
        }

    }
}
