package bbs.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

@WebListener
public class ContextListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 애플리케이션 시작 시 실행할 코드 (필요시)
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 애플리케이션 종료 시 MySQL Cleanup Thread 정리
        try {
            AbandonedConnectionCleanupThread.checkedShutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}