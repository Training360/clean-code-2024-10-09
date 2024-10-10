package lamp;

public class AcceptCommand implements Command {

    @Override
    public void apply(Query query) {
        query.setAccepted(true);
    }
}
