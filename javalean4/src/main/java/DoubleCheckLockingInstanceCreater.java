public class DoubleCheckLockingInstanceCreater {
    private volatile Person instance = null;
    public Person getInstance() {
        if (instance == null) {
            synchronized(this) {
                if (instance == null)
                    instance = new Person();
            }
        }
        return instance;
    }
}

