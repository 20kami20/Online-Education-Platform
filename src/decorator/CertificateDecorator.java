package decorator;

import model.Course;

public class CertificateDecorator extends CourseDecorator {
    private boolean certificateIssued = false;

    public CertificateDecorator(Course course) {
        super(course);
    }

    public void issueCertificate(String studentName) {
        if (!certificateIssued) {
            certificateIssued = true;
        }
    }
    @Override
    public void deliverContent(){
        if (!certificateIssued) {
            System.out.println("Certificate does not exist");
        }
        else{
            System.out.println("Certificate for :" + course.getTitle());
        }
    }

}
