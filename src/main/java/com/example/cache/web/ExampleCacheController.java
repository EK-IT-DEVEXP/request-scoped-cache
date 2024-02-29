package com.example.cache.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/example")
@AllArgsConstructor
public class ExampleCacheController {

    private final CacheManager cacheManager;

    @GetMapping("/cache-names")
    public Collection<String> getCacheNames() {
        return cacheManager.getCacheNames();
    }

    @GetMapping("/cache/{name}")
    public Cache getCache(@PathVariable String name) {
        return cacheManager.getCache(name);
    }

}
