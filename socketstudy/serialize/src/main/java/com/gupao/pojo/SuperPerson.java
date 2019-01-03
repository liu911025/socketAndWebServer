package com.gupao.pojo;

/**
 * Created by liujiatai on 2018/12/25.
 */
public class SuperPerson extends Person {

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "SuperPerson{" +
                "skill='" + skill + '\'' +
                '}';
    }

    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
