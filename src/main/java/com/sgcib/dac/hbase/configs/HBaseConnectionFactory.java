
package com.sgcib.dac.hbase.configs;

import org.apache.hadoop.hbase.client.Connection;

import javax.security.auth.login.LoginException;
import java.io.IOException;

@FunctionalInterface
public interface HBaseConnectionFactory {
    Connection connect() throws IOException, LoginException;
}
