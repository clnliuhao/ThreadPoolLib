package space.liuhao.thread_pool_libs;

import java.util.concurrent.ExecutorService;

/**
 * 线程池接口定义
 *
 * @author 刘浩 2015-06-06 13:18:00
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public interface I_ThreadPool {
    /**
     * 创建一个有固定线程数的线程池
     * @param poolSize 固定的线程数
     * @return 一个有固定线程数的线程池
     */
    ExecutorService newThreadPool(int poolSize);
    /**
     * 创建一个线程数为Cpu核数两倍的线程池
     * @return 一个线程数为Cpu核数两倍的线程池
     */
    ExecutorService newThreadPool();
}
