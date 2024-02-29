package com.example.cache.config;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyCacheManager implements CacheManager {

    private final Map<String, Cache> cache = new HashMap<>();

    public MyCacheManager() {
    }

    @Override
    public Cache getCache(String name) {
        return cache.computeIfAbsent(name, this::createCache);
    }

    @SuppressWarnings("WeakerAccess")
    protected Cache createCache(String name) {
        return new ConcurrentMapCache(name);
    }

    @Override
    public Collection<String> getCacheNames() {
        return cache.keySet();
    }

    public void clearCaches() {
        cache.clear();
    }
}
