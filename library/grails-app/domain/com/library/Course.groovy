package com.library

class Course {

	String title

	String code

	String tutor

	String department

	Date startDate

	Date endDate

	String Description

String toString(){
	"$title,$code,$department"
}
 
    static constraints = {

	title()
	
	code()

	tutor()

	department()
	
	startDate()

	endDate()

	description maxSize:5000

	
    }
}
