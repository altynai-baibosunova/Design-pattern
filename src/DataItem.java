public class DataItem implements CacheItem{
    private String key;
    private String value;

    public DataItem(String key, String value){
        this.key = key;
        this.value = value;
    }
    public String getKey(){
        return key;
    }
    public String getValue(){
        return value;
    }
    @Override
    public CacheItem cloneItem(){
        return new DataItem(this.key, this.value);
    }

}
