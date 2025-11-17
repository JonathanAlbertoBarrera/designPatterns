public class ThreadSafeSingleton {
    
    private volatile static ThreadSafeSingleton unicaInstancia;

    private ThreadSafeSingleton(){

    };

    public static ThreadSafeSingleton getInstanciaTread(){

        if(unicaInstancia==null){

            synchronized(ThreadSafeSingleton.class){
                if(unicaInstancia==null){
                    unicaInstancia=new ThreadSafeSingleton();
                }
            }
            
        }
        return unicaInstancia;
    }
}
