public class review {
    private String name;
    private String bus;
    private int rate;

    public review(String n, String b, int r){
        name = n;
        bus = b;
        rate = r;
    }

    public String toString(){
        String out = "";

        out += name + ",";
        out += bus + ",";
        out += rate + "\n";
        out += "** ";
        if(rate == 5){
            out += "Highly Recommended";

        }
        else if (rate == 1){
            out += "Strongly Discouraged";
        }

        else{
            out += "Could be better";
        }

        return out;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
