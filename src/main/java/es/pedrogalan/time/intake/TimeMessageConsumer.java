package es.pedrogalan.time.intake;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class TimeMessageConsumer {

    @StreamListener(Sink.INPUT)
    public void logTimeMessage(String message) {
        System.out.println(message);
    }
}
