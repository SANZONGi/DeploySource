package top.sanzong.quictest.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SANZONG
 */
@RequestMapping("/api")
@RestController
public class QuicController {
    @PostMapping("/quic-test")
    public String quicTest() {
        return "test success";
    }
}
