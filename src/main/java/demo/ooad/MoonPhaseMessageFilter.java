package demo.ooad;

public class MoonPhaseMessageFilter implements MessageFilter {
    @Override
    public boolean filter(String message, SeverityLevel severity) {
        return false;
    }
}
