package bbs.listener;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            AbandonedConnectionCleanupThread.checkedShutdown();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 필요 시 초기화 작업
    }
}
