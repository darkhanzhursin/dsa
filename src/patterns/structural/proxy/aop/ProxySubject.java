package patterns.structural.proxy.aop;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void m() {
        subject.m();
    }
}
