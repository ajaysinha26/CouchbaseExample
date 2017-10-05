package com.sinhaj.item.cache.config;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CouchbaseConfig {

    @Value("${couchbase.hostname}")
    private String hostname;

    @Value("${couchbase.bucket}")
    private String bucket;

    @Bean
    public Cluster cluster() {
        return CouchbaseCluster.create(hostname);
    }

    @Bean
    public Bucket bucket() {
        return cluster().openBucket(bucket);
    }
}
