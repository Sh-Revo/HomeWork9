import java.util.concurrent.*;


public interface Operation {

    static void sum(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a + b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void subtraction(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a - b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void multiplication(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a * b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void division(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a / b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void remainderOfDiv(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a % b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void comparison(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a == b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void chooseBiggestA(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a > b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void chooseBiggestB(double a, double b){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executorService.submit(() -> {
            System.out.println("Выполняется... ");
            TimeUnit.SECONDS.sleep(5);
            return a < b;
        });
        try {
            show(future.get());
        } catch (Exception e) {
            e.getMessage();
        }
        executorService.shutdown();
    }

    static void show(Object object) {
       new  Thread(()-> System.out.println("Ответ: " + object +
               "\nПолучен в потоке: " + Thread.currentThread().getName())).run();
   }
}
