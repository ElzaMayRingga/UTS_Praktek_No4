/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4;

/**
 *
 * @author ACER
 */
public class CourseDemo {


    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Shin Hye", "Park", "18012");
       
       TextBook myTextBook = new TextBook("Elementary Korean", "Ross King, Ph.D. & Jaehoon Yeon, Ph.D.", "Tuttle");
       
       Course myCourse = new Course("Korean Language Course", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}
