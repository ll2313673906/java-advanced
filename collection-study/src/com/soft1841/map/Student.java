package com.soft1841.map;

/**
 * author刘恋
 * 2019.3.19
 */

public class Student {

        private Integer studnetId;
        private String name;

        public Student(Integer studnetId, String name) {
            this.studnetId = studnetId;
            this.name = name;
        }

        public Student() {
        }

        public Integer getStudnetId() {
            return studnetId;
        }

        public void setStudnetId(Integer studnetId) {
            this.studnetId = studnetId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  studnetId +  "  " + name +"\n  ";
        }
    }
