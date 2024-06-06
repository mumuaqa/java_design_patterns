public   class Book {
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    private int bid;
    private String bname;

    @Override
    public String toString() {
        return "bid="+bid+",books="+bname+"]";
    }
}
