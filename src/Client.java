
public class Client {
    public static void main(String[] args) {
        RaidDetector detector = new RaidDetector();
        GateController gates = new GateController();
        IronGolemSpawner spawner = new IronGolemSpawner();
        AlarmNotifier notifier = new AlarmNotifier();

        RaidDefenseFacade defenseFacade = new RaidDefenseFacade(detector, gates, spawner, notifier);

        defenseFacade.initiateEmergencyDefense();
    }
}