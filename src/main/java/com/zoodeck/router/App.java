package com.zoodeck.router;

import com.zoodeck.common.config.ConfigService;
import com.zoodeck.common.config.ConfigServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static com.zoodeck.common.ConstantsService.*;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        logger.info("starting router...");

        Map<String, String> localEnv = new HashMap<>();
        localEnv.put(RABBIT_HOST, "localhost");
        localEnv.put(RABBIT_USER, "guest");
        localEnv.put(RABBIT_PASS, "guest");

        ConfigService configService = ConfigServiceFactory.getConfigService(localEnv);
        RouterWorker routerWorker = new RouterWorker(configService);
    }
}
