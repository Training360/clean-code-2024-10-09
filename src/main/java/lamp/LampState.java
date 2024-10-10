package lamp;

public enum LampState {

    RED {
        @Override
        public LampState next() {
            return GREEN;
        }
    }, GREEN {
        @Override
        public LampState next() {
            return RED;
        }
    };

    public abstract LampState next();




}
