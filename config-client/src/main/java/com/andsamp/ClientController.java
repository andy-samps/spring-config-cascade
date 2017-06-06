package com.andsamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by osboxes on 6/5/17.
 */

@RestController
@RefreshScope
@RequestMapping(value = "/client", produces = "application/json")
public class ClientController {

    @Value("${config-client.property:noval}")
    String propVal;

    @GetMapping
    public Map<String, String> getPropVal() {
        Map<String, String> output = new HashMap();

        output.put("propertyValue", propVal);

        return output;
    }
}
