package com.pezhmankasraee.student;

public class Student {
    private String studentId;
    private String studentName;
    private String fieldOfStudy;

    public Student(String studentId, String studentName, String fieldOfStudy) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
