package PACKAGE_NAME.TrafficLight;
//TrafficLight bir enaminiz olsun . +
//red yellow grean deyisenler yarat+
//ordaca deyerlerini menimset .
//private final String deye bir action yarat
//ve onun getter ve constructorunu yarat
//Main classinda cagirin for'dan isdifade ederek .


    public enum TraficLight {
        RED("stop"),
        YELLOW("ready"),
        GREEN("go");

        private final String action;

        TraficLight(String action) {
            this.action = action;
        }


        public String getAction() {
            return action;
        }
    }
