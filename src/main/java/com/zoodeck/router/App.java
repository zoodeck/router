package com.zoodeck.router;

import com.zoodeck.router.config.ConfigService;
import com.zoodeck.router.config.ConfigServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        logger.info("starting router...");
        ConfigService configService = ConfigServiceFactory.getConfigService();
        RouterWorker routerWorker = new RouterWorker(configService);
    }
}
