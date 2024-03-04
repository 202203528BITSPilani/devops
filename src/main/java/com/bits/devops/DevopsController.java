package com.bits.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    private final DevopService devopService;

    public DevopsController(DevopService devopService) {
        this.devopService = devopService;
    }

    @GetMapping("/devops/{name}")
    public Devops devops(@PathVariable String name) {
        return devopService.devops(name);
    }
}
