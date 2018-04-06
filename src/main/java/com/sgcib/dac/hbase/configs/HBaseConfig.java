
package com.sgcib.dac.hbase.configs;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;

@Configuration
public class HBaseConfig {


    @Bean
    public HBaseConnectionFactory hBaseFactory() {
        return () -> Hbase.newInstance().createConnection();
    }
}
