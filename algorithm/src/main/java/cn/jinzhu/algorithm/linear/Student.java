package cn.jinzhu.algorithm.linear;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    /*重写equals*/
    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return  false;
        }
        if(this == object) {
            return  true;
        }
        if(this.getClass() != object.getClass()) {
            return  false;
        }
        Student student = (Student)object;
        return  this.getClass().equals(student.getClass()); /*getclass 是获取运行时的信息*/
    }
}
