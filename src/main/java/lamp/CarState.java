package lamp;

public enum CarState {

    SI {
        @Override
        CarState e1() {
            return S1;
        }

        @Override
        CarState e2() {
            return S2;
        }
    }, S1, S2;

    CarState e1() {
        throw new IllegalStateException("invalid state: " + this);
    }

    CarState e2() {
        throw new IllegalStateException("invalid state: " + this);
    }
}
