package com.boot;

import com.boot.beans.Room;
import com.boot.beans.Student;
import com.boot.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.registerShutdownHook();

        Student student = new Student();
        student.setName("Noto");
        Room room = context.getBean(Room.class);
        room.studentOfRoom(student);
        context.close();

    }
}