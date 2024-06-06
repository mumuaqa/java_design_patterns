public  class PenAdapter implements Pen {
    PilotPen pp=new PilotPen();
    @Override//用其他方法复写你的原来方法
    public void write(String str){
    pp.mark(str);
    }
}
