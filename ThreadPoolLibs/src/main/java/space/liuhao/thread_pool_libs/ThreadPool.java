package space.liuhao.thread_pool_libs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import space.liuhao.cpu_libs.Cpu;

/**
 * 线程池工具类
 *
 * @author 刘浩 2015-06-06 13:22:53
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public class ThreadPool implements I_ThreadPool {

    @Override
    public ExecutorService newThreadPool(int i) {
        return Executors.newFixedThreadPool(i);

    }

    @Override
    public ExecutorService newThreadPool() {
        return Executors.newFixedThreadPool(new Cpu().countCpuKernelNumber() * 2);
    }
}
