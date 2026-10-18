
public class RaidDefenseFacade {
    private final RaidDetector raidDetector;
    private final GateController gateController;
    private final IronGolemSpawner golemSpawner;
    private final AlarmNotifier alarmNotifier;

    public RaidDefenseFacade(RaidDetector raidDetector,
                             GateController gateController,
                             IronGolemSpawner golemSpawner,
                             AlarmNotifier alarmNotifier) {
        this.raidDetector = raidDetector;
        this.gateController = gateController;
        this.golemSpawner = golemSpawner;
        this.alarmNotifier = alarmNotifier;
    }

    public void initiateEmergencyDefense() {
        System.out.println("Activating Village Emergency Defense Protocol");
        if (raidDetector.scanForRaiders()) {
            gateController.closeGates();
            alarmNotifier.ringBell();
            golemSpawner.spawnGolems(4);
            System.out.println("Village successfully transitioned to high alert combat mode");
        }
    }
}