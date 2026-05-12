public class Main {
    public static void main(String[] args) {
        DataCollector collector = new SystemHealthCollector(new ConsoleDisplay());
        collector.collect();

        CpuMetric cpu = new CpuMetric();
        MetricVisitor alertSystem = new AlertVisitor();
        cpu.accept(alertSystem);

        DataSnapshot original = new DataSnapshot();
        original.addData("log 1");
        original.addData("log 2");

        DataSnapshot simulare = original.clone();
        simulare.addData("log simulare");

        System.out.println("original: "); original.show();
        System.out.println("simulare: "); simulare.show();
    }
}
