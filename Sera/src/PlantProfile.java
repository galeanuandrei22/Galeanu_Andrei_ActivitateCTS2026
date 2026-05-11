public class PlantProfile {
    private String name;
    private int humidityThreshold;
    private int lightHours;
    private boolean needsFertilizer;

    private PlantProfile(Builder builder) {
        this.name = builder.name;
        this.humidityThreshold = builder.humidityThreshold;
        this.lightHours = builder.lightHours;
        this.needsFertilizer = builder.needsFertilizer;
    }

    public static class Builder {
        private String name;
        private int humidityThreshold = 50; // default
        private int lightHours = 12;        // default
        private boolean needsFertilizer = false;

        public Builder(String name) { this.name = name; }

        public Builder setHumidity(int h) {
            this.humidityThreshold = h;
            return this;
        }
        public Builder setLight(int l) {
            this.lightHours = l;
            return this;
        }
        public Builder withFertilizer() {
            this.needsFertilizer = true;
            return this;
        }

        public PlantProfile build() {
            return new PlantProfile(this);
        }
    }

    @Override
    public String toString() {
        return "Profil " + name + " umiditate > " + humidityThreshold + "%, lumina: " + lightHours + "h";
    }
}