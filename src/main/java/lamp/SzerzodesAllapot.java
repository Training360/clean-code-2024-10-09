package lamp;

import java.util.Arrays;

public enum SzerzodesAllapot {

    UJ {
        @Override
        public String uppercase() {
            return "NEW";
        }

        @Override
        public String kulcs() {
            return "u";
        }

        @Override
        public Command createCommand() {
            return new UjCommand();
        }
    }, JOVAHAGYOTT {
        @Override
        public String uppercase() {
            return "accepted";
        }

        @Override
        public String kulcs() {
            return "j";
        }

        @Override
        public Command createCommand() {
            return new JovahagyCommand();
        }
    };

    public abstract String uppercase();

    public abstract String kulcs();

    public abstract Command createCommand();

    public static SzerzodesAllapot of(String kulcs) {
        return Arrays.stream(values())
                .filter(v -> v.kulcs().equals(kulcs))
                .findAny().get();
    }
}
