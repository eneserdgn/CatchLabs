package utils;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventHandler;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.TestStepStarted;

public class StepDetails implements ConcurrentEventListener {
    private static final ThreadLocal<String> stepName = new ThreadLocal<>();

    private final EventHandler<TestStepStarted> stepHandler = this::handleTestStepStarted;

    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestStepStarted.class, stepHandler);
    }

    public void handleTestStepStarted(TestStepStarted event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep testStep = (PickleStepTestStep) event.getTestStep();
            stepName.set(testStep.getStep().getText());
        }
    }

    public static String getStepName() {
        return stepName.get();
    }

    public static void clearStepName() {
        stepName.remove();
    }
}
