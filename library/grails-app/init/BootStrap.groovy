import com.library.*
class BootStrap {

    def init = { servletContext ->

	def course1 = new Course(title:'Web Systems Design',

	code:'WSD101',

	tutor:'James Jeje',

	department:'Computing',

	startDate:new Date('16/02/2016'),

	endDate:new Date('19/02/2020'),

	description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus,te summo senserit vix, mel reque corpora vulputate ei.''').save()

	def course2 = new Course(title:'Games Software Design',

	code:'GSD401',

	tutor:'Jane Smith',

	department:'Computing',

	startDate:new Date('16/04/2016'),

	endDate:new Date('19/04/2020'),

	description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus,te summo senserit vix, mel reque corpora vulputate ei.''').save()

	def course3 = new Course(title:'Interactive Media with Animation',

	code:'IMA632',

	tutor:'Joe Jojo',

	department:'Computing',

	startDate:new Date('15/09/2016'),

	endDate:new Date('19/09/2020'),

	description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus,te summo senserit vix, mel reque corpora vulputate ei.''').save()
    }
    def destroy = {
    }
}
