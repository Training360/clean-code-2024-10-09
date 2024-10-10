package booleanparameters;

import java.util.concurrent.Callable;

public class Contract {

    public Contract(boolean personal) {
    }

    public static Contract createPersonalContract() {
        return null;
    }

    public static void main(String[] args) {
        Contract.createPersonalContract();

//        new Contract(Type.PERSONAL, adoAzonositoJel = 1234);
//        new Contract(Type.FIRM, adoSzam = 9999);
//
//        Contract.createPersonal(null);
//        Contract.createFirm(9999)

    }
}
