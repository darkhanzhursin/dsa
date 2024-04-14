package miu.mpp.lab9_attendee;

import miu.mpp.lab9_attendee.attendees.FullAttendee;
import miu.mpp.lab9_attendee.attendees.SelectiveAttendee;
import miu.mpp.lab9_attendee.sessions.Session;

public class Application {

    public static void main(String[] args) {
        Conference conference = new Conference("Conference #1");
        SelectiveAttendee john = new SelectiveAttendee("John", "4th St.");
        john.addSession(new Session("How to Do Less and Accomplish More through Abstraction", 750));
        john.addSession(new Session("The 3 Amigos Explain All", 1200));
        john.addSession(new Session("FOOP for Managers", 450));
        FullAttendee ann = new FullAttendee("Anna", "1th St.", conference);
        conference.addAttendee(ann);
        conference.addAttendee(john);
        System.out.println(conference.getTotalPayments());
        System.out.println(conference.getFullFee());
    }
}
