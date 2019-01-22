package com.example.l2k.demo.dto;

import java.util.Objects;

/**
 * @author James Dunnam
 */
public class PersonDTO {
    private final String name;
    private final int age;
    private String nickName;

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonDTO() {
        this.name = "Fred";
        this.age = 101;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(getName(), personDTO.getName()) &&
               Objects.equals(getAge(), personDTO.getAge()) &&
               Objects.equals(getNickName(), personDTO.getNickName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getNickName());
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
               "name='" + name + '\'' +
               ", age='" + age + '\'' +
               ", nickName='" + nickName + '\'' +
               '}';
    }
}
