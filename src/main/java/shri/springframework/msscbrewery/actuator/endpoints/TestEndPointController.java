package shri.springframework.msscbrewery.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestControllerEndpoint(id = "myendpoint")
public class TestEndPointController {

    @GetMapping("/")
    public @ResponseBody
    ResponseEntity<String> customGetEndPoint() {
        return new ResponseEntity<String>("REST end point - GET", HttpStatus.OK);
    }

    @GetMapping("/{selector}")
    public @ResponseBody ResponseEntity<String> customGetEndPoint(@PathVariable String selector) {
        return new ResponseEntity<String>("REST end point - GET " + selector, HttpStatus.OK);
    }

    @PostMapping("/{selector}")
    public @ResponseBody ResponseEntity<String> customPostEndPoint(@PathVariable String selector) {
        return new ResponseEntity<String>("REST end point - POST " + selector, HttpStatus.OK);
    }

    @DeleteMapping("/{selector}")
    public @ResponseBody ResponseEntity<String> customDeleteEndPoint(@PathVariable String selector) {
        return new ResponseEntity<String>("REST end point - DELETE " + selector, HttpStatus.OK);
    }
}
