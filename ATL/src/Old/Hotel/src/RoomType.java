public enum RoomType {
    STANDARD {
        @Override
        public void displayInfo() {
        }
    },
    SUITE {
        @Override
        public void displayInfo() {
        }
    },
    DELUXE{
        @Override
        public void displayInfo() {
        }
    };

    public abstract void displayInfo();
    }