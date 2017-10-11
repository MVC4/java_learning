public enum Singleton {
    INSTANCE;
    private Person instance;
    Singleton()
    {
        instance=new Person();
    }
    public Person getInstance()
    {
        return  instance;
    }
}
