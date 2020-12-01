/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/weather")
public class WeatherController {

    @GetMapping("/city")
    public @ResponseBody
    Weather getWeatherForCity(@RequestParam("name") String cityName) {
        Weather res = new Weather();
        res.setCity(cityName);
        res.setDescription("partly cloudy");
        res.setIcon("weather-pouring");
        return res;
    }

    @GetMapping("/hello")
    public @ResponseBody
    String hello() {
        return "hello";
    }
}
