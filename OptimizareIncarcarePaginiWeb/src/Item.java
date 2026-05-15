public class Item {
    private String tip;
    private String continut;
    private String stil;

    public Item(String tip, String continut, String stil) {
        this.tip = tip;
        this.continut = continut;
        this.stil = stil;
    }

    public String getTip() {
        return tip;
    }

    public String getContinut() {
        return continut;
    }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", continut='").append(continut).append('\'');
        sb.append(", stil='").append(stil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
