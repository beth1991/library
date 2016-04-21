package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
           when: "A library has a location and opening hours"

	def library = new Library(location:'City Campus',
				openingHours: '0900hrs to 1900hrs')
	then: "the toString method will merge them."
	
	library.toString()=="City Campus,0900hrs to 1900hrs"
    }
}
