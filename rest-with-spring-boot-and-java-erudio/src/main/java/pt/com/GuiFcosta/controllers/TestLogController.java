package pt.com.GuiFcosta.controllers;

import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/v1")
public class TestLogController {
    private Logger log = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog() {
        log.debug("This is an DEBUG log");
        log.info("This is an INFO log");
        log.warn("This is a WARN log");
        log.error("This is an ERROR log");
        return "logs working";
    }
}
