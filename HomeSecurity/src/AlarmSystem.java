public class AlarmSystem implements SecurityObserver {
    @Override
    public void update(String event) {
        System.out.println("sistemul de alarma este in alerta!");
    }
}
